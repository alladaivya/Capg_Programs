package exp1;
import java.util.*;

public class Example1 {

	public static void main(String[] args) throws InvalideAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age1 = sc.nextInt();
		ageValidation(age1);
	}

	private static void ageValidation(int age) throws InvalideAgeException {
		if(age < 15) {
				 throw new InvalideAgeException("Age of a person should be above 15");
		}
		
	}

}
