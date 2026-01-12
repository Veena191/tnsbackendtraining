package com.avn.tns.interthreaddemo;

public class Consumer extends Thread {
	private ShareResource resource;
	public Consumer (ShareResource resource) {
		super();
		this.resource=resource;
		
	}
	public void run () {
		for(int i=0;i<5;i++) {
			resource.Consumer(i);
			
			
		
		}
	}

}
