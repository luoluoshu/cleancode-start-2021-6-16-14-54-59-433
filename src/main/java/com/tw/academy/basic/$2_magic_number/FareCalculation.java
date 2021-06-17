package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {
    static final int cumulativeExpensesThisMonthRange100 = 100;
    static final int cumulativeExpensesThisMonthRange150 = 150;
    static final int cumulativeExpensesThisMonthRange400 = 400;
    static final double originalPriceCutNumber1 = 0.5;
    static final double originalPriceCutNumber2 = 0.8;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= cumulativeExpensesThisMonthRange100 && cumulativeExpensesThisMonth < cumulativeExpensesThisMonthRange150) {
            return originalPrice * originalPriceCutNumber1;
        }
        if (cumulativeExpensesThisMonth >= cumulativeExpensesThisMonthRange150 && cumulativeExpensesThisMonth < cumulativeExpensesThisMonthRange400) {
            return originalPrice * originalPriceCutNumber2;
        }
        return originalPrice;
    }
}
