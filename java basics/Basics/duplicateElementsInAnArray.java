package Basics;



public class duplicateElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
	
		int j;
	 int[] array= {1,2,2,3,4,3,4};
	System.out.println("duplicate elements in array");
	for(i=0;i<7;i++)
	{
		for(j=i+1;j<7;j++)
		{
         if(array[i]==array[j])
         {
			
			
				System.out.println(array[j]);
				
		}
	}
	
	}

	}}
