package LabPrograms;

class A{  
void eat(){
	System.out.println("eating...");
	}  
}  
class B extends A{  
void bark(){
	System.out.println("barking...");
	}  
}  
class TestInheritance{  
public static void main(String args[]){  
B b=new B();  
b.bark();  
b.eat();  
}
}  