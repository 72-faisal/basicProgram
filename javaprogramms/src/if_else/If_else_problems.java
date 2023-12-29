package if_else;

import java.util.Scanner;

public class If_else_problems {
	public static void main(String[] args) {

//		the problem is get marks from user and give the grade according to marks stud have...

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int marks = sc.nextInt();

		if (marks <= 100 && marks >= 80) {
			System.out.println("You got the A+ grade & " + " Your marks is :" + marks);
		} else if (marks <= 79 && marks >= 60) {
			System.out.println("You got the A grade & " + " Your marks is :" + marks);
		} else if (marks <= 59 && marks >= 50) {
			System.out.println("You got the B grade & " + " Your marks is :" + marks);
		} else if (marks <= 49 && marks >= 35) {
			System.out.println("You got the C grade & " + " Your marks is :" + marks);
		} else {
			System.out.println("Sorry , Better luck next time ..");
		}

	}

}
