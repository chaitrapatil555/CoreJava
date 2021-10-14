package LabPrograms;

public class Operators {

	public static void main(String[] args) {
	int var1=5,var2=5; //increment decrement operator
		System.out.println(var1++);
		System.out.println(++var2);
		
		//bitwise complement
		
		int x=8;
		System.out.println("x =" +x);
		int y=~x;
		System.out.println("y =" +y);
		
		//arithmetic operators
		
		int a=10,b=5;
		System.out.println("a+b="+(a+b));  //addition operators
		System.out.println("a-b="+(a-b));  //substraction
		System.out.println("a*b="+(a*b));  //multiplication
		System.out.println("a/b="+(a/b));  //division
		System.out.println("a%b="+(a%b));  //modulo
		
		//relational operators
		int c=10,d=20;
		System.out.println(c==d);
		System.out.println(c!=d);
		System.out.println(c>d);
		System.out.println(c<d);
		System.out.println(c>=d);
		System.out.println(c<=d);
		
		//bitwise operators
		
		int m=9,n=8;
		System.out.println("m&n="+(m&n));
		System.out.println("m^n="+(m^n));
		System.out.println("m|n="+(m|n));
		
		//conditional operators
		
		int u=5,v=4,w=7;
		System.out.println(u>v&&u>w||v<w);
		System.out.println((u<w&&v>w)&&u<v);
}
}
