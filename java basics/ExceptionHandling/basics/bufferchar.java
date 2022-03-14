package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferchar {

	public static void main(String[] args)throws NumberFormatException,IOException{
		// TODO Auto-generated method stub
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter a letter");
String a= br.readLine();
  
 System.out.println("letter is"+a);
	}

}
