package Basics;

import java.util.Scanner;

public class leftRotateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int n;
		int p;
    Scanner s=new Scanner(System.in);
    System.out.println("enter size");
   
    n=s.nextInt();
    int[] array=new int[n];
    
    System.out.println("enter elements");
    for(i=0;i<n;i++)
    {
    array[i]=s.nextInt();
    }
    System.out.println("elements are");
    for(i=0;i<n;i++)
    {
    	System.out.println(array[i]);
    }
    System.out.println("enter position");
    p=s.nextInt();
    System.out.println("array after left rotation"); 
    for(i=p;i<n;i++)
    {
    	
    System.out.println(array[i]);
    			
    }}}

