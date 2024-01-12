package condition;

import java.util.Scanner;

public class practice_if_else {
	public static void main(String[] args) {

//		1.Java Program to print maximum among three numbers using if-else.

//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the value of a: ");
//		int a= sc.nextInt();

//		System.out.println("enter the value of b: ");
//		int b= sc.nextInt();
//		
//		System.out.println("enter the value of c: ");
//		int c= sc.nextInt();
//		
//		if(a>b && a>c) {
//			System.out.println("a is the greatest among three number");
//		}else if(b>c) {
//			System.out.println("b is greatest among three number");
//		}else {
//			System.out.println("c is the greatest among three number");
//		}
// ------------------------------------------------------------------------------------------------------------------------
//		2.Java Program to check whether a given number is divisible by 3 or not using if-else.

//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the value of a: ");
//		int a= sc.nextInt();
//		int b=3;
//		if((a%b)==0) {
//			System.out.println("the number is divisible by 3 : " +a);
//		}else {
//			System.out.println("number is not divisible " +a);
//		}
// ------------------------------------------------------------------------------------------------------------------------

//		3.Java Program to check whether a given number is even or odd using if-else.

//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the value of a: ");
//		int a= sc.nextInt();
//		if(a%2 ==0) {
//			System.out.println("the number is even ");
//		}else {
//			System.out.println("the number is odd");
//		}
// ------------------------------------------------------------------------------------------------------------------------

//		4.Java Program to check whether a year is leap year or not using if-else.

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the year");
//		int year = sc.nextInt();
//
//		if (year % 400 == 0) {
//			System.out.println(+year +" year is leap year");
//		} else if (year % 100 == 0) {
//			System.out.println(+year +" year is not leap year");
//		} else if (year % 4 == 0) {
//			System.out.println(+year +" year is leap ");
//		}else {
//			System.out.println(+year +" year is not leap year ");
//		}
// ------------------------------------------------------------------------------------------------------------------------

//		5.Java Program to check whether a given input is digit or not using if-else.

//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the input: ");
//		char input=sc.nextLine().charAt(0);
//		
//		if(input>='0' && input<='9') {
//			System.out.println("the input is digit " +input);
//		}else {
//			System.out.println("not digit "+input);
//		}
// ------------------------------------------------------------------------------------------------------------------------

//		6.Java Program to check whether a given input is alphabet or not using if-else.
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the input: ");
//		char input=sc.nextLine().charAt(0);
//		
//		if(Character.isLetter(input)) {
//			System.out.println("given input is alphabet " +input);
//		}else if(input>='0'&&input<='9'){
//			System.out.println("given input is digit "+input);
//		}else {
//			System.out.println("given input is special character");
//		}
// ------------------------------------------------------------------------------------------------------------------------

//		7.Java Program to convert temperature from Celsius to Fahrenheit using if-else.

//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the Celcius : ");
//		float celcius =sc.nextFloat();
//		
//		float ferenhit=(celcius*9/5)+32;
//		System.out.println("celcius is "+celcius);
//		System.out.println("ferenhit is "+ferenhit);
// ------------------------------------------------------------------------------------------------------------------------

//		8.Java Program to convert temperature from Fahrenheit to  Celsiususing if-else.

//		System.out.println("enter the ferenhit :");
//		float ferenhit=sc.nextFloat();
//		float celcius=((ferenhit-32)*5)/9;
//		System.out.println(ferenhit);
//		System.out.println("the celcius is : "+celcius);
// ------------------------------------------------------------------------------------------------------------------------

//		9.Java Program to check given character is in Uppercase or lowercase

//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the char: ");
//		char ch= sc.next().charAt(0);
//		if(Character.isUpperCase(ch)) {
//			System.out.println("The char "+ ch +" is in UpperCase ");
//		}else {
//			System.out.println("The char "+ ch +" is in lowercase " );
//		}
// ------------------------------------------------------------------------------------------------------------------------

//		10.Java Program to check character is vowel or consonant 

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter The Char : ");
//		char ch = sc.next().charAt(0);
//
//		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
//					|| ch == 'O' || ch == 'U') {
//				System.out.println("Enter Char is vowel : " + ch);
//
//			} else {
//				System.out.println("Enter Char is Consonant : "+ch);
//			}
//		}else {
//			System.out.println("Enter Char is niether vowel nor consonant: "+ ch);
//		}
// ------------------------------------------------------------------------------------------------------------------------
		
//		11.Java Program to print week day for a given input week using if-else.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();
		boolean flag;
		if(num<7) {
			flag=true;
			if(num==1) {
				System.out.println("sunday");
			}else if(num==2) {
				System.out.println("monday");
			}else if(num==3) {
				System.out.println("tuesday");
			}else if(num==4) {
				System.out.println("wednesday");
			}else if(num==5) {
				System.out.println("thursday");
			}else if(num==6) {
				System.out.println("friday");
			}else if(num==7) {
				System.out.println("saturday");
			}else {
				System.out.println("invalid input");
			}
		}else {
			;System.out.println(flag=false);
		}
// ------------------------------------------------------------------------------------------------------------------------
		

	}

}
