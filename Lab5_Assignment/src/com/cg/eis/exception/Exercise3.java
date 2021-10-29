package com.cg.eis.exception;
import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary of an employee");
		double salary = sc.nextDouble();
		InvalidSalaryException(salary);
	}

	private static void InvalidSalaryException(double salary) {
		try {
			if(salary < 3000) {
				throw new InvalidSalaryException("Salary shoud be greater than 3000");
			}
			else {
				System.out.println("Salary of an employee is:" +salary);
			}
		}
		catch(InvalidSalaryException ie) {
			System.out.println(ie);
		}
		
	}

}
