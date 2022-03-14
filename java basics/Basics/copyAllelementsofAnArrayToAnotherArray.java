package Basics;

import java.util.Scanner;

public class copyAllelementsofAnArrayToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the size");
	    n=s.nextInt();
	    int[] a=new int[10];
	    int[] b=new int[10];
	    System.out.println("enter the elements");
	    int i;
		for( i=0;i<n;i++)
	    {
			
	    	a[i]=s.nextInt();
	    	
	    }
		
		System.out.println("elements in a");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<n;i++)
		{
		b[i]=a[i];
		}
		System.out.println("elements in b");
		for(i=0;i<n;i++)
		{
		
		
		
		System.out.println(b[i]);
		}
		
		
		
		
		
		
	}}
		