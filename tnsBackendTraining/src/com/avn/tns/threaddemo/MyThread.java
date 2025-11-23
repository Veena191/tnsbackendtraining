package com.avn.tns.threaddemo;

public class MyThread extends Thread{
	public void run() {
		System.out.println("this is from thread class");
		
	}
	public static void main(String[]args) {
		MyThread ob= new MyThread();
		ob.start();
		
		
	}

}
