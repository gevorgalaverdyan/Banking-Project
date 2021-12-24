package com.company;

import java.util.ArrayList;


public class Bank implements  IBank {
    private String bankNumber;
	private String address;
	protected ArrayList<Client> clientList = new ArrayList<>();


	public void addClient(Client newClient) {
		this.clientList.add(newClient);
	}


	public void displayClientAccounts(int clientId) {
		Client cl = getClient(clientId);

                cl.displayAccounts();
	}


	public void displayClientList() {
		System.out.print(toString());
	}



	public Client getClient(int id) {
		Client client = null;

		for (Client cl : clientList) {
			if (cl.getId() == id) {
				client = cl;
				break;
			}
                         		                        
		}if(client == null){
                    System.out.println("Client does not exist");

                }
                

		return client;
	}


	public Account getClientAccount(int clientId, int accountNumber) {
		Account account = null;

		Client cl = getClient(clientId);
   
                cl.getAccount(accountNumber);

		return account;
	}

	@Override
	public String toString() {
		String message = "";

		for (Client c : clientList) {
			message = message.concat("(" + c.getId() + ") " + c.getLastName() + ", " + c.getFirstName() + "\n");
		}
		return message;
	}

	public String getBankNumber() {
		return this.bankNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Client> getClientList() {
		return clientList;
	}
    
}
