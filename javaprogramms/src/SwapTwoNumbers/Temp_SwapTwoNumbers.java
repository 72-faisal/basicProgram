package SwapTwoNumbers;

import java.util.Scanner;

public class Temp_SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value of A : ");
		int a= sc.nextInt();
		

		System.out.println("Enter the Value of B : ");
		int b= sc.nextInt();
		
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("The value of A : "+a);
		System.out.println("The value of B : "+b);
		
	}

}
