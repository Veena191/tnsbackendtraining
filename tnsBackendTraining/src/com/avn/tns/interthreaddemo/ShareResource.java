package com.avn.tns.interthreaddemo;

public class ShareResource {
	private int data;
	private boolean hasData= false;
	public synchronized void produce(int value) {
		while(hasData) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			
		}
		data=value;
		hasData=true;
		System.out.println("produced:"+data);
		notify();
		
	}
	public synchronized int consume() {
		while(hasData) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
	
		hasData=false;
		System.out.println("consumed:"+data);
		notify();
		return data;
	

}}
