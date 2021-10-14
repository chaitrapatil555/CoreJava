package LabPrograms;

public class ComplexProgram extends Thread {

	private int delay;
	
	ComplexProgram(String name,float seconds){
		super(name);
		delay=(int)seconds*1000; //delay are in milliseconds
		start();
		//Thread.currentThread().setPriority(delay);
		
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			System.out.println(Thread.currentThread().getName());
			//System.out.println(Thread.currentThread().getPriority());
			//Thread.currentThread().setPriority(delay);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return ;
			}
			//break;
		}
		
	}

	public static void main(String[] args) {
		
		new ComplexProgram("One orange",1.1F);
		new ComplexProgram("Two orange",1.3F);
		new ComplexProgram("Three orange",1.5F);
		new ComplexProgram("four",0.7F);
		
	}

}
