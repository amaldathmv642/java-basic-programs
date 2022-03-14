package Basics;

import java.util.Scanner;

public class largestElemenetInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int n;
		int max;
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the size");
	    n=s.nextInt();
	    int[] array=new int[10];
	    System.out.println("enter the elements");
	    for(i=0;i<n;i++)
	    {
	    	array[i]=s.nextInt();
	    }
	    max=array[0];
	    for(i=0;i<n;i++)
	    {
	    	if(array[i]>max)
	    	{
	    		max=array[i];
	    	}}
	    	System.out.println("largest element in the array is "+max);
	    }
	   
	}



