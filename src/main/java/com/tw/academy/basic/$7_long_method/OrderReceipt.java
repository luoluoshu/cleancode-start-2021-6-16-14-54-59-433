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
    private static final String SALES_TAX_STRING = "Sales Tax";
    private static final String TOTAL_AMOUNT_STRING = "Total Amount";
    private static final char TAB_CHAR = '\t';
    private static final char LINE_BREAK_CHAR = '\n';
    private final Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder orderReceiptContent = new StringBuilder();

        getReceiptHeader(orderReceiptContent);

        // prints lineItems
        double totSalesTax = 0d;
        double totalLineItemAmount = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            receiptAddLineItemContent(orderReceiptContent, lineItem);

            totSalesTax += lineItem.getSalesTax();

            totalLineItemAmount += lineItem.getTotalLineItemAmount();
        }
        receiptAppendContent(orderReceiptContent, SALES_TAX_STRING,TAB_CHAR);
        receiptAppendContent(orderReceiptContent, totSalesTax);

        receiptAppendContent(orderReceiptContent, TOTAL_AMOUNT_STRING,TAB_CHAR);
        receiptAppendContent(orderReceiptContent, totalLineItemAmount);
        return orderReceiptContent.toString();
    }

    public void receiptAddLineItemContent(StringBuilder orderReceiptContent, LineItem lineItem) {
        receiptAppendContent(orderReceiptContent, lineItem.getDescription(),TAB_CHAR);
        receiptAppendContent(orderReceiptContent, lineItem.getPrice(),TAB_CHAR);
        receiptAppendContent(orderReceiptContent, lineItem.getQuantity(),TAB_CHAR);
        receiptAppendContent(orderReceiptContent, lineItem.totalAmount(),LINE_BREAK_CHAR);
    }

    public void receiptAppendContent(StringBuilder orderReceiptContent, double content) {
        orderReceiptContent.append(content);
    }
    public void receiptAppendContent(StringBuilder orderReceiptContent, String content, char endSymbol) {
        orderReceiptContent.append(content);
        orderReceiptContent.append(endSymbol);
    }

    public void receiptAppendContent(StringBuilder orderReceiptContent, int content, char endSymbol) {
        orderReceiptContent.append(content);
        orderReceiptContent.append(endSymbol);
    }

    public void receiptAppendContent(StringBuilder orderReceiptContent, double content, char endSymbol) {
        orderReceiptContent.append(content);
        orderReceiptContent.append(endSymbol);
    }

    public void getReceiptHeader(StringBuilder orderReceiptContent) {
        orderReceiptContent.append(PRINTING_ORDERS_HEARD);
        orderReceiptContent.append(order.getCustomerName());
        orderReceiptContent.append(order.getCustomerAddress());
    }
}