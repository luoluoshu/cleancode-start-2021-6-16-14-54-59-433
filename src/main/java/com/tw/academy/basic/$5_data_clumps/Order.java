package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;
    private User buyer;


    public Order(int orderNumber, User user) {
        this.orderNumber = orderNumber;
        String buyRole = "buyer";
        this.buyer = user;

    }

    public String confirm(){
        return buyer.confirm("buyer");
    }
}

