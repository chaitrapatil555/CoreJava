package LabPrograms;
public class BinaryTrainangle{
public static void main(String[] args) {
	String k = "1", l = "" , s = "1";
	 int m = 0;
	 int n = 5; //* if necessary change the value of n** //
	 System.out.println("1");
	 for (int i = 0; i < n; i++)
	 {
	 for (int j = 1; j < m; j++)
	 {
	l+= "0";
	 }
	 if(i==0) {
		 System.out.println("");
	 }
	 else {
	 System.out.println (k + l +  s + "\n");
	 }
	 l = "";
	 m += 2;
	 }
}



}