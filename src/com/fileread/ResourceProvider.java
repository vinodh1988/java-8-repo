package com.fileread;

import com.functional.CallBack;

public class ResourceProvider {
    public static void provideResource(CallBack c) {
    	System.out.println("We Don't have the resource yet");
    	System.out.println("Will send it after 3 seconds");
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	c.logic("Take IT");
    }
}
