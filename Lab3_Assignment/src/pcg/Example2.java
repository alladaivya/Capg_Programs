package pcg;
import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		getImage(str);
	}
	static void getImage(String str) {
		StringBuffer sb = new StringBuffer(str);
		StringBuffer str1 = sb.reverse();
		System.out.println("Mirror image:"+str+"|"+str1);
	}
}
