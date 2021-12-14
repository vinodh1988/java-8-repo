package com.callers;

import com.functional.Sample;
import com.functional.Store;


public class LamdaDemo {
   public static void main(String[] args) {
	   String x[]= {"Raj","Ravi","John"};
	 Sample s=()->{
		
		 System.out.println("Method m1 implementation using lambda");
		
		
	 };
	 
	 Store s1= (id)->{
		 System.out.println("Store Playing "+id);
	 };
	
	 s.m1();
	 s1.play(142);
	
	// s.main(x); //Not possible
	 //Sample.main(x);
   }
}
