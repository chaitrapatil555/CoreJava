package LabPrograms;
//PUBLIC ACCESS MODIFIER//
class Z
{ 
   public void display() 
      { 
          System.out.println("SoftwareTestingHelp!!"); 
     } 
} 
class AccessModifier 
{ 
    public static void main(String args[]) 
      { 
         Z obj = new Z (); 
          obj.display(); 
     } 
}

//PROTECTED ACCESS MODIFIER//

//class AM
//{ 
//   protected void display() 
//    { 
//        System.out.println("SoftwareTestingHelp"); 
//    } 
//} 
// 
//class BM extends AM {}  
//class C extends BM{}
// 
//class AccessModifier1 extends 	AccessModifier{
//     public static void main(String args[]) 
//   {   
//       BM obj = new BM();    
//       obj.display();       
//       C cObj = new C();    
//       cObj.display ();     
//   }   
//}


//  PRIVATE

//class DataClass {
//    private String strname;    
// 
//// getter method
//    public String getName() {
//        return this.strname;
//    }
//    // setter method
//    public void setName(String name) {
//        this.strname= name;
//    }
//}
//public class AccessModifier {
//    public static void main(String[] main){
//        DataClass d = new DataClass();       
// 
// // access the private variable using the getter and setter
//        d.setName("Java Programming");
//        System.out.println(d.getName());
//    }
//}

//DEFAULT

//class BaseClass 
//{ 
//    void display()      //no access modifier indicates default modifier
//       { 
//           System.out.println("BaseClass::Display with 'dafault' scope"); 
//       } 
//} 
// 
//class AccessModifier 
//{ 
//    public static void main(String args[]) 
//       {   
//          //access class with default scope
//          BaseClass obj = new BaseClass(); 
//   
//          obj.display();    //access class method with default scope
//       } 
//}