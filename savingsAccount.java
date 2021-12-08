//Inherit from bankAccount
//Have unique extra methods and instance variables
//toString matches with the savingAccount
//Test it out

public class savingsAccount extends bankAccount {
	private double interestEarned = 0.011;
	public int depositCounter = 0;
	public int bigDeposit = 0;
	public int bonusEarned = 5;

	public static void main(String[] args) {
		//savingsAccount sacct = new savingsAccount();
		savingsAccount sacct2 = new savingsAccount();
		//sacct.deposit(10000); //Initial deposit
		//System.out.println();

		//Recurring deposits
		//for (int i = 0; i < 6; i++) {
			//sacct.savingsDeposit(1001);
		//}

		System.out.println(sacct2);
	}


	public void savingsDeposit(double depositAmount) {
		if (depositCounter < 2) {
			super.deposit(depositAmount);
			depositCounter++;
		}else {
				super.deposit(depositAmount);
				super.earnedInterest(this.interestEarned);
				depositCounter = 0;
			}

		if (depositAmount > 1000) {
			bigDeposit++;
			System.out.println("Qualifying deposits: " + bigDeposit + " / 5");
		}

		if (bigDeposit == 5) {
			System.out.println("Congratulations! You have made enough qualifying deposits!");
			super.deposit(bonusEarned);
			bigDeposit = 0;
		}
		System.out.println();
	}


	public String toString() {
		return "Type: Savings, " + super.toString() + ", Interest: " + this.interestEarned + "%";
	}


}
