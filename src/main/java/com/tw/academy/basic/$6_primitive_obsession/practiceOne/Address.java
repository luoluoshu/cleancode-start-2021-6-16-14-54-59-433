package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class Address {
    private final String address;

    public Address(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.address.substring(this.address.indexOf("省") + 1, this.address.indexOf("市"));
    }

    public String getProvince() {
        return this.address.substring(0, this.address.indexOf("省"));
    }

    public boolean isSameProvince(Address compareAddress) {
        return this.getProvince().equals(compareAddress.getProvince());
    }

    public boolean isSameCity(Address compareAddress) {
        return this.getCity().equals(compareAddress.getCity());
    }
}
