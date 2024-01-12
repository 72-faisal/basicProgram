package condition;

import java.util.Scanner;

public class if_else_and_basic {

//	static byte a; 	//default value is :0  
//	static short b;	//default value is :0  
//	static int c;	//default value is :0  
//	static long d;	//default value is :0 

//	static float a;  //default value is 0.0
//	static double b; //default value is 0.0

//	static boolean a; //default value is false 

	static char a; //default value is /u0000

	public void print() {
		System.out.println("the default value of char a is: " + a);
	}

	public static void main(String[] args) {

//		What is Variable?
//	    - Variable is storage location in program's memory where value stored.

//		what is data-types?
//		Data-types is something which indicate that which types of value variable hold.
		
//		types of data-type:
//		1.primitive data-type
//		2.non-primitive data-type
		
//		1.primitive data-type
//		-it has 4 main types:
//		1.integer		
//		2.floating-point number
//		3.boolean
//		4.char
		
//		now integer has some more types like:
//		byte ,short,int,long;
		
//		floating-point has:
//		float,double.
		
//		boolean is use for true and false
//		char has single char in variable.
		
//		defalut values of each integer type:
//	
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
		
//		default value of floating point number:
		
		
//		System.out.println(a);
//		System.out.println(b);
		
//		defalut value of boolean :
//		System.out.println(a);
		
		
//		now we move to if else
		
//		1.simple if
//		2.if else
//		3.if else if 		
//		4.nested if
//		5.shorthand if else
		
//		1. simple if
//		int a = 5;
//		int b = 6;
//		if(a<b){
//			System.out.println("The value of " +a+ " is less than "+b);
//		}
		
//		2.if else
		
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the Age:" );
//		int age= sc.nextInt();
//		if(age>=18) {
//			System.out.println("You age is "+age +" so ,You can drive or vote now ");
//		}else {
//			System.out.println("You are under age .");
//		}
		
		
//		3.if else if
		
//		System.out.println("Enter the Marks : ");
//		int marks = sc.nextInt();
//		
//		if(marks<=100 && marks>=90) {
//			System.out.println("You got A+ grade.");
//		}else if(marks<=89 && marks>=80) {
//			System.out.println("You got A grade");
//		}else if(marks<=79 && marks>=70) {
//			System.out.println("You got B grade");
//		}else if(marks<=69 && marks>=55) {
//			System.out.println("You got C grade");
//		}else if(marks<=54 && marks>=35) {
//			System.out.println("You got D grade");
//		}else {
//			System.out.println("Sorry, You are fail");
//		}
		
//		4.nested if
		
//		int a=65;
//		int b=55;
//		int c=35;
//		
//		if(a>b) {
//			if(a>c) {
//				System.out.println(" a is the greater than b and c");
//			}
//			else {
//				System.out.println("a is smaller than c ");
//			}	
//			
//		}else if(b>c) {
//			System.out.println("b is greater than and c ");
//		}else {
//			System.out.println("c is the greatest among three.");
//		}
		
//		5.short-hand if-else:
//		
//		System.out.println("enter the age : ");
//		int age = sc.nextInt();
//		String result=(age>18)?"you can drive":"you can not drive";
//		System.out.println(result);

	}
}
