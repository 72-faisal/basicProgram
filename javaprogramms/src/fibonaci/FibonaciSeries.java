package fibonaci;

public class FibonaciSeries {
public static void main(String[] args) {
	int a= 0;
	int b= 1;
	int sum = 0;
	
	System.out.println(a + " " + b);
	
	for(int i=2;i<10;i++) {
		sum=a+b;
		a=b;
		b=sum;
		
	}	
	System.out.println(" "+sum);
} 

}
