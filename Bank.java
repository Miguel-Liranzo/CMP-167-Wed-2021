import java.util.ArrayList;

public class Bank {
	private String name;
	private String address;
	ArrayList<checkingAccount> accounts = new ArrayList<checkingAccount>();
	ArrayList<bankAccount> accountsOther = new ArrayList<bankAccount>();
	
	public Bank(String name, String address) {
		this.name = name;
		this.address = address;
		
		System.out.println("A bank has been created");
	}
	
	public void openAccount(char type) {
		if (type == 'c') {
			checkingAccount acct = new checkingAccount();
			accounts.add(acct);
			System.out.println("Checking account #" + acct.number + " has been created.");
		} else if (type == 's') {
			savingsAccount acct = new savingsAccount();
			accountsOther.add(acct);
			System.out.println("Savings Account #" + acct.number + " has been created.");
		} else {
			bankAccount acct = new bankAccount();
			accountsOther.add(acct);
			System.out.println("Account #" + acct.number + " has been created.");
		}
	}
	
	public void displayAll() {
		System.out.println("Checking Accounts");
		for (checkingAccount acct : accounts) {
			System.out.println(acct);
		}
	}
	
	public String toString() {
		return "Bank " + name + ", Address: " + address + " Number of clients: " + (accounts.size() + accountsOther.size());
	}
}
