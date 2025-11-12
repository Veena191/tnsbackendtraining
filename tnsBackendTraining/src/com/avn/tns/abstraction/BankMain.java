package com.avn.tns.abstraction;

public class BankMain {

	public static void main(String[] args) {
    // Creating an object of BankImpl using Bank reference
	Bank ob = new BankImpl();
	// Calling default method from Bank
	ob.greet();
	// Calling static method from Bank (no object needed)
	Bank.info();
	//calling abstract methods from Bank
	ob.deposit(100000);
	ob.withdraw(500);
	

	}

}
