package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    String toAddress;
    String fromAddress;

    private Address from;
    private Address to;

    public DeliveryManager(String fromAddress, String toAddress) {
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;

        this.from = new Address(fromAddress);
        this.to = new Address(toAddress);
    }

    public DeliverCenter allocate(){
        if (to.isSameProvince(from) && to.isSameCity(from)){
            return DeliverCenter.LOCAL;
        }
        if (to.isSameProvince(from)) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

}
