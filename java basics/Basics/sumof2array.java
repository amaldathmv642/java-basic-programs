package Basics;

import java.util.Scanner;

public class sumof2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;		
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int n=s.nextInt();

int a[]=new int[n];
int b[]=new int[n];
int c[]=new int[n];
System.out.println("first array elements");
for(i=0;i<n;i++)
{
	

a[i]=s.nextInt();
}System.out.println("second array elements");
for(i=0;i<n;i++)
{

b[i]=s.nextInt();	

}
for(i=0;i<n;i++)
	
{
c[i]=a[i]+b[i];
}System.out.println("sum of 2 arrays are");
for(i=0;i<n;i++)
{
	System.out.printf("%d\t",c[i]);
		
}
		
		}	
}	