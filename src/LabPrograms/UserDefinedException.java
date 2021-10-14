package LabPrograms;

class MyException extends Exception
{
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
  
// A Class that uses above MyException
public class UserDefinedException
{
    // Driver Program
    public static void main(String args[])
    {
        try
        {
            // Throw an object of user defined exception
            throw new MyException("Java");
        }
        catch (MyException ex)
        {
            System.out.println("proram");
  
            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}