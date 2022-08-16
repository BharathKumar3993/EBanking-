package com.cts.EBanking;

import java.util.List;

public abstract class BankAccount {

	private int customerId;
	private String name;
	private double balance;
	private List<String> accounts;

	// Write your code here

	public int getCustomerId() {
		return customerId;
	}

	public BankAccount(int customerId, String name, double balance, List<String> accounts) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.balance = balance;
		this.accounts = accounts;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<String> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}

	public double doDeposit(double amount) {

		double totalAmount = amount + balance;
		balance = totalAmount;

		return totalAmount;
	}

	public double doWithdraw(double amount) {

		// write your code here
		if (amount > balance)
			return -1;

		balance = balance - amount;

		return balance;

	}

	public abstract double calculateFixedAccount(double amount, int months);

	public abstract double calculateRecurringAccount(double amount, int months);

}
