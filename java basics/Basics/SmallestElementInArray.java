package Basics;

import java.util.Scanner;

public class SmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int n;
		int min;
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the size");
	    n=s.nextInt();
	    int[] array=new int[n];
	    System.out.println("enter the elements");
	
	for(i=0;i<n;i++)
    {
    	
	array[i]=s.nextInt();
    }
    min=array[0];
    for(i=0;i<n;i++)
    {
    	if(array[i]<min)
    	{
    		min=array[i];
    	}}
    	System.out.println("smallest element in the array is "+min);
    }
   
}


