package LabPrograms;

import java.lang.Thread;
import java.lang.System;
import java.lang.Math;
import java.lang.InterruptedException;
class ThreadSynchronization
{
public static void main (String args [ ])
{
MyThread1 thread1 = new MyThread1 ();
MyThread1 thread2 = new MyThread1 ();
thread1.start ( );
thread2.start ( );
boolean thread1IsAlive = true;
boolean thread2IsAlive = true;
do
{
if (thread1IsAlive && !thread1.isAlive ( ) )
{
thread1IsAlive = false;
System.out.println ("Thread 1 is dead.");
}
if (thread2IsAlive && !thread2.isAlive ( ))
{
thread2IsAlive = false;
System.out.println ("Thread 2 is dead.");
}
}while (thread1IsAlive || thread2IsAlive);
}

public static void displayList(String name, String[] message) {
	// TODO Auto-generated method stub
	
}
}
class MyThread1 extends Thread
{
static String message [ ] = {"Java", "is", "object", "oriented,","programming", "language." };
public MyThread1 (String id)
{
super (id);
}
public MyThread1() {
	// TODO Auto-generated constructor stub
}
public void run ( )
{
ThreadSynchronization.displayList (getName(),message);
}

void randomWait ()
{
try
{
sleep ( (long ) (3000*Math.random ( )) );
}

catch (InterruptedException x )
{
System.out.println ("Interrupted!");
}
}

public static synchronized void displayList(String name,
String list [ ])
{
for (int i=0;i<list.length; i++)
{
MyThread1 t = (MyThread1) Thread.currentThread ( );
t.randomWait ( );
System.out.println (name + list [i]);
}
}
}

