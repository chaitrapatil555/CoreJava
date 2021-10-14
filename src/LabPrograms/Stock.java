package LabPrograms;

class Stock
{ 
Stock c; 
Thread t; 
void Consumer (Stock c) 
{
	this.c = c; 
	 t = new Thread(" producer thread"); 
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
	 void getstock(int i) {
		// TODO Auto-generated method stub
		
	}
	void stop() 
	 { 
	 t.stop(); 
	 } 
	 } 

class Producer implements Runnable 
{ 
Stock s; 
Thread t; 
Producer(Stock s ) 
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
s.getstock((int)(Math.random()*100)); 
} 
} 
void stop() 
{ 
t.stop(); 
} 



int goods = 0; 
public synchronized void addstock(int i) 
{ 
goods = goods + i; 
System.out.println("Stock added :" + i); 
System.out.println("present stock :" + goods ); 
notify(); 
} 
public synchronized int getstock(int j) {
 
while(true) 

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
return j; 
}
 ;

public static void main(String args[]) {

Stock j = new Stock(); 
Producer p = new Producer(j); 
Consumer c = new Consumer(); 
try { 
Thread.sleep(10000); 
p.stop(); 

p.t.join(); 
((Thread) c.t).join(); 
System.out.println("Thread stopped"); 
} catch(InterruptedException e) { } 
System.exit(0); 
} 
} 
