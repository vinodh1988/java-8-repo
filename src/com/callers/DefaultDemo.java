package com.callers;

import com.fresh.implementors.One;
import com.library.MyLib;
import com.old.implementors.First;
import com.old.implementors.Second;

public class DefaultDemo {
   public void fun() {
	   MyLib m=()->{
		 String[] x={"Harry","Rahul","Web"};
		 System.out.println("Definition for perform");
		 System.out.println(this);
         this.show(x);
	   };
	   m.perform();
   }
   
   public void show(String n[]) {
	   for(String x:n)
		   System.out.println(x);
   }
   public static void main(String[] args) {
	  
	   new DefaultDemo().fun();
	  /* MyLib m=new One();
	   m.perform();
	   m.activity();
	   
	   m=new First();
	   m.perform();
	   m.activity();
	   
	   m=new Second();
	   m.perform();
	   m.activity();
	   
	   
	    m=()->{
		 System.out.println("Spot Perform");  
		 
	   };
	   m.perform();
	   m.activity();*/
   }
}
