/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cg;

import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	static Scanner sc = new Scanner(System.in);
	static String namePattern = "^[A-Z]{1}[A-Za-z]{2,}";

	public static boolean firstNameValidator(String firstName) {
		return Pattern.matches(namePattern, firstName);
	}

	public static boolean lastNameValidator(String lastName) {
		return Pattern.matches(namePattern, lastName);
	}

	public static void main(String[] args) {
		System.out.println("User Registration Program with validation");
		String firstName;
		String lastName;

		boolean match = false;
		System.out.println("Enter the first name:");
		while (!match) {
			firstName = sc.nextLine();
			match = firstNameValidator(firstName);
			if (!match)
				System.out.println("Invalid First Name, Please enter again (First letter capital, minimum 3 letters)");
		}
		System.out.println("First Name is added successfully\n");

		match = false;
		System.out.println("Enter the last name:");
		while (!match) {
			lastName = sc.nextLine();
			match = lastNameValidator(lastName);
			if (!match)
				System.out.println("Invalid Last Name, Please enter again (First letter capital, minimum 3 letters)");
		}
		System.out.println("Last Name is added successfully\n");
	}
}
