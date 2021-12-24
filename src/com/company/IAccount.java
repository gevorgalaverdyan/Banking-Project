package com.company;



import java.util.ArrayList;

public interface IAccount {


    double deposit(double d);

    void displayAllTransactions();

    ArrayList<Transaction> getTransactions();

    @Override
    String toString();

    double withdrawal(double w);
    
}
