package SessionTask;

import java.io.IOException;

public class ApplicationOpenProcess {

	public static void main(String[] args) {
		
		Runtime r;
		r=Runtime.getRuntime();
		System.out.println(r.freeMemory());
		int x[]= {1};
		r.gc();
		System.out.println(r.freeMemory());
		try {
			Process p=r.exec("notepad.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(r.freeMemory());
		

	}

}
