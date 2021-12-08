
public class bankAccount {
	public int number;
	private double balance;
	private static int accountNumbers;
	
	public bankAccount() {
		this.number = ++accountNumbers;
	}
	
	public void deposit(double amount) {
		if (amount >= 0.0) {
			this.balance += amount;
			System.out.printf("$%.2f has been deposited to account #" + this.number + "\n", amount);
			System.out.printf("You now have a balance of: $%.2f\n", this.balance);
		}else {
			System.out.println("Unsuccessful transaction, invalid amount.");
		}
	}
	
	public void earnedInterest(double interest) {
		double interestAmount = (this.balance * interest);
		this.balance += interestAmount;
		System.out.printf("Congratulations! You have earned $%.2f in interest.\nYou now have a balance of $%.2f\n", interestAmount, this.balance);
	}
	
	public void withdraw (double amount) {
		if ((balance - amount) >= 0.0) {
			balance -= amount;
			System.out.printf("$%.2f has been withdrawn from account #%d\nYou now have a balance of $%.2f\n", amount, this.number,this.balance);
		}
		else {
			System.out.println("Unsuccessful transaction, insufficient balance");
		}
		System.out.println();
	}
	
	public String toString() {
		return "Account #" + this.number + ", Balance: $" + this.balance;
	}
	
	public void displayMessage(char type, boolean state, double amount) {
		String message1 = "";
		String message2 = "";
		if (type == 'd') {
			message1 = " have been deposited to ";
			message2 = "Invalid amount.";
		} else if (type == 'w') {
			message1 = " have been withdrawn from ";
			message2 = " Insufficient amount";
		}
		
		if (state) {
			System.out.println("Transaction successful, $" + amount + message1 + "account #" + number + ".\n New balance: $" + balance);
		} else {
			System.out.println("Transaction unsuccessful," + message2);
		}
	}
	
}
