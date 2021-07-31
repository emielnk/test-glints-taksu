package com.testglints.test.dto;

import lombok.Data;

@Data
public class PaymentMethodWsDTO {
    private int id;

    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
