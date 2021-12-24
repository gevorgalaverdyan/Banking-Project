package com.company;

public interface IBank {

    void addClient(Client newClient);

    
    void displayClientAccounts(int clientId);

    void displayClientList();


    Client getClient(int id);


    Account getClientAccount(int clientId, int accountNumber);
    
}
