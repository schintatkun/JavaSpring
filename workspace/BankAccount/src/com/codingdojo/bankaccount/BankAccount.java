package com.codingdojo.bankaccount;


public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int accountCreated;
	private static double accountBalance;
	public BankAccount() {
		this.accountNumber = createAccountNo();
//		this.checkingBalance = 0;
//		this.savingsBalance = 0;
//		this.accountBalance = 0;
		accountCreated ++;
	}
	
	public String createAccountNo() {
		String accountNo = "";
		for (int i = 0;i<10;i++) {
			//Math.random()  result 0.1-1.0
			int random = (int) Math.random()*10;
			accountNo +=random;
		}
		return accountNo;
	}
	
	public int getAccountCount() {
		return accountCreated;
	}
	public double checkBalance() {
		return this.checkingBalance;
	}
	public double savingsBalance() {
		return this.savingsBalance;
	}
	
	
	public void depositMoney(String accountType, double amount) { 
		if(accountType == "checking") {
			this.checkingBalance += amount;
		} else if(accountType == "savings") {
			this.savingsBalance += amount;
		} else {
			System.out.println("Please choose either your savingss or your checking account into which to deposit.");
		}
		accountBalance += amount;
		System.out.println("Deposited $"+amount+" into your "+accountType+" account.");
	}
	
	public void getAccountBlance() {
		System.out.println("Balance of checking account is $"+ this.checkingBalance);
		System.out.println("Balance of savings account is $"+this.savingsBalance);
	}
	
	public void withdrawMoney(String accountType, double withdrawAmount) {
		if (accountType=="checking") {
			if (withdrawAmount > this.checkingBalance) {
				System.out.println("Insufficient Funds");
			}else {
				this.checkingBalance -= withdrawAmount;
				System.out.println("Withdrew $"+withdrawAmount+" from your "+accountType+" account.");
			}
		}else if (accountType =="savings") {
			if (withdrawAmount >this.savingsBalance) {
				System.out.println("Insufficient Funds");
			}else {
				this.savingsBalance -=withdrawAmount;
				System.out.println("Withdrew $"+withdrawAmount+" from your "+accountType+" account.");
			}
		}
		accountBalance -= withdrawAmount;
	}
}