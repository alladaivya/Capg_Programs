package test1;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		int a=0,b=1;
		int c,n;
		System.out.println("Enter the nth number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i<=n-2; i++) {
			c = a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
