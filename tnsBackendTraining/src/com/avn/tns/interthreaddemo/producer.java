package com.avn.tns.interthreaddemo;

public class producer extends Thread {
	private ShareResource resource;
	public producer (ShareResource resource) {
		super();
		this.resource=resource;
		
	}
	public void run () {
		for(int i=0;i<5;i++) {
			resource.produce(i);
		}
	}
	

}
