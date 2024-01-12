package methods;

import java.util.Scanner;

public class practice_method_question {
//	1.Write a program with a method named getTotal that accepts two integers as an argument and return its sum.
//	Call this method from main( ) and print the results.

//	public static int getTotal(int num1,int num2) {
//	return num1+num2;
//		
//	}

//	2.Write a method named isEven that accepts an int argument.The method should return true if the argument
//	is even, or false otherwise.Also write a program to test your method.

//	public static boolean isEven(int num) {
//		if(num%2==0) {
//		return true;
//		}else {
//			return false;
//		}
//	}

//	3.Write a value-returning method, isVowel that returns the value true if a given character is	a vowel, and
//	otherwise returns false. In main() method accept a string from user and count number of vowels in that string.

//	private static boolean isVowel(char charAt) {
//		switch (charAt) {
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//		case 'A':
//		case 'E':
//		case 'I':
//		case 'O':
//		case 'U':
//			return true;
//		default:
//			return false;
//		}
//	}
//	Write a	method named isPrime,which takes an integer	as an argument and returns true if the argument	is a prime number, or false
//	otherwise.Also write main method that displays prime numbers between 1 to 500.

//	private static boolean isPrime(int num) {
//		for (int i = 2; i <= num; i++) {
//			if (num % i == 0) {
//				return false;
//			}
//		}
//		return true;
//
//	}

	public static boolean isPalindrom(int number) {
		int temp = number;
		int remainder;
		int reverse = 0;

		while (temp > 0) {
			remainder = temp % 10;
			temp = temp / 10;
			reverse = reverse * 10 + remainder;
		}

		return reverse == number;
	}

	public static void main(String[] args) {
//  1--	int num1=5;
//		int num2=6;
//		int sum=getTotal(num1, num2);
//		System.out.println(sum);

//	2--	System.out.println("Enter the num to check whether its even or not: ");
//		Scanner sc= new Scanner(System.in);
//		int num=sc.nextInt(); 
//		
//		if(isEven(num)) {
//			System.out.println("num is even");
//		}else {
//			System.out.println("num is not even");
//		}

//	3--	Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string: ");
//		String c = sc.nextLine();
//		int count = 0;
//		int len = c.length() - 1;
//		for (int i = 0; i <= len; i++) {
//			if (isVowel(c.charAt(i))) {
//				count++;
//			}
//		}
//		System.out.println("vowel count is : " + count);

//	4--	Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the num: ");
//		int num = sc.nextInt();
//		for (int i = 1; i <= 500; i++) {
//			if (isPrime(i)) {
//				System.out.println(i + " ");
//			} 
//		}

//	5--	Scanner sc = new Scanner(System.in);
//
//		int num;
//
//		System.out.print("Enter a number: ");
//		num = sc.nextInt();
//
//		if (isPalindrom(num)) {
//			System.out.println("Number is palindrom");
//		} else {
//			System.out.println("Number is not palindrom");
//		}

	}

}
