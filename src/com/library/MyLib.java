package com.library;

public interface MyLib  {
    public void perform();
    default public void activity() {
    	System.out.println("Dummy activity");
    };
}
