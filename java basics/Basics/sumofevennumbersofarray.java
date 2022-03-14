package Basics;

import java.util.Scanner;

public class sumofevennumbersofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int i;
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int n=s.nextInt();
int a[]=new int[n];

for(i=0;i<n;i++)
{
	a[i]=s.nextInt();
	if(a[i]%2!=0)
	{
		sum=sum+a[i];
	}

	
	}

System.out.println(sum);
}
}
