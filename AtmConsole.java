package JavaExercises;

import java.util.Scanner;

public class AtmConsole {
	
	int amount = 2500;
	int ch , y , Y;
	long Acc1 = 9999999999L;
	long accInput;
	long pinInput;
	//long Acc2 = 9573987956L;
	//long Acc3 = 7075266662L;
	//long Acc4 = 9739306550L;
	//long Acc5 = 9502790292L;

	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
//		className objName = new className();
		AtmConsole bank = new AtmConsole();
		
		bank.greetings();
		bank.checkAccountNumber();
		bank.enterATMPIN();
		bank.accountInfo();
		bank.atmServices();	
		
		
	}
	public void greetings() {
		System.out.println("Welcome to the HDFC ATM");
	}
	
	public void checkAccountNumber() 
	{		
		while(true) {
			System.out.println("Enter your Account number (Enter 10 digit) : ");
			long acc = scanner.nextLong();
			if (String.valueOf(acc).length() != 10)
			{
	            System.out.println("Invalid Account number. Account number must be 10 digits.");
	            System.out.println("Please enter a correct 10-digit account number:");
	            continue;  // Ask for account number again
	        }
			if(acc <= Acc1 ) 
			{
				System.out.println("Welcome to HDFC BANK ATM");
				System.out.println("Thanks for entering your account number");
				this.accInput=acc;
				break;
			}
			else 
			{
				System.out.println("Invalid Account number");
				System.out.println("Please enter the correct account number");
			}		
		}
		
	}
	
	public void enterATMPIN()
	{
		System.out.println("Enter Your ATM Pin :");
		long pin = scanner.nextLong();
		scanner.nextLine();
		if(pin>=1000 && pin<=9999) {
			System.out.println("Thanks for entering your pin");
			this.pinInput=pin;
		}
		else {
			System.out.println("Enter your correct pin");
		}
		
	}
	public void accountInfo() {
		System.out.println("Your Account Details are :");
		System.out.println("Account Number : " + accInput);
		System.out.println("ATM pin :" + pinInput);
	}
	public void atmServices() 
	{
		while(true) 
		{
			System.out.println("Choose the following Services : \n"
					+ "1.Balance\n"
					+ "2.Deposit\n"
					+ "3.Withdrawl\n"
					+ "4.Exit\n");
			int services = scanner.nextInt();
			switch(services)
			{
				case 1:
					checkBalance();
					System.out.println("Do you want to continue?(yes/no)");
					String choice1 = scanner.next().toLowerCase();
					if(choice1.equals("no")) {
						System.out.println("Thanks for choosing HDFC ATM");
						return;
					}
					break;	
				case 2:
					deposit();
					System.out.println("Do you want to continue?(yes/no)");
					String choice2 = scanner.next().toLowerCase();
					if(choice2.equals("no")) {
						System.out.println("Thanks for choosing HDFC ATM");
						return;
					}
					break;
				case 3:
					draw();
					System.out.println("Do you want to continue?(yes/no)");
					String choice3 = scanner.next().toLowerCase();
					if(choice3.equals("no")) {
						System.out.println("Thanks for choosing HDFC ATM");
						return;
					}
					break;
				case 4:
					ex();
					return;
			}	
		}	
	}
	
	public void checkBalance() {
		System.out.println("Your current Balance is :" + amount);
		
	}
	
	public void deposit() {	
		System.out.println("Enter the amount you want to deposit : ");
		int dep = scanner.nextInt();
		amount = dep + amount ;	
		System.out.println("Your amount is deposited successfully");
		
		System.out.println("Do you want to print your current balance ? (yes/no)");
		String choice = scanner.next().toLowerCase();
		switch(choice) 
		{
			case "yes":
				System.out.println("Your current balance is : " + amount);
			case "no":
				System.out.println("Thanks for choosing HDFC ATM");
		}
		
	}
	
	public void draw() {
		System.out.println("Enter the amount you want to withdrawl");
		int drawl = scanner.nextInt();
		
		if(drawl <= amount) {
			System.out.println("Amount is successfully withdrawl");
			amount = amount - drawl ;
			System.out.println("Do you want to print your current balance ? (yes/no)");
			String choice = scanner.next().toLowerCase();
			switch(choice) 
			{
				case "yes":
					System.out.println("Your current balance is : " + amount);
				case "no":
					System.out.println("Thanks for choosing HDFC ATM");
			}
		}
		else {
			System.out.println("In-sufficient balance. Please choose valid amount");
		}
	}
	
	public void ex() {
		System.out.println("Thanks for choosing HDFC ATM");	
		scanner.close();
	}
}

