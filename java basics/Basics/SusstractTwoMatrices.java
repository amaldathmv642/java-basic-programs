package Basics;

import java.util.Scanner;

public class SusstractTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int row,colm,i,j;
		System.out.println("enter row size");
		row=s.nextInt();
		System.out.println("enter colm size");
		colm=s.nextInt();
		int a[][]=new int[row][colm];
		int b[][]=new int[row][colm];
		int c[][]=new int[row][colm];
		System.out.println("enter elements of a");
		for(i=0;i<row;i++)
		{
			for(j=0;j<colm;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter elements of b");
		for(i=0;i<row;i++)
		{
			for(j=0;j<colm;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
	 
	for(i=0;i<row;i++)
	{
		for(j=0;j<colm;j++)
		{
			c[i][j]=a[i][j]-b[i][j];
			
		}
	}
	System.out.println("substract of two matrices is: ");
	for(i=0;i<row;i++)
	{
		for(j=0;j<colm;j++)
		{
			System.out.printf("%d\t",c[i][j]);
	    
		
			
		}
		System.out.println("");
	}
	}


	}


