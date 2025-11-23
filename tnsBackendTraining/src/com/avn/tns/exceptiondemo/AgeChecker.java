package com.avn.tns.exceptiondemo;
//driver class
public class AgeChecker {
	public void agecheck(int age)throws InvalidAge, ArithmeticException{
		if(age>18) {
			throw new InvalidAge("not eligible");
		}
		else{
			System.out.println("the person is eligible to register");
	}
}
}