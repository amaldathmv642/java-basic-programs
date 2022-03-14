package ExceptionHandling;

public class Example4 
{

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
try
{
    int a[]=new int[10];
    a[11]=22;
    System.out.println("number is");
	}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexBoundException");	
}
finally
{
	int b[]=new int[11];
	b[6]=7;
	System.out.println(b[6]);
}
}
}