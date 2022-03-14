package Basics;

import java.util.Scanner;

public class frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i;
		int v;
    Scanner s=new Scanner(System.in);
    System.out.println("enter size");
    n=s.nextInt();
    int[] array=new int[n];
    System.out.println("enter elements");
    for(i=0;i<n;i++)
    {
    	array[i]=s.nextInt();
    	
    }
    int temp=0;int j=0;
    System.out.println("enter value");
	v=s.nextInt();
	for(i=0;i<n;i++)
	{
		if(v==array[i])
		{
//			System.out.println(i);
			 j=i;
			temp=0;
			break;
		}
		else
		{
			temp++;
		}
	}
	if(temp==0)
	
	{
		System.out.println("the element frequency is "+j);
	}
	else
	{
		System.out.println("the entered number is invalid ");
	}
}}

