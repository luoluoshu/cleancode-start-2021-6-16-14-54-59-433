package com.tw.academy.basic.$7_long_method;

public class LineItem {
	private static final double TAX_RATE = .10;

	private String description;
	private double price;
	private int quantity;

	public LineItem(String description, double p, int quantity) {
		super();
		this.description = description;
		this.price = p;
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

    double totalAmount() {
        return price * quantity;
    }
    double getSalesTax() {
        return this.totalAmount() * TAX_RATE;
    }

	double getTotalLineItemAmount() {
		return this.totalAmount() + this.getSalesTax();
	}
}