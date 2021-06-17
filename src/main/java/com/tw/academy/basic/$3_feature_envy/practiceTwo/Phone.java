package com.tw.academy.basic.$3_feature_envy.practiceTwo;

public class Phone {
    public static final int PREFIX_END_INDEX = 6;
    public static final int PREFIX_BEGIN_INDEX = 3;
    public static final int NUMBER_BEGIN_INDEX = 6;
    public static final int NUMBER_END_INDEX = 10;
    private final String unformattedNumber;
    public Phone(String unformattedNumber) {
        this.unformattedNumber = unformattedNumber;
    }
    public String getAreaCode() {
        int areaCodeStartLocation = 0;
        int areaCodeEndLocation = 3;
        return unformattedNumber.substring(areaCodeStartLocation,areaCodeEndLocation);
    }
    public String getPrefix() {
        return unformattedNumber.substring(PREFIX_BEGIN_INDEX,PREFIX_END_INDEX);
    }
    public String getNumber() {
        return unformattedNumber.substring(NUMBER_BEGIN_INDEX, NUMBER_END_INDEX);
    }

    public String getMobilePhoneNumber() {
        String leftBracket = "(";
        String rightBracket = ")";
        String dash = "(";
        return leftBracket +
                this.getAreaCode() + rightBracket +
                this.getPrefix() + dash +
                this.getNumber();
    }
}
