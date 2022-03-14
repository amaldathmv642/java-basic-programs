package Basics;

import java.util.Scanner;

public class ElementsInOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int n;
		
	   
	   
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the size");
	    n=s.nextInt();
	    int[] array=new int[n];
	    System.out.println("enter the elements");
		for(int i=0;i<n;i++)
	    {
	    	array[i]=s.nextInt();
	    }
	    System.out.println("elements are");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.printf("%d\t",array[i]);
	    }
	    System.out.println();
		System.out.println("elements in odd position");
		
		
       for(int i=0;i<n;i=i+2)
       {
    	System.out.printf("%d\t",array[i]);   
       }
	}
	}


