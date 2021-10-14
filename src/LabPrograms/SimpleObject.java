package LabPrograms;

public class SimpleObject {
	
	SimpleObject() 
	 { 
	 System.out.println ("No argument Constructor"); 
	 } 
	 SimpleObject(int a) 
	 { 
		 System.out.println ("One argument Constructor"); 
	 } 
	
	
	 
	 public static void main(String arg[]) 
	 { 
	 new SimpleObject(); 
	 new SimpleObject(100); 
	 } 
	 } 
		