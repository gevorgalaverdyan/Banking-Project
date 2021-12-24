package com.company;


public interface IClient {

   
    void addAccount(Account newAccount);

    void displayAccounts();

 
    Account getAccount(int accountNumber);

    @Override
    String toString();
    
}
