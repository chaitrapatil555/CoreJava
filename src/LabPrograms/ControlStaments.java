package LabPrograms;

public class ControlStaments {

	public static void main(String[] args) {
		//if and else if statment
		int x=10,y=11;
		if(x+y>20) {
			System.out.println("greater than 20");
		}
		else {
			System.out.println("less than 20");
		}

		//switch statements
		int day = 2;
		switch (day) {
		  case 1:
		    System.out.println("Today");
		    break;
		  case 2:
		    System.out.println("Tommorrow");
		    break;
		 
		}
		//for loop
		for(int i=1;i<=10;i++){  
	        System.out.println(i);  
	    }  
		//while statement
		int z=1;
		while(z<3) {
			System.out.println("HI..");
			z++;
		}
		//Do statement
		 int i=1;    
		    do{    
		        System.out.println(i);    
		    i++;    
		    }while(i<=10);    
		}
	}



