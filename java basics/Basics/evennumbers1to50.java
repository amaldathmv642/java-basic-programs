package Basics;

public class evennumbers1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=50;
 int i=1;
 System.out.println("even numbers between 1 and 50");
 for(i=1;i<=n;i++)
 {
	 if(i%2==0)
		 System.out.println(i++);
 }
	}

}
