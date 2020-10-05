package com.cg;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
	static Scanner sc = new Scanner(System.in);
	private String namePattern = "^[A-Z]{1}[A-Za-z]{2,}";
	private String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";
	private String phoneNumberPattern = "^[0-9]{1,}[ ][1-9][0-9]{9}$";
	private String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=^[^#?!@$%^&*-]*[#?!@$%^&*-][^#?!@$%^&*-]*$).{8,}$";

	public boolean firstNameValidator(String firstName) throws FirstNameValidationException {
		if (Pattern.matches(namePattern, firstName))
			return true;
		else
			throw new FirstNameValidationException("Invalid First Name, Please enter valid first name");
	}

	public boolean lastNameValidator(String lastName) throws LastNameValidationException {
		if (Pattern.matches(namePattern, lastName))
			return true;
		else
			throw new LastNameValidationException("Invalid Last Name, Please enter valid last name");
	}

	public boolean emailValidator(String email) throws EmailValidationException {
		if (Pattern.matches(emailPattern, email))
			return true;
		else
			throw new EmailValidationException("Invalid Email, Please enter valid email");
	}

	public boolean phoneNumberValidator(String phoneNumber) throws PhoneNumberValidationException {
		if (Pattern.matches(phoneNumberPattern, phoneNumber))
			return true;
		else
			throw new PhoneNumberValidationException("Invalid Phone Number, Please enter valid phone number");
	}

	public boolean passwordValidator(String password) throws PasswordValidationException {
		if (Pattern.matches(passwordPattern, password))
			return true;
		else
			throw new PasswordValidationException("Invalid Password, Please enter valid password");
	}
}
