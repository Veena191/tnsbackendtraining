package com.avn.tns.abstraction;
//demo for interface
//combination of abstract + from v17 + default method + static method
public interface Bank {
	//abstract methods
	void deposit(int amount);
	//abstract void deposit();
	void withdraw(int amount);
	//final variables
	final double bal=1000;
	int DEPOSIT_LIMIT= 25000;
	int  MIN_BAL= 1000;
	//default method
	default void greet() {
		System.out.println("welcome custome have a nice day");
		
	}
	//static variables
	static void info() {
		System.out.println("only UPI and credit card payments can accepted");
		
		
	}

}
