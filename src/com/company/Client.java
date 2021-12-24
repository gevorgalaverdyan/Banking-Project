package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public class Client implements IClient{
    private static int counter = 1;
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<Account> accountList = new ArrayList<>();

	public Client(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = counter;
		counter++;
	}


	public void addAccount(Account newAccount) {
		accountList.add(newAccount);
	}


	public void displayAccounts() {
		System.out.print("Accounts for " );
                System.out.println(this);

		for (Account a : accountList) {
                    System.out.println(a);

		}

	}


	public Account getAccount(int accountNumber) {

		Account ac = null;
		for (Account a : accountList) {
			if (a.getAccountNumber() == accountNumber) {
				return a;
			}
                        if (ac == null) {
				System.out.println("This account doese not exist; enter a valid account number: ");
                        }

		}

		return null;
	}


	@Override
	public String toString() {
		return lastName + ", " + firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getId() {
		return id;
	}



}
