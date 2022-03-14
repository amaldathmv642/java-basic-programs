package Basics;

import java.util.Scanner;

public class DuplicateElementInArray {

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
	    int length=n;
	   
		length=removeDuplicate(array,length);
	    for(int i=0;i<length;i++)
	    {
	    System.out.println(array[i]+"");	
	    }
	    	}
	public static int removeDuplicate(int array[],int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(array[i]!=array[i+1])
			{
				array[j++]=array[i];
				
			}
		}
		array[j++]=array[n-1];
		return j;
	}
	    }
	
	

