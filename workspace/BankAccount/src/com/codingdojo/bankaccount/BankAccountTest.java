package com.codingdojo.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount accNo1 = new BankAccount();
		BankAccount accNo2 = new BankAccount();
		BankAccount accNo3 = new BankAccount();
		accNo1.getAccountBlance();
		System.out.println(accNo1.getAccountCount());
		
		accNo1.depositMoney("checking", 8000);
		accNo2.depositMoney("savings", 10000);
		accNo3.depositMoney("checking", 5000);
		accNo3.depositMoney("savings", 3000);
		
		accNo1.withdrawMoney("savings", 100);
		accNo2.withdrawMoney("savings", 2000);
		accNo3.getAccountBlance();
	}
}