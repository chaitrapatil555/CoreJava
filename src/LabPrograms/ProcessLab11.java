package LabPrograms;

import java.io.*;
class ProcessLab11
{
public static void main(String a[])throws IOException
{
Runtime r;
r = Runtime.getRuntime();
System.out.println(r.freeMemory());
int x[] = {1};
r.gc();
System.out.println(r.freeMemory());

System.out.println(r.freeMemory());
}
}

