package LabPrograms;

class ThisStudent{  
int rollno;  
String name;  
float fee;  
ThisStudent(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
ThisStudent s1=new ThisStudent(111,"ankit",5000f);  
ThisStudent s2=new ThisStudent(112,"sumit",6000f);  
s1.display();  
s2.display();  
}
}