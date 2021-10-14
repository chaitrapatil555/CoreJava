package LabPrograms;
import java.util.Scanner;
import java.util.Arrays;


public class AscendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    //Array Size Initialization
        
        int arr[]=new int[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     //Array Initialization
        {
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);    //Sorts the Array in Ascending Order
 
    //    System.out.printf("Sorted arr[] : %s", Arrays.toString(arr));   //Prints the sorted Array

	}

}
