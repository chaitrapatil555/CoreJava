package LabPrograms;

import java.io.*;
public class BaseSubException {
	public static void main(String al3[]) {
	if(al3.length == 0) 
	 { 
	 System.out.println("invalid usage"); 
	System.out.println("usage : Java <filename> file1 file2 file3 ..."); 
	 return; 
	 } 
	for(int I=0;I<al3.length; I++) 
	 { 
	 File f = new File(al3[I]);
	 try { 
		 String line; 
		 DataInput d = new DataInputStream(new 
		 FileInputStream(al3[I])); 
		 if (f.exists() && f.isFile()) 
		 { 
		 System.out.println("file exists"); 
		 System.out.println(f + "is ordinary file"); 
		 System.out.println("printing the contents of file named : " + al3[I]); 
		 System.out.println("========================"); 
		 while((line = d.readLine()) != null) 
		 { 
		 System.out.println(line); 
		 } 
		 } 
		} catch(FileNotFoundException e) 
		 { 
		 if(f.exists() && f.isDirectory()) 
		 { 
		 System.out.println("======================"); 
		 System.out.println("Name : " + f + "is a directory"); 
		System.out.println("inside catch of FileNotFoundException"); 
		System.out.println("========================"); 
		} 
		else {
			System.out.println("====================="); 
			 System.out.println("Name : "+ al3[I] + "does not exists"); 
			 System.out.println("generated exception :"+e); 
			 System.out.println("======================"); 
			 } 
			 } catch(IOException p) { 
			System.out.println("super class is higher up in the program"); 
			} 
			 } 
			 } 
			 
		}