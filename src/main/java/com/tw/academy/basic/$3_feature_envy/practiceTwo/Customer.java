package com.tw.academy.basic.$3_feature_envy.practiceTwo;

public class Customer {
    private final Phone mobilePhone;

    public Customer(Phone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getMobilePhoneNumber() {
        return mobilePhone.getMobilePhoneNumber();
    }
}
