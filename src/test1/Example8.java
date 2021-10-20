package test1;
import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
		boolean result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		result=checkNumber(n);
		System.out.println("the result is : ");
		System.out.print(result);
	}//end main
	private static boolean checkNumber(int n) 
	{
		if (n == 0)
			return false;
		while (n != 1)
		{
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}//end while
			return true;
	}
}
