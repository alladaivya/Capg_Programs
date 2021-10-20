package test1;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0 && i%1==0 && i%i==0) {
				System.out.println(i);
			}
		}	
	}
}
