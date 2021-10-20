package test1;
import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;
		System.out.println("Enter the nth number");
		int n = sc.nextInt();
		result = calculateSum(n);
		System.out.println("The result of sum divisible by 3 or 5");
	     System.out.println(result);
	}
	static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
		if (i%3==0 || i%5==0) {
			sum = sum+i;
		}	
	}
		return sum;
    }
}
