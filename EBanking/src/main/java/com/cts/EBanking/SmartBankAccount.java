package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount {

//	SmartBankAccount() {
//
//	}
	public SmartBankAccount(int customerId, String name, double balance, List<String> accounts) {
		super(customerId, name, balance, accounts);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateFixedAccount(double amount, int months) {

		double finalAmount = amount * Math.pow((1 + 10 / 12), 12 * (months / 12));
		return finalAmount;
	}

	@Override
	public double calculateRecurringAccount(double amount, int months) {
		int n = 12;
		double finalAmount = (amount * 12) + (amount * (n * (n + 1) / (2 * 12)) * (7 / 100));
		return finalAmount;
	}

}
