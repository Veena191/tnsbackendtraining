package com.avn.tns.threaddemo;

public class MultiThread extends Thread {
	String mesg;
	public void run() {
		int s=5;
		for(int i=0;i<s;i++) {
			System.out.println(Thread.currentThread());
			
		}
	}

	public static void main(String[] args) {
	//ob is representing thread 1
	Thread ob = new MultiThread();
	ob.start();
	//obj is representing thread 2
	Thread obj = new MultiThread();
	obj.start();
	//obk is representing thread 3
	Thread obk = new MultiThread();
	obk.start();
	//obs is representing thread 4
	Thread obs = new MultiThread();
	obs.start();
		

	}

}
