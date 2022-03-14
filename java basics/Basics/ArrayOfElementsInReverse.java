package Basics;

import java.util.Scanner;

public class ArrayOfElementsInReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n;
    int i;
    
    System.out.println("enter size");
    n=s.nextInt();
    int[] a=new int[n];
    System.out.println("enter elements");	
    for(i=0;i<n;i++)
    {
    	
    	
    	a[i]=s.nextInt();
    }
    System.out.println("elements are");
    for(i=0;i<n;i++)
    {
    	System.out.println(a[i]);
    }
    System.out.println("elements in reverse order are");
    for(i=n-1;i>=0;i--)
    {
    	System.out.println(a[i]);
    }
	}

}
