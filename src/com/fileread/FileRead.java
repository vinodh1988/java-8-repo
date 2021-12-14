package com.fileread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
   public static void main(String n[]) {
	   File f=new File("d:\\Main.java");
	   
	
	   
	   try(FileReader fr=new FileReader(f);
		   BufferedReader br=new BufferedReader(fr))
	   {
		   String x=null;
		   while((x=br.readLine())!=null)
			   System.out.println(x);
	   }
	   catch(IOException e) {
		   e.printStackTrace();
	   }
	   fun();
   }
   
   public static void fun() {
	   System.out.println("Logic that is no way connected to file that is read");
   }
}
