import java.util.Scanner;

public class BankOffice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("Enter a name for the bank:");
		String bankName = input.nextLine();
		System.out.println("Enter the address:");
		String bankAddress = input.nextLine();
		
		Bank bank = new Bank(bankName, bankAddress);
		
		while (true) {
			System.out.println("Would you like to create an account?");
			String answer = input.nextLine();
			
			if (answer.equals("y") || answer.contains("yeah") || answer.contains("yes") || answer.contains("yep")) {
				System.out.println("Enter checking for checking account, saving for savings account, other for any account");
				answer = input.next().toLowerCase();
				
				switch(answer) {
					case "checking" : {
						bank.openAccount('c');
						break;
					}
					case "saving" : {
						bank.openAccount('s');
						break;
					}
					default : {
						System.out.println("Unexpected value: " + answer);
					}
				}
			} else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		
		while (true) {
			System.out.println("Would you like to display all accounts?");
			String answer = input.nextLine().toLowerCase();
			
			if (answer.equals("y") || answer.contains("yeah") || answer.contains("yes") || answer.contains("yep")) {
				bank.displayAll();
			} else if (answer.equals("no")) {
				System.out.println("Alright");
				break;
			}
		}
		
		System.out.println("_______________________________________________________________");
		System.out.println(bank);
		
	}
}
