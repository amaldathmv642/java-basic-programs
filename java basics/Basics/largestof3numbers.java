package Basics;

import java.util.Scanner;

public class largestof3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter first number");
		int a=s.nextInt();
		System.out.println("enter second number");
		int b=s.nextInt();
		System.out.println("enter third number");
		int c=s.nextInt();
		
		if(a>b&&a>c)
		{
			System.out.println("large is "+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("large is "+b);
		}
		else
			System.out.println("large is "+c);
			{
				
			}
		}
}
