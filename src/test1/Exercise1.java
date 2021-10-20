package test1;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		int n,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		s = sumCube(n);
		System.out.print(s);
	}
    public static int sumCube(long num) {
    	int sum = 0;
    	int r = 0;
    	while(num>=1) {
    		r = (int)(num%10);
    		sum = sum + (r*r*r);
    		num = num/10;
    	}
		return sum;
    }
}
