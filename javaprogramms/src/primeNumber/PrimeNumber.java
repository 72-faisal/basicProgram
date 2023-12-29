package primeNumber;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num : ");
		int num = sc.nextInt();
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Number is Prime");
			} else {
				System.out.println("Not Prime");
			}
		} else {
			System.out.println("not a Prime Number");
		}
	}
}
