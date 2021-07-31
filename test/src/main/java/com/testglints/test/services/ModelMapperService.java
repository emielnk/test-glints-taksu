package com.testglints.test.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.testglints.test.dto.EvoucherWsDTO;
import com.testglints.test.dto.PaymentMethodWsDTO;
import com.testglints.test.model.BuyTypeModel;
import com.testglints.test.model.EvoucherModel;
import com.testglints.test.model.PaymentMethodModel;

@Service
public class ModelMapperService extends CommonService{

    public List<EvoucherWsDTO> mapListVoucherToDTO() {
        List<EvoucherWsDTO> vouchersDTO = new ArrayList<>();
        Iterable<EvoucherModel> vouchers = voucherRepository.findAll();
        for(EvoucherModel voucher : vouchers) {
            EvoucherWsDTO voucherDTO = mapToDTO(voucher);
            vouchersDTO.add(voucherDTO);
        }
        return vouchersDTO;
    }

    public EvoucherWsDTO mapVoucherToDTO(final int id) {
        EvoucherModel voucher = voucherRepository.getById(id);
        EvoucherWsDTO voucherDTO = mapToDTO(voucher);
        return voucherDTO;
    }

    public List<PaymentMethodWsDTO> getAllPayments() {
        List<PaymentMethodWsDTO> paymentsDTO =  new ArrayList<>();
        Iterable<PaymentMethodModel> payments = paymentRepository.findAll();
        for(PaymentMethodModel payment : payments) {
            PaymentMethodWsDTO paymentDTO = new PaymentMethodWsDTO();
            paymentDTO.setId(payment.getId());
            paymentDTO.setName(payment.getName());
            paymentsDTO.add(paymentDTO);
        }
        return paymentsDTO;
    }

    private EvoucherWsDTO mapToDTO(EvoucherModel voucher) {
        EvoucherWsDTO voucherDTO = new EvoucherWsDTO();
        voucherDTO.setId(voucher.getId());
        voucherDTO.setTitle(voucher.getTitle());
        voucherDTO.setDescription(voucher.getDescription());
        voucherDTO.setAmount(voucher.getAmount());
        voucherDTO.setExpiryDate(voucher.getExpiryDate());
        voucherDTO.setCode(voucher.getCode());
        voucherDTO.setStatus(voucher.getStatus().equals(0)?  NON_ACTIVE :ACTIVE);
        // voucherDTO.setImage(voucher.getImage());
        voucherDTO.setQuantity(voucher.getQuantity());
        PaymentMethodModel payment = paymentRepository.getPaymentMethodById(voucher.getId());
        BuyTypeModel buyType = buyTypeRepository.getBuyTypeById(voucher.getBuyType());
        voucherDTO.setPaymentMethod(payment.getName());
        voucherDTO.setBuyType(buyType.getName());
        return voucherDTO;
    }
    
}
