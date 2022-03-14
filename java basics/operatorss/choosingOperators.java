package operatorss;

import java.util.Scanner;

public class choosingOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=0,p,q;
		do
			
		{
		System.out.println("             Arithametic operators");
		System.out.println("           --------------------------");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.division");
        System.out.println("5.Modulus");
        System.out.println("6.Exit");
        System.out.println("choose your choice");
		
		
         a=s.nextInt();
        
        	
        
        	
        	
        int x;
        switch(a)
        {
        case 1:System.out.println("enter first number");
    	 p=s.nextInt();
    	System.out.println("enter second number");
    	 q=s.nextInt();
    	 
//    	 p=s.nextInt();
//    	System.out.println("enter second number");
//    	 q=s.nextInt();
    	x=p+q;
        System.out.println("sum is "+x);
        break;
        case 2:System.out.println("enter first number");
        p=s.nextInt();
        System.out.println("enter second number");
        q=s.nextInt();
    	x=p-q;
        System.out.println("substract is "+x);
        break;
        case 3:System.out.println("enter first number");
    	p=s.nextInt();
    	System.out.println("enter second number");
    	q=s.nextInt();
    	x=p*q;
        System.out.println("product is "+x);
        break;
        case 4:System.out.println("enter first number");
    	p=s.nextInt();
    	System.out.println("enter second number");
    	q=s.nextInt();
    	x=p/q;
        System.out.println("dividend is "+x);
        break;
        case 5:System.out.println("enter first number");
    	p=s.nextInt();
    	System.out.println("enter second number");
    	q=s.nextInt();
    	x=p%q;
        System.out.println("mod is "+x);
        break;
        default:
        	System.out.println("invalid entry");
        break;
        }
        if(a==6)
        {
        	return;
        	}
        }
        
	while(a!=0);
	{

	}}}
