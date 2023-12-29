package Arrayss_Strings;

public class EvenOddFromArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 6 };
	
	for(int v:a) {
		if(v%2==0) {
			System.out.println("even array");
		}else if(v%2!=0) {
			System.out.println("odd array");
		}
		else {
			System.out.println("invalid integer");
		}
	}
		
	}

}
