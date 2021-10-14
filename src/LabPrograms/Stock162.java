package LabPrograms;

class Consumer1 implements Runnable 
{ 
Stock162 c; 
Thread t; 
Consumer1 (Stock162 c) 
{this.c = c; 
t = new Thread(this, "producer thread"); 
t.start(); 
} 
public void run() 
{ 
while (true) 
{ 
try { 
t.sleep(750); 
} catch (InterruptedException e) { } 
c. getstock((int)(Math.random()*100)); 

}

}
void stop() 
{ 
t.stop(); 
}
}
class Producer1 implements Runnable 
{ 
Stock162 s; 
Thread t; 
Producer1(Stock162 s ) 
{ 
this.s = s; 
t = new Thread(this, "producer thread"); 
t.start(); 
} 
public void run() 
{ 
while(true) 
{ 
try 
{ 
t.sleep(750); 
} catch (InterruptedException e) { } 
s.addstock((int)(Math.random()*100)); 
} 
} 
void stop() 
{ 
t.stop(); 
}
}
public class Stock162 {
	int goods = 0; 
	 public synchronized void addstock(int i) 
	 { 
	 goods = goods + i; 
	 System.out.println("Stock added :" + i); 
	 System.out.println("present stock :" + goods ); 
	 notify(); 
	 } 
	 public synchronized int getstock(int j) 
	 { 
	 while(true) 
	 { 
	 if(goods >= j) 
	 { 
	 goods = goods - j ; 
	 System.out.println("Stock taken away :" + j); 
	 System.out.println("Present stock :" + goods); 
	 break; 
	 } 
	 else { 
	 System.out.println("Stock not enough …" ); 
	 System.out.println (" Waiting for stocks to come …"); 
	 try { 
	 wait(); 
	 }catch(InterruptedException e) { } 
	 } 
	 } // end of while 
	 return goods; 
	 } 
	 public static void main(String args[]) 
	 { 
	 Stock162 j = new Stock162(); 
	 Producer1 p = new Producer1(j); 
	 Consumer1 c = new Consumer1(j); 
	 try { 
	 Thread.sleep(10000); 
	 p.stop(); 
	 c.stop(); 
	 p.t.join(); 
	 c.t.join(); 
	 System.out.println("Thread stopped"); 
	 } catch(InterruptedException e) { } 
	 System.exit(0); 
	 } 
}