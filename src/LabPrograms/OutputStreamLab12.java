package LabPrograms;

 import java.io.FileOutputStream; 
  class OutputStreamLab12 {
  
  public static void main(String args[]){ 
	  try{ 
		  FileOutputStream fout=new
  FileOutputStream("File2.txt"); fout.write(65); fout.close();
  System.out.println("success..."); 
  }catch(Exception e) {
  System.out.println(e);} 
  }
  }