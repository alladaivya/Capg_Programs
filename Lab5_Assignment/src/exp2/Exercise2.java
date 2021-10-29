package exp2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String firstName = sc.nextLine();
		System.out.println("Enter the last name:");
		String lastName = sc.nextLine();
		try {
			if(firstName.isEmpty() || lastName.isEmpty()) {
				throw new InvalidException("fistName and lastName should not be blank");	
			}
			else {
				System.out.println("firstName: " + firstName +  "lastName: " + lastName);
			}
		}
		catch(InvalidException ie) {
			ie.printStackTrace();
		}
		

	}

}
