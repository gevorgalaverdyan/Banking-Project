package com.company;
import java.util.Scanner;


public class UserInputManager implements IUserInputManager {
    Scanner sc = new Scanner(System.in);

	public int retrieveAccountNumber() { // user puts his account number
		int accNumber = retrieveUserOption("Please enter the desired account number: ");
		return accNumber;
	}

	public Account retrieveAccountType() {

		int typeChoice = retrieveUserOption(" [1] Saving \n [2] Checking \n Select account type : ");
		Account ac = null;
		switch (typeChoice) {
		case 1:
			ac = new SavingsAccount();
			break;



		case 2:
			ac = new CheckingAccount();
			break;



		default:
                    System.out.print("Please enter a valid choice");
			retrieveAccountType();
			
			break;
		}
		return ac;

	}

	public int retrieveClientId() {
		System.out.print("Please enter the id of the desired Client: ");
                int idClient = -1;
		String s = sc.next();
                
                if (validateInput(s)) {
			idClient = Integer.parseInt(s);
		} else {
			System.out.println("\"" + s + "\" - is not a valid input");
			idClient = -1;
		}
                
		return idClient;
	}


     
	public Client retrieveClientInfo() {
		System.out.print("Please enter Client first name: ");
		String fn = sc.next();
		System.out.print("Please enter Client last name: ");
		String ln = sc.next();
		return new Client(fn, ln);


	}

	public double retrieveTransactionAmount() {
		System.out.print("Please enter the desired amount for the current transaction: ");
		double transaction = sc.nextDouble();
		return transaction;
	}


	public int retrieveUserOption() {
		return retrieveUserOption("\n Please enter your option: ");
	}


	private int retrieveUserOption(String promptMessage) {
		System.out.print(promptMessage);
		int input = 0;

		String s = sc.next();

		if (validateInput(s)) {
			input = Integer.parseInt(s);
		} else {
			System.out.println("\"" + s + "\" - is not a valid input");
			input = -1;
		}
		return input;
	}

	

	private boolean validateInput(String s) {
		char[] a = s.toCharArray();
		boolean isNumber = true;
		for (int i = 0; i < a.length; i++) {
			char c = a[i];
			if (!Character.isDigit(c)) {
				isNumber = false;
				break;
			}
		}

		return isNumber;
	}

    
}
