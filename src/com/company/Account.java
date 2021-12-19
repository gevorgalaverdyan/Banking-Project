package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Daniel , Diego
 */
public class Account implements IAccount {
    private int accountNumber;
	private double balance;
	private int owner;
	private static int counter = 1;
	private ArrayList<Transaction> transactions = new ArrayList<>();
        //@RR
	protected String type;
        
        private static final DecimalFormat df = new DecimalFormat("#,###,##0.00");

	public Account(String type) {
		this.balance = 0;
		this.type = type;
		accountNumber = counter;
		counter++;
	}

	public double getBalance() {
		return this.balance;
	}

        //@RR
	public String getType() {
		return this.type;
	}

        //@RR
	public void setType(String accountType) {
		this.type = accountType;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public double deposit(double d) {

		Transaction trD = new Transaction(d, "Deposit");
		transactions.add(trD);
		balance += d;

		return balance;

	}

	public double withdrawal(double w) {

		Transaction trW = new Transaction(w, "Withdrawal");
		transactions.add(trW);
		balance -= w;
		
		return balance;

	}

	public void displayAllTransactions() {
		for (Transaction t : transactions) {

                    //@RR
                    System.out.println(t);
		}

	}
        
        //@RR
        public String toString(){
            return type + "(" + accountNumber + ")" + df.format(balance) + "$";
        }

 
    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
      
    }

}
