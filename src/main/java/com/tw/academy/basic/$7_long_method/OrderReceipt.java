package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private static final String PRINTING_ORDERS_HEARD = "======Printing Orders======\n";
    private static final double TAX_RATE = .10;
    private static final String SALES_TAX_STRING = "Sales Tax";
    private static final String TOTAL_AMOUNT_STRING = "Total Amount";
    private static final char TAB_CHAR = '\t';
    private static final char LINE_BREAK_CHAR = '\n';
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder output = new StringBuilder();

        output.append(PRINTING_ORDERS_HEARD);

        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());

        // prints lineItems
        double totSalesTax = 0d;
        double totalAmount = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append(TAB_CHAR);
            output.append(lineItem.getPrice());
            output.append(TAB_CHAR);
            output.append(lineItem.getQuantity());
            output.append(TAB_CHAR);
            output.append(lineItem.totalAmount());
            output.append(LINE_BREAK_CHAR);

            // calculate sales tax @ rate of 10%
            double salesTax = lineItem.totalAmount() * TAX_RATE;
            totSalesTax += salesTax;

            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            totalAmount += lineItem.totalAmount() + salesTax;
        }

        output.append(SALES_TAX_STRING).append(TAB_CHAR).append(totSalesTax);

        output.append(TOTAL_AMOUNT_STRING).append(TAB_CHAR).append(totalAmount);
        return output.toString();
    }
}