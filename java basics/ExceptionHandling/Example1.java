package ExceptionHandling;

public class Example1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    try
    {
    int DividedByZero=5/0;
    System.out.println("Rest of code");
    }
    catch(ArithmeticException e)
    {
    	System.out.println("ArithmaticException ");
    }
    finally
    {
    	int a=30;
    	int b=20;
    	int c=a+b;
    	System.out.println(c);
    }
	}

}
