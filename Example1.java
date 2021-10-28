package pcg;
import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sequence of integers");
		String digit = sc.nextLine();
		StringTokenizer token = new StringTokenizer(digit);
		int dig=0,sum=0;
		System.out.println("Enter digits are:");
		while(token.hasMoreTokens()) {
			String s = token.nextToken();
			dig = Integer.parseInt(s);
			System.out.println(dig+" ");
			sum = sum+dig;
		}
		System.out.println();
		System.out.println("Sum is:"+sum);
	}

}
