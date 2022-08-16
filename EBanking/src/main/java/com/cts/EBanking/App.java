package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS
		// Please start your code from here
		// Configuration and Input data read here
		// Refer sample input details
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		SmartBankAccount sm = (SmartBankAccount) context.getBean("smartBankAccount");
		System.out.println("Welcome Mr/Mrs: " + sm.getName());
		System.out.println("Your id is : " + sm.getCustomerId());
		System.out.println("Please select Account type ");
		List<String> accounts = sm.getAccounts();
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i));
		}

		Scanner scanner = new Scanner(System.in);

		switch (scanner.nextInt()) {

		case 1:
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			if (choice == 1) {
				// Do call deposite
				System.out.println("Enter the amount to deposit ");
				double amount = scanner.nextDouble();
				System.out.println("Your balance amount is " +sm.doDeposit(amount));

			} else if (choice == 2) {
				// Do call Withdraw
				System.out.println("Enter the amount to be withdrawn ");
				double amount = scanner.nextDouble();
				System.out.println("Your balance amount is " + sm.doWithdraw(amount));

			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			// Code for recurringAccount
			System.out.println("Enter monthly amount : ");
			double amount = scanner.nextDouble();
			int months = scanner.nextInt();
			System.out.println(
					"Your balance after " + months + " will be : " + sm.calculateRecurringAccount(amount, months));
			break;
		case 3:
			// Code for FD
			System.out.println("Enter FD amount : ");
			double amount1 = scanner.nextDouble();
			int months1 = scanner.nextInt();
			System.out.println(
					"Your balance after" + months1 + " months will be : " + sm.calculateFixedAccount(amount1, months1));
			break;

		default:
			System.out.println("Wrong Choice");

		}

	}
}
