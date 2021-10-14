package LabPrograms;

public class Array {

	public static void main(String[] args) {
		//to find length of an array
		int[] num = new int[10];    
		int arrayLength=num.length;  
		//prints array length  
		System.out.println("The length of the array is: "+ arrayLength);   
		
		//one dimentional array
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;  
		System.out.println("One dimensional array elements are");    
		System.out.println(a[0]);    
		System.out.println(a[1]);    
	    
		//two dimentional array
		
		 int[][] arr = new int[10][20];
	        arr[0][0] = 1;
	        System.out.println ("two dimentional :");
	        System.out.println("arr[0][0] = " + arr[0][0]);
        
	        //multi dimentional array
	        
	        int[][][] intArray = { { { 1, 2, 3}, { 4, 5, 6 } ,  { 7, 8, 9 } } }; 
	        System.out.println ("multidimentional :");
	       
	        for (int i = 0; i < 1; i++) 
	            for (int j = 0; j < 3; j++) 
	            for (int z = 0; z < 3; z++) 
	                System.out.println ("intArray [" + i 
	            + "][" + j + "][" + z + "] = " + intArray [i][j][z]); 
	        
		}   

	}

