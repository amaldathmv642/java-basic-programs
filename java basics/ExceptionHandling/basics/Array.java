package basics;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int n;
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the size");
	    n=s.nextInt();
	    int[] array=new int[10];
	    System.out.println("enter the elements");
	    
		for(int i=0;i<n;i++)
	    {
	    	array[i]=s.nextInt();
	    }
	    
	    
	    int  sum=0;
		for(int i=0;i<n;i++)
	    {
	    sum=sum+array[i];
	    }
		System.out.println("sum of elements"+sum);
		
		
		

	}
	}


