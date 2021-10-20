package test1;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput;
		char ch = 'y';
		while(ch == 'y') {
			System.out.println("1.GREEN");
			System.out.println("2.RED");
			System.out.println("3.YELLOW");
			System.out.println("Enter the option");
			userInput = sc.nextInt();
			switch(userInput) {
			case 1:
				System.out.println("GO");
			    break;
			case 2:
				System.out.println("STOP");
				break;
			case 3:
				System.out.println("READY");
				break;
			default:
				System.out.println("Enter correct option");
				System.exit(0);
			}// end switch
			
			//System.out.println("Do you want to book another option");
			ch = sc.next().charAt(0);
		}//end while
	}//end main()
}//end Exercise2
