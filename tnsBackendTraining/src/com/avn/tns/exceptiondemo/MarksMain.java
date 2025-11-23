package com.avn.tns.exceptiondemo;

public class MarksMain {

	public static void main(String[] args) {
		MarksChecker a= new MarksChecker();
		try {
			a.markscheck(12);
		}
		catch(ArithmeticException|InvalidMarks e) {
			e.printStackTrace();
			
		}


	}

}
