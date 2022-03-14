package ExceptionHandling;

public class Example3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
try
{
	String bc=null;
	System.out.println(bc.length());
}
catch(NullPointerException e)
{
System.out.println("NullPointerException");	
}
finally
{
	int b=20;
	System.out.println(b);
}
}

}
