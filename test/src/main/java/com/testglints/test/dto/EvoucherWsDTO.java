package com.testglints.test.dto;

import lombok.Data;

@Data
public class EvoucherWsDTO {

    private int id;

    private String title;

    private String description;

    private String expiryDate;

    private String image;

    private int amount;

    private String paymentMethod;

    private int quantity;

    private String buyType;

    private String status;

    private String code;

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public String getImage() {
        return image;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setBuyType(String buyType) {
        this.buyType = buyType;
    }
    
    public String getBuyType() {
        return buyType;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
    
}
