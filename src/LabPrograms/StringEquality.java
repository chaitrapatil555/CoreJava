package LabPrograms;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1,str2;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter first String");
str1 = scanner.nextLine();

System.out.println("Enter second String");
str2 = scanner.nextLine();
if (str1.equals(str2))
	System.out.println("string Equal");
	else
		System.out.println(" String notEqual");
	}

}
