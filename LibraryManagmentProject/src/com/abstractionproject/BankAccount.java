package com.abstractionproject;

public abstract class BankAccount {

	private String accountNumber;
	private String accountHolderName;
	protected double balance;
	
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }	
	
	public abstract String getAccountNumber();
	public abstract String getAccountHolderName();
	public abstract double getBalance();
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
}
