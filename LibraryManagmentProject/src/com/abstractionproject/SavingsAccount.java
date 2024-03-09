package com.abstractionproject;

public class SavingsAccount extends BankAccount{
	private double interestRate;
	
	SavingsAccount(String accountNumber,String accountHolderName,double balance,double interestRate){
		super(accountNumber,accountHolderName,balance);
		this.interestRate = interestRate;
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
		return balance;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		 if (balance - amount >= 0) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient balance");
	        }
	}

	

	


}
