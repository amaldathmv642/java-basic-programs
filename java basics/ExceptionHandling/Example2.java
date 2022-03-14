package ExceptionHandling;

public class Example2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 try
 {
	 String a="amal";
	 int b=Integer.parseInt(a);
	 System.out.println(a);
 }
catch(NumberFormatException e)
{
	System.out.println("NumberFormatException");
}	finally
	{
		String b="amarish";
		System.out.println(b);
	}
	}

}
