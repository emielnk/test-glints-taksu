package com.testglints.test.services;

import org.springframework.stereotype.Service;

import com.testglints.test.dto.OrderRequestWsDTO;
import com.testglints.test.dto.OrderSummaryWsDTO;
import com.testglints.test.model.EvoucherModel;
import com.testglints.test.model.OrderModel;
import com.testglints.test.model.ProductModel;
import com.testglints.test.model.UserModel;
import com.testglints.test.repository.BuyTypeRepository;
import com.testglints.test.repository.EvoucherModelRepository;
import com.testglints.test.repository.OrderRepository;
import com.testglints.test.repository.PaymentMethodRepository;
import com.testglints.test.repository.ProductRepository;
import com.testglints.test.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CommonService {

    @Autowired
    public EvoucherModelRepository voucherRepository;

    @Autowired
    public PaymentMethodRepository paymentRepository;

    @Autowired
    public BuyTypeRepository buyTypeRepository;

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public ProductRepository productRepository;

    @Autowired
    public OrderRepository orderRepository;

    public static final String ACTIVE = "VOUCHER AKTIF";

    public static final String NON_ACTIVE = "VOUCHER TIDAK AKTIF";

    public static final String ORDER_PLACED = "ORDERPLACED";

    public static final String PAYMENT_NO = "NOPAYMENT";

    public String getVoucherStatus(final String voucherCode) {
        EvoucherModel voucher = voucherRepository.getVoucherByCode(voucherCode);
        if(!voucher.equals(null)) {
            return voucher.getStatus().equals(0) ? NON_ACTIVE : ACTIVE;
        }
        else {
            return "Voucher Dengan Kode "+voucherCode+" Tidak Ditemukan";
        }
    }

    public OrderSummaryWsDTO checkout(OrderRequestWsDTO request) {
        OrderModel order = new OrderModel();
        order.setUserId(request.getUserId());
        order.setProductId(request.getProductId());
        order.setPaymentId(request.getPaymentId());
        order.setOrderStatus(ORDER_PLACED);
        order.setPaymentStatus(PAYMENT_NO);
        order.setPayAmount(request.getPayAmount());
        order.setTotalPayment(request.getPayAmount());
        if(null != request.getVoucherId()) {
            order.setVoucherId(request.getVoucherId());
            EvoucherModel voucher = voucherRepository.getVoucherById(request.getVoucherId());
            Integer total = request.getPayAmount() - voucher.getAmount();
            order.setTotalPayment(total);
        }
        orderRepository.save(order);
        return createOrderSummary(order);
    }

    private OrderSummaryWsDTO createOrderSummary(OrderModel order) {
        OrderSummaryWsDTO orderSummaryDTO = new OrderSummaryWsDTO();
        UserModel user = userRepository.getUserById(order.getUserId());
        ProductModel product = productRepository.getProductById(order.getProductId());
        if(null != order.getVoucherId()) {
            EvoucherModel voucher = voucherRepository.getVoucherById(order.getVoucherId());
            orderSummaryDTO.setAppliedVoucher(voucher.getTitle());
        }
        orderSummaryDTO.setBuyer(user.getFullName());
        orderSummaryDTO.setBuyerEmail(user.getEmail());
        orderSummaryDTO.setBuyerPhone(user.getPhoneNumber());
        orderSummaryDTO.setPaymentStatus(order.getPaymentStatus());
        orderSummaryDTO.setOrderStatus(order.getOrderStatus());
        orderSummaryDTO.setProduct(product.getName());
        orderSummaryDTO.setTotalPayment(order.getTotalPayment());
        return orderSummaryDTO;
    }
}
