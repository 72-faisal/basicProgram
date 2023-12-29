package reverseNumber_String;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to reverse : ");
		int num=sc.nextInt();
		int rev = 0;
		
		while(num != 0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;				
		}
		System.out.println(rev);	
		
	

//	//Method 2:StringBuilder
//	System.out.println("Enter the number to reverse : ");
//	int num= sc.nextInt();
//	StringBuilder rev ;
//	StringBuilder sb= new StringBuilder();
//	sb.append(num);
//	rev=sb.reverse();
//	System.out.println(rev);
	}
}
