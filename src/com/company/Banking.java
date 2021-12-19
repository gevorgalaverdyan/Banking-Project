package com.company;


/**
 *
 * @author Diego, Gevorg, Daniel
 */
public class Banking {
    private static final String HORIZ_LINE = "-----------------------------------------------------";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       getInput();
    }
    public static void getInput() {

		openMenu();
		// Scanner optionScanner = new Scanner(System.in);
		Bank myBank = new Bank();
		UserInputManager uim = new UserInputManager();
		
		boolean go = true;
		Client c = null;
		Account ac = null;

		while (go) {
                       
                        int userOption = uim.retrieveUserOption();
                                                
			switch (userOption) {
			case 1:// works
				printMsg(); // Adds new Client
				c = uim.retrieveClientInfo();
				myBank.addClient(c);
                                openMenu();
                                
				break;

			case 2:
				printMsg(); // Create a new account
				c = myBank.getClient(uim.retrieveClientId());
                                if(c != null){
                                    ac = uim.retrieveAccountType();
                                    c.addAccount(ac);
                                    
                                }
                                openMenu();
				break;

			case 3:
				printMsg();
				c = myBank.getClient(uim.retrieveClientId());
                                if(c != null){
                                    ac = c.getAccount(uim.retrieveAccountNumber());
                                    if(ac !=null){
                                        double d = uim.retrieveTransactionAmount();
                                        ac.deposit(d);
                                    }else{
                                          System.out.println("Account does not exist");
                                    }
                                    
                                }
                                openMenu();
				break;

			case 4:
				printMsg();
				c = myBank.getClient(uim.retrieveClientId());
                                if(c != null){
                                    
                                    ac = c.getAccount(uim.retrieveAccountNumber());
                                    if(ac !=null){
                                        double w = uim.retrieveTransactionAmount();                                    
                                        ac.withdrawal(w);
                                    }else{
                                        System.out.println("Account does not exist");
                                    }
                                }                  
                                
                                openMenu();                                
				break;

			case 5:
				printMsg();
				c = myBank.getClient(uim.retrieveClientId());
                                 if(c != null){
                                     ac = c.getAccount(uim.retrieveAccountNumber());
                                     if(ac !=null){                                       
                                        ac.displayAllTransactions();
                                     } else{
                                         System.out.println("Account does not exist");
                                     }
                                     
                                 }
                                 
                                openMenu();
                               
				break;

			case 6:
				printMsg();
				myBank.displayClientList();
                                openMenu();
                                
				// getInput();
				break;

			case 7:
				printMsg();
				c = myBank.getClient(uim.retrieveClientId());
                                  if(c != null){
                                    c.displayAccounts();
                                  }
                                openMenu();
                                
				break;

			case 8:
				printMsg();
				go = false;
				printMsg("Thank you for choosing Royal Bank of Canada :)");

				System.exit(0);

			default:

				printMsg("Wrong choice please enter a valid coice");
                                openMenu();
				
				// getInput();
				break;
			}
		}
	}

	public static void openMenu() {
            String option1 = "[1] Add a new Client ";
            String option2 = "[2] Create a new Account";
            String option3 = "[3] Make a Deposit";
            String option4 = "[4] Make a Withdrawal";
            String option5 = "[5] List Account Transactions";
            String option6 = "[6] List Clients";
            String option7 = "[7] List Client Accounts";
            String option8 = "[8] Exit";
            String line = "=============================================================";
            
            System.out.printf("%s%n %-35s %s%n %-35s %s%n %-35s %s%n %-35s %s%n  ",line,option1,option2,option3,option4,option5,option6,option7,option8 );

		
	}

	private static void printMsg(String msg) {
		System.out.println(msg);
	}

	private static void printMsg() {
		System.out.println(HORIZ_LINE);
	}
       
}

    

