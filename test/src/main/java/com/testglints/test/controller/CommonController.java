package com.testglints.test.controller;

import com.testglints.test.dto.EvoucherWsDTO;
import com.testglints.test.dto.OrderRequestWsDTO;
import com.testglints.test.dto.OrderSummaryWsDTO;
import com.testglints.test.dto.PaymentMethodWsDTO;
import com.testglints.test.services.CommonService;
import com.testglints.test.services.ModelMapperService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(path="/test/app")
public class CommonController {

    @Autowired
    private CommonService commonService;
    
    @Autowired
    private ModelMapperService voucherDTOMapper;

    @RequestMapping(value="/vouchers", method = RequestMethod.GET)
    @ResponseBody
    public List<EvoucherWsDTO> getAllVoucher() {
        return voucherDTOMapper.mapListVoucherToDTO();
    }

    @RequestMapping(value="/voucher/{voucherId}", method = RequestMethod.GET)
    @ResponseBody
    public EvoucherWsDTO getVoucherById(@PathVariable final int voucherId) {
        return voucherDTOMapper.mapVoucherToDTO(voucherId);
    }

    @RequestMapping(value="/payments", method = RequestMethod.GET)
    @ResponseBody
    public List<PaymentMethodWsDTO> getAllPayment() {
        return voucherDTOMapper.getAllPayments();
    }

    @RequestMapping(value="/checkvoucherstatus/{voucherCode}", method = RequestMethod.GET)
    @ResponseBody
    public String getVoucherCode(@PathVariable final String voucherCode) {
        return commonService.getVoucherStatus(voucherCode);
    }

    @RequestMapping(value="/checkout", method = RequestMethod.POST)
    @ResponseBody
    public OrderSummaryWsDTO checkoutOrder(@RequestBody OrderRequestWsDTO orderRequest) {
        return commonService.checkout(orderRequest);
    }
}
