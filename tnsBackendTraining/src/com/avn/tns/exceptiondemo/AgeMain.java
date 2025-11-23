package com.avn.tns.exceptiondemo;

public class AgeMain {

	public static void main(String[] args) {
		AgeChecker a= new AgeChecker();
		try {
			a.agecheck(12);
		}
		catch(ArithmeticException|InvalidAge e) {
			e.printStackTrace();
			
		}

	}

}
