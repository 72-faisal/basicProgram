package reverseNumber_String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.next();
		String rev="";
		
		int len=s.length();
		
		for (int i=len-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
//		Method 2: charArray:
		
//		char a[]=s.toCharArray();
//		int len=a.length;
//		
//		for(int i = len-1;i>=0;i--) {
//			rev=rev+a[i];
//		}
//		System.out.println(rev);
	}
}
