package withdrawsMoney;

import java.util.Scanner;

public class Account {
	static double balance = 19876.45;

	public void debit(double debitAmount) {
		double accountBalance = balance - debitAmount;
		if (accountBalance < 0) {
			System.out.println("Debit amount exceeded account balance");
		} else
			System.out.println("Account Balance is : " + accountBalance);

	}

	public static void main(String[] args) {
		Account account = new Account();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount you wants to withdraws ");
		account.debit(sc.nextDouble());
		sc.close();

	}

}
