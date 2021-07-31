package com.testglints.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EvoucherModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String title;

    private String description;

    private String expiryDate;

    private String image;

    private int amount;

    private int paymentMethod;

    private int quantity;

    private int buyType;

    private Integer status;

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

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setBuyType(int buyType) {
        this.buyType = buyType;
    }
    
    public int getBuyType() {
        return buyType;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
}
