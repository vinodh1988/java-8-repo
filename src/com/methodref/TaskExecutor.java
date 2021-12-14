package com.methodref;

public class TaskExecutor {
     public static void performActivity(Task task,String name) {
    	 System.out.println("Preparing and Pre Activities");
    	 task.activity(name);
    	 System.out.println("Post Activities");
     }
}
