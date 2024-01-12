package loops;

import java.util.Scanner;

public class practice_loops_question {
	public static void main(String[] args) {

//	1.Write a program to print numbers from 1 to 10.

//		for(int i=1;i<=10;i++) {
//			System.out.print(i);
//		}
// ------------------------------------------------------------------------------------------------------------------------

//	2.Write a program to calculate the sum of first 10 natural number.

//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			sum =sum+i;
//		}
//		System.out.println(sum);
// ------------------------------------------------------------------------------------------------------------------------	
//	3.Write a program that prompts the user to input a positive integer.
//		It should then print the multiplication table of that number. 

//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter positive number :");
//		int i=sc.nextInt();
//		System.out.println("The table of "+ i+ "");
//		for(int j=1;j<=10;j++) {
//			
//			System.out.println(+i+ " * "+ j+ " = " +(i*j));
//		}
// ------------------------------------------------------------------------------------------------------------------------	

//	4.Two numbers are entered through the keyboard.Write a program to -  
//		  find the value of one number raised to the power of another. (Do not use Java built-in method)

//		int base;           //10(base)^3(power)=result(1000)
//		int power;
//		int result=1;
//		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the base : ");
//		base=sc.nextInt();
//		System.out.println("Enter the power : ");
//		power=sc.nextInt();
//		
//		for(int i=1;i<=power;i++) {
//			result=result*base;
//		}
//		System.out.println(result);
// ------------------------------------------------------------------------------------------------------------------------	
//	5.Write a program to find the factorial value of any number entered through the keyboard.

//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the num: ");
//		int num=sc.nextInt();
//		int factorial=1;
//		
//		for(int i=1;i<=num;i++) {
//			factorial= factorial*i;
//		}
//		System.out.println(factorial );
// ------------------------------------------------------------------------------------------------------------------------	
//	6.Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 

//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter the number: ");
//		int num=sc.nextInt();
//		int rev=0;
//		
//		
//		
//		while(num!=0) {
//			int digit=num%10;
//			rev=rev*10+digit;
//			num=num/10;
//		}
//		System.out.println(rev);
// ------------------------------------------------------------------------------------------------------------------------	
//	7.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

//		{
//	        Scanner console = new Scanner(System.in);
//	     
//	        int number;
//	        char choice;
//	        int evenSum = 0;
//	        int oddSum = 0;
//	        
//	        do
//	        {
//	            System.out.print("Enter the number ");
//	            number = console.nextInt();
//	        
//	            if( number % 2 == 0)
//	            {
//	                evenSum++;
//	            }
//	            else
//	            {
//	                oddSum++;
//	            }
//	        
//	            System.out.print("Do you want to continue y/n? ");
//	            choice = console.next().charAt(0);
//	            
//	        }while(choice=='y' || choice == 'Y');
//	        
//	        System.out.println("Sum of even numbers: " + evenSum);
//	        System.out.println("Sum of odd numbers: " + oddSum);
//	    } 
// ------------------------------------------------------------------------------------------------------------------------	

//	9.palindrome number

//	Scanner sc= new Scanner(System.in);
//	
//	System.out.println("enter the num1: " );
//	int num=sc.nextInt(); 
//		
//	int rev=0;
//	int ori_num=num;
//	
//	while (num!=0) {
//		int digit=num%10;
//		rev=rev*10+digit;
//		num=num/10;
//	}
//	if(ori_num==rev) {
//		System.out.println("prime number");
//	}else {
//		System.out.println("not prime nuber ");
//	}
// ------------------------------------------------------------------------------------------------------------------------	

//	8.Write a program that prompts the user to input a positive integer.
//	It should then output a message indicating whether the number is a prime number. 

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the num: ");
//		int num = sc.nextInt();
//
//		int count = 0;
//		if (num > 1) {
//			for (int i = 1; i <= num; i++) {
//				if (num % i == 0) {
//					count++;
//				}
//			}
//			if (count == 2) {
//				System.out.println("prime number");
//			} else {
//				System.out.println("not prime");
//			}
//
//		}
// ------------------------------------------------------------------------------------------------------------------------	

//  10.Write a do-while loop that asks the user to enter two numbers. The numbers should be added and
//	 the sum displayed. The loop should ask the user whether he or she wishes to 
//	 perform the operation again. If so, the loop should repeat; otherwise it should terminate.

//		int num1;
//		int num2;
//		char choose;
//		do {
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter the num1: ");
//			num1= sc.nextInt();
//			
//			System.out.println("Enter the num2: ");
//			num2=sc.nextInt();
//			
//			int result=num1+num2;
//			System.out.println(result);
//			
//			System.out.println("did you want to continue? y/n");
//			choose=sc.next().charAt(0);
//			System.out.println();
//		}while(choose=='y' || choose=='Y');
// ------------------------------------------------------------------------------------------------------------------------	

//	11.Write a program to enter the numbers till the user wants and at the end 
//		it should display the count of positive, negative and zeros entered. 

//		int num;
//		int positiveCount = 0;
//		int negetiveCount = 0;
//		int zerCount = 0;
//		char choice;
//
//		do {
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the num : ");
//			num = sc.nextInt();
//
//			if (num > 0) {
//				positiveCount++;
//			} else if (num < 0) {
//				negetiveCount++;
//			} else {
//				zerCount++;
//			}
//			System.out.println("Did you want to continue? y/n");
//			choice = sc.next().charAt(0);
//			
//			
//		} while (choice == 'y' || choice == 'Y');
//		System.out.println("Positive Count :" +positiveCount);
//		System.out.println("Negetive Count :" +negetiveCount);
//		System.out.println("Zero Count :" +zerCount);

// ------------------------------------------------------------------------------------------------------------------------	

//	12.Write a program to enter the numbers till the user wants and at the end the program should 
//		display the largest and smallest numbers entered.

//		int num;
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		char choice;
//		do {
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the num : ");
//			num = sc.nextInt();
//
//			if (num > max) {
//				max = num;
//			}
//			if (num < min) {
//				min = num;
//			}
//			System.out.println("did you want to continue? y/n");
//			choice = sc.next().charAt(0);
//
//		} while (choice == 'y' || choice == 'Y');
//		System.out.println(max);
//		System.out.println(min);
// ------------------------------------------------------------------------------------------------------------------------		

//	13.Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit
//		of the number is equal to the number itself, then the number is called an Armstrong number.

//		int digit1;
//		int digit2;
//		int digit3;
//		
//		for(int num=1;num<=300;num++) {
//			int temp=num;
//			digit1=temp%10;
//			
//			temp=temp/10;
//			digit2=temp%10;
//			
//			temp=temp/10;
//			digit3=temp%10;
//			
//			if(digit1*digit1*digit1 + digit2*digit2*digit2+ digit3*digit3*digit3 ==num) {
//				System.out.println(num);
//			}		
//						
//		}
// ------------------------------------------------------------------------------------------------------------------------		

//	14.Write a program to print Fibonacci series of n terms where n is input by user :
//			0 1 1 2 3 5 8 13 24 ..... 

//		Scanner sc= new Scanner(System.in);
//		int n1=0;
//		int n2=1;
//		System.out.println("Enter the number :");
//		int num=sc.nextInt();
//		System.out.println(n1+ "  "+ n2);
//		
//		for(int i=3;i<=num;i++) {
//			int temp=n1+n2;
//			n1=n2;
//			n2=temp;
//			System.out.println(temp);
//		}
// ------------------------------------------------------------------------------------------------------------------------		
//	15.Write a program to calculate the sum of following series where n is input by user. 
//		1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 

//		double sum=0;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the num");
//		int num=sc.nextInt();
//		
//		for(int i=1;i<=num;i++) {
//			
//			sum +=1.0/i;
//		}
//		System.out.println(sum);
// ------------------------------------------------------------------------------------------------------------------------		

//	16.Compute the natural logarithm of 2, by adding up to n terms in the series
//		1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
//		where n is a positive integer and input by user.

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int num=sc.nextInt();
//		int sign=1;
//		double sum=0;
//		
//		for(int i=1; i<=num;i++) {
//			sum=sum+(1.0*sign)/i;
//			sign=sign*-1;	
//		}
//		System.out.println(sum);
//		sc.close();
// ------------------------------------------------------------------------------------------------------------------------		

//	17.Write a program that generates a random number and asks the user to guess what the number is. If the user's 
//	guess is higher than the random number, the program should display "Too high, try again." If the user's 
//	guess is lower than the random number, the program should display "Too low, try again." 
//	The program should use a loop that repeats until the user correctly guesses the random number.

//		Scanner sc= new Scanner(System.in);
//		int num;
//		int guess;
//		int tries=0;
//		
//		num=(int) ((Math.random()*100)+1);
////		System.out.println(num);
//		
//		System.out.println("Guessing Number Game 😁😁😁");
//		System.out.println();
//		do {
//			System.out.println("Enter The Guessing Number: ");
//			guess=sc.nextInt();
//			
//			tries++;
//			
//			
//			if(guess>num) {
//				System.out.println("too high");
//			}else if(guess<num) {
//				System.out.println("too low");
//			}else {
//				System.out.println("you got the right number :"+num + " and you have this number of tries:"+tries);
//			}
//			
//		}while(guess!=num);
// ------------------------------------------------------------------------------------------------------------------------		

//	18.printing patterns:

//	i)  **********
//		**********
//		**********
//		**********

//		int n=4;
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=10;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		ii)      *
//               **
//               ***
//               ****	
//               *****
//		
//		int n=5;
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		iii)		    *
//					   **
//					  ***
//					 ****
//					*****

//		int n=5;
//		for(int i=1;i<=n;i++) {

//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		iv) pattern-pyramid

// 		  *
//	    * * *	
//	  * * * * *
//  * * * * * * *

//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= n-i; j++) {
//				System.out.print(" ");
//			}	
//			for (int j = 1; j <= 2*i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		v)number=pyramid
		
//		    1
//	       222
//	      33333
//	     4444444
//	    555555555
		
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= n-i; j++) {
//				System.out.print(" ");
//			}	
//			for (int j = 1; j <= 2*i-1; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		
//		       1
//		      212
//		     32123
//		    4321234
//		   543212345
		
//		int n = 5;
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= n-i; j++) {
//				System.out.print(" ");
//			}	
//			for (int j = i; j >= 1; j--) {
//				System.out.print(j);
//			}
//			for(int j=2;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
	}
}
