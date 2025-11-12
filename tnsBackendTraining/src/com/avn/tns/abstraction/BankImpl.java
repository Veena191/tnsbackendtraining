package com.avn.tns.abstraction;

public class BankImpl implements Bank{
	public void deposit(int amount) {
	//logic	
	if(amount <= DEPOSIT_LIMIT) {
		double balance = bal+amount;
		System.out.println("the balance after deposit"+ balance);
	}
	else {
		System.err.println("deposit limit exceeds");	
	}
	}
	public void withdraw(int amount) {
	//logic
	if(amount >= MIN_BAL) {
		double balance = bal-amount;
		System.err.println("money has been withdraw successfully and remaining balance is:"+ balance);
		
	}
	else {
		System.err.println("minimum balance should be RS. 1000, so you can't withdraw ");
	}
}
}
