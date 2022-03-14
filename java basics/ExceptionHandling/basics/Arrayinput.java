package basics;

import java.util.Scanner;

public class Arrayinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the size");
    n=s.nextInt();
    int[] array=new int[10];
    System.out.println("enter the elements");
    
	for(int i=0;i<n;i++)
    {
    	array[i]=s.nextInt();
    }
    System.out.println("elements are");
    for(int i=0;i<n;i++)
    {
    	System.out.println(array[i]);
    }
	
	}

}
