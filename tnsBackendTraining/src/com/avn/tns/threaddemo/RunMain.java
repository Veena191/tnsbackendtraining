package com.avn.tns.threaddemo;

public class RunMain {

	public static void main(String[] args) {
		DemoRun ob=new DemoRun();
		Thread t1=new Thread(ob);
		t1.start();
		Thread t2=new Thread(ob);
		t2.start();
		Thread t3=new Thread(ob);
		t3.start();
		Thread t4=new Thread(ob);
		t4.start();
		
		

	}

}
