package com.avn.tns.threaddemo;

public class SyncMain {

	public static void main(String[] args) {
		SyncDemo ob =new SyncDemo();
		Thread t1=new Thread() {
			public void run() {
				ob.mul(2);
				
			}
		};
		t1.start();
		Thread t2=new Thread() {
			public void run() {
				ob.mul(2);
				
			}
		};
		t2.start();

	}

}
