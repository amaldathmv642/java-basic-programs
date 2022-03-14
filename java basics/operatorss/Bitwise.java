package operatorss;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num1=30,num2=50,num3=40;
	/* Bitwise AND */
    System.out.println("num1 & num2="+(num1 &num2));
	/* Bitwise OR */
    System.out.println("num1 | num2="+(num1 | num2));
	/* Bitwise XOR */
    System.out.println("num1 ^ num2="+(num1 ^ num2));
	/* Binary compliment */
    System.out.println("~num1"+~num1);
	/*Binary left shift*/
    num3=num1<<1;
    System.out.println("num1<<1="+num3);
    //binary right shift//
    num3=num1>>1;
    System.out.println("num1>>1="+num3);
    //right shift zero fill
    num3=num1>>2;
    System.out.println("num1>>1="+num3);
    }

}
