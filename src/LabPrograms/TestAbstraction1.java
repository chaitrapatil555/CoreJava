package LabPrograms;

abstract class Shapee{  
abstract void draw();  
}  

class Rectangle extends Shapee{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shapee{  
void draw(){System.out.println("drawing circle");}  
}  

class TestAbstraction1{  
public static void main(String args[]){  
Shapee s=new Circle1();
s.draw();  
}  
}  