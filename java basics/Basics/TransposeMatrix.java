package Basics;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int row,colm,i,j;
		System.out.println("enter row size");
		row=s.nextInt();
		System.out.println("enter colm size");
		colm=s.nextInt();
		int a[][]=new int[row][colm];
		int t[][]=new int[row][colm];
		
		System.out.println("enter elements of a");
		for(i=0;i<row;i++)
		{
			for(j=0;j<colm;j++)
			{
				a[i][j]=s.nextInt();
			}
			
			
			
		}System.out.println("after transpose");
		for(i=0;i<colm;i--)
		{
			for(j=0;;j--)
			{
				System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}
		
			
			}
		}


