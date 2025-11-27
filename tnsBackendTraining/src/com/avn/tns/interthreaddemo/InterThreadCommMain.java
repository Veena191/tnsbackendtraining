package com.avn.tns.interthreaddemo;

public class InterThreadCommMain {
	public static void main(String[]args) {
		ShareResource resource=new ShareResource();
		producer p=new producer(resource);
		Consumer c=new consumer(resource);
		p.start();
		c.start();
		
		
	}

}
