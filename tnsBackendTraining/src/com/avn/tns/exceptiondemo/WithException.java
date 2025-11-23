package com.avn.tns.exceptiondemo;
//program to understand with exception
public class WithException {
	public static void main(String[] args) {
		try {
			
			int a=40;
			int b=20;
			int divide=a/b;
			System.out.println("the result is "+divide);
			int arr[]=new int[3];
			arr[0]=37;
			arr[1]=27;
			arr[2]=17;
			System.out.println("the array is "+arr[2]);	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the give index is not existing ");
		}
	}
}	
	
	
	
	
	