package test1;
import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
				int n;
				boolean result;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter nth number");
				n=sc.nextInt();
				result=checkNumber(n);
				System.out.println("The result is");
				System.out.println(result);
			}//end main
			private static boolean checkNumber(int n) {
				String s = Integer.toString(n);
				char ch;
				int f = 0;
				for (int i = 0; i < s.length() - 1; i++) {
					ch = s.charAt(i);
					if (ch > s.charAt(i + 1)) {
						f = 1;
						break;
					} else {
					}
				}
				return f != 1;
			}
		}//end Exercise_7
