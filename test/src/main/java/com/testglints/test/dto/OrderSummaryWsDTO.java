package com.testglints.test.dto;

import lombok.Data;

@Data
public class OrderSummaryWsDTO {

    private String buyer;

    private String buyerEmail;

    private String buyerPhone;

    private String paymentStatus;

    private String orderStatus;

    private String product;

    private Integer totalPayment;

    private String appliedVoucher;

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Integer totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getAppliedVoucher() {
        return appliedVoucher;
    }

    public void setAppliedVoucher(String appliedVoucher) {
        this.appliedVoucher = appliedVoucher;
    }
    
}
