package com.tw.academy.basic.$5_data_clumps;

public class Parcel {
    private String size;
    private Double weight;

    private User receiverUser;
    private User senderUser;


    public Parcel(String size, Double weight,
                  User receiverUser,User sender) {
        this.size = size;
        this.weight = weight;
        this.receiverUser = receiverUser;
        this.senderUser = sender;
    }

    public String confirmReceiver(){
        final String receiver = "receiver";
        return receiverUser.confirm(receiver);
    }

    public String confirmSender(){
        final String sender = "sender";
        return senderUser.confirm(sender);
    }
}
