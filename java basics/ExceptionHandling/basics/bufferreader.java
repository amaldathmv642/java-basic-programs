package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferreader {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("enter a number");
    int a=Integer.parseInt(br.readLine());
    System.out.println("you entered"+a);
}
}