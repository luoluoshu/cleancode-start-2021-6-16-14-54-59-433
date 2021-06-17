package com.tw.academy.basic.$5_data_clumps;

public class User {
    private String name;
    private String phoneNumber;
    private String address;

    public User(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String confirm(String userRole){
        return String.format("Please confirm %s information: %s name is %s, %s phone number is %s and %s address is %s.\n"
                ,userRole
                ,userRole
                ,this.name
                ,userRole
                , this.phoneNumber
                ,userRole
                , this.address);
    }
}
