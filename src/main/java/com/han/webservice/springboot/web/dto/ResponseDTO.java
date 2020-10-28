package com.han.webservice.springboot.web.dto;

public class ResponseDTO {

    private String name;
    private int amount;

    public ResponseDTO(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return this.name;
    }

    public int getAmount() {
        return this.amount;
    }
}
