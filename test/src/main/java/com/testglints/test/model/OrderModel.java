package com.testglints.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer voucherId;

    private Integer paymentId;

    private Integer totalPayment;

    private String orderStatus;

    private String paymentStatus;

    private Integer payAmount;

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer user_id) {
        this.userId = user_id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer product_id) {
        this.productId = product_id;
    }

    public Integer getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Integer voucher_id) {
        this.voucherId = voucher_id;
    }

    public Integer getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Integer total_payment) {
        this.totalPayment = total_payment;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer payment_id) {
        this.paymentId = payment_id;
    }
    
}
