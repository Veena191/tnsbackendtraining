package com.avn.tns.exceptiondemo;

public class MarksChecker {
	public void markscheck(int marks)throws InvalidMarks, ArithmeticException{
		if(marks <=0 || marks > 100) {
			throw new InvalidMarks("enter the marks 0 to 100");
		}
		else{
			System.out.println("the entered marks are correct");
	}
}

}
