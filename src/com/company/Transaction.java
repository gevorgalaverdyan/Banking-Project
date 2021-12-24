package com.company;
import java.text.DecimalFormat;



public class Transaction implements ITransaction{
     public double amount;
	public String type;
	private static final DecimalFormat formatter = new DecimalFormat("#0.00");

	public Transaction(double amount, String type) {
		this.amount = amount;
		this.type = type;

	}

	@Override
	public String toString() {
		return this.type + " of " + formatter.format(this.amount) + "$";
	}
    
}
