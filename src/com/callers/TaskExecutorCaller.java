package com.callers;

import com.methodref.Task;
import com.methodref.TaskExecutor;

public class TaskExecutorCaller {
     public static void main(String[] args) {
	   /* TaskExecutor.performActivity((name)->{
	    	System.out.println("Performing a short task "+name);
	    }, "Documentation");	
	    
	    TaskExecutor.performActivity(TaskExecutorCaller::coding, "ABC Project");
	    TaskExecutor.performActivity(new TaskExecutorCaller()::building, "Maven Project");
	   */
	    Task t=TaskExecutorCaller::coding;
	    t.activity("PHP Project");
     
     }
     
     public static void coding(String projectname) {
    	 System.out.println("Very big activity");
    	 System.out.println("Coding "+projectname);
     }
     
     public void building(String projectname) {
    	 System.out.println("Bigger Activity");
    	 System.out.println("Building "+projectname);
     }
}
