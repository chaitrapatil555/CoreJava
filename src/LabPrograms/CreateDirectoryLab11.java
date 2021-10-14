package LabPrograms;

import java.io.*;
class CreateDirectoryLab11
{
public static void main (String args[]) throws IOException
{

File f = new File ("c:/newfile/JAVA");
if (f.mkdir())
System.out.println("created a directory");
else
System.out.println ("unable to create a directory");
}
}

