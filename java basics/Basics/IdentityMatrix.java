package Basics;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int row,colm,i,j;
		boolean flag=true;
		System.out.println("enter row size");
		row=s.nextInt();
		System.out.println("enter colm size");
		colm=s.nextInt();
		int a[][]=new int[row][colm];
		
		
		System.out.println("enter elements of a");
		for(i=0;i<row;i++)
		{
			for(j=0;j<colm;j++)
			{
				a[i][j]=s.nextInt();
			}
	}
if(row!=colm) 
{
	System.out.println("it is a square matrix");
}
else
{
	for(i=0;i<row;i++)
	{
		for(j=0;j<colm;j++)
		{
			if(i==j&&a[i][j]!=1)
			{
				flag=false;
				break;
			}
			if(i!=j&&a[i][j]!=0)
			{
				flag=false;break;
			}
		}
	}
	if(flag)
	{
		System.out.println("given matrix is identity");
	}
	else
	{
		System.out.println("given matrix is not identity");
	}
}
	
}
}
