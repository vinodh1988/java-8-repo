package com.callers;

import com.fileread.ResourceProvider;
import com.functional.CallBack;

public class Caller {
  public static void main(String[] args) {
	class A implements CallBack{

		@Override
		public void logic(String n) {
			// TODO Auto-generated method stub
			System.out.println("Received "+n);
		}
	   
	}
	
	ResourceProvider.provideResource(new A());
	
	ResourceProvider.provideResource(new CallBack() {
		@Override
		public void logic(String n) {
			// TODO Auto-generated method stub
			System.out.println("Received here Too "+n);
		}
	});
	
	ResourceProvider.provideResource((n)->{
		System.out.println("Received by lambda "+n);
	});
	
	
	System.out.println("Some Other Logic");
  }
}
