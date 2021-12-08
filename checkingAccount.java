
public class checkingAccount extends bankAccount{
	private double interest = 0.075;
	public int withdrawCounter = 1;
	
	public static void main(String[] args) {
		checkingAccount acct = new checkingAccount();
		acct.deposit(1000000);
		//checkingAccount acct2 = new checkingAccount();
		//acct2.deposit(500.00);
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			acct.withdraw(1000);
		}
		
		System.out.println(acct);
	}
	
	public void withdraw(double amount) {
		if (withdrawCounter < 4) {
			super.withdraw(amount);
			System.out.println("Withdrawls: " + withdrawCounter + " / 3");
			withdrawCounter++;
		}else {
				super.withdraw(amount);
				double chargedInterest = amount * this.interest;
				System.out.println("You have exceeded the number of allowed withdrawls. You will be charged $" + chargedInterest);
				super.withdraw(chargedInterest);
				withdrawCounter = 1;
			}
	}
	
	public String toString() {
		return "Type: Checking, " + super.toString() + ", Interest " + this.interest + "%";
	}
}


