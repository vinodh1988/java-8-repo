package com.functional;
//From java 8 static methods are allowed in java
public interface Sample {
    public static void main(String n[]) {
    	System.out.println("Would i Run!!!!");
    	Test.print();
    }
    public void m1();
   
}


interface Test{
	public static void print() {
		System.out.println("Called and We are printing...!!!");
	}
}
