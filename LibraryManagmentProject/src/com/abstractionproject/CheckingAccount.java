package com.abstractionproject;

public class CheckingAccount extends  BankAccount{
    private double overdraftLimit;
	public CheckingAccount(String accountNumber, String accountHolderName, double balance,double overdraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAccountHolderName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	
	

}
