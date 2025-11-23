package com.avn.tns.threaddemo;

public class WithSyncMain {
	public static void main(String[] args) {
	WithSyncDemo ob =new WithSyncDemo();
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