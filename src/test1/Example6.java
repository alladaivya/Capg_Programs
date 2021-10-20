package test1;
import java.util.Scanner;

public class Example6 {
	public static void main(String[] args) {
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nth number");
		int n=sc.nextInt();
		result=calculateDifference(n);
		System.out.println("the result of calculateDifference");
		System.out.println(result);
	}//end main
	private static int calculateDifference(int n) {
		int sum=0;
		int sumSquare=0,totalSquare=0;
		for(int i=1;i<=n;i++) {
			sumSquare=sumSquare+(i*i);
			totalSquare=totalSquare+i;
		}//end for
		totalSquare=(totalSquare)*(totalSquare);
		sum=sumSquare-totalSquare;
		return sum;
	}//end calculateDiffenence method
}//end Exercise_6




