package LabPrograms;

public class CallByValue {
	int change(int b) 
	  { 
	    ++b; 
	    return b; 
	  } 
	public static void main(String[] args) 
	{ 
	
	    CallByValue obj = new CallByValue(); 
	     int a = 20; 
	     int x = obj.change(a); 
	     System.out.println("Value of a after passing: " +a); 
	     System.out.println("Value of x after modifying: " +x); 
	     
	     class CallByRef 
	     { 
	  
	    	 public CallByRef(int i, int j) {
				// TODO Auto-generated constructor stub
			}

			CallByRef  ob = new  CallByRef (15,20); 
	     }
	     System.out.println("Before call :ob.a = +ob.a+ ob.b " +obj);
	     
	     System.out.println("After call :ob.a = +ob.a+ ob.b "+ obj);
	     }
	}

