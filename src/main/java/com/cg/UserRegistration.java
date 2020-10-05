/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cg;

import java.util.*;
import java.util.regex.Pattern;

@FunctionalInterface
interface Validation {
	boolean apply(String a, String b);
}

public class UserRegistration {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String namePattern = "^[A-Z]{1}[A-Za-z]{2,}";
		String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";
		String phoneNumberPattern = "^[0-9]{1,}[ ][1-9][0-9]{9}$";
		String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=^[^#?!@$%^&*-]*[#?!@$%^&*-][^#?!@$%^&*-]*$).{8,}$";
		String firstName;
		String lastName;
		String email;
		String phoneNumber;
		String password;
		
		Validation validation = (pattern, string) -> Pattern.matches(pattern, string);

		System.out.println("User Registration Program with validation");
		boolean match = false;
		System.out.println("Enter the first name:");
		while (true) {
			firstName = sc.nextLine();
			match = validation.apply(namePattern, firstName);
			if (match) {
				System.out.println("First Name is added successfully\n");
				break;
			}
			System.out.println("Invalid First Name, Please enter valid first name\n");
		}

		System.out.println("Enter the last name:");
		while (true) {
			lastName = sc.nextLine();
			match = validation.apply(namePattern, lastName);
			if (match) {
				System.out.println("Last Name is added successfully\n");
				break;
			}
			System.out.println("Invalid Last Name, Please enter valid last name\n");
		}

		System.out.println("Enter the email:");
		while (true) {
			email = sc.nextLine();
			match = validation.apply(emailPattern, email);
			if (match) {
				System.out.println("Email is added successfully\n");
				break;
			}
			System.out.println("Invalid Email, Please enter valid email\n");
			
		}

		System.out.println("Enter the Phone Number:");
		while (true) {
			phoneNumber = sc.nextLine();
			match = validation.apply(phoneNumberPattern, phoneNumber);
			if (match) {
				System.out.println("Phone Number is added successfully\n");
				break;
			}
			System.out.println("Invalid Phone Number, Please enter valid phone Number\n");
		}

		System.out.println("Enter the Password:");
		while (true) {
			password = sc.nextLine();
			match = validation.apply(passwordPattern, password);
			if (match) {
				System.out.println("Password is added successfully\n");
				break;
			}
			System.out.println("Invalid Password, Please enter valid password\n");
		}
	}
}
