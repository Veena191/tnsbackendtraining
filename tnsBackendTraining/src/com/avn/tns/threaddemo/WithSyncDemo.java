package com.avn.tns.threaddemo;

public class WithSyncDemo {
	public synchronized void mul(int no) {
		for(int i=0;i<=4;i++) {
			int result=no*i;
			System.out.println(result);
		}
	}

}
