package com.cg;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void testFirstNameValidator() {
		try {
			Validator obj = new Validator();
			String firstName = "Balram";
			assertEquals(true, obj.firstNameValidator(firstName));
		} catch (FirstNameValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testFirstNameValidatorSad() {
		try {
			Validator obj = new Validator();
			String firstName = "balram";
			assertEquals(false, obj.firstNameValidator(firstName));
		} catch (FirstNameValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testLastNameValidator() {
		try {
			Validator obj = new Validator();
			String lastName = "Singh";
			assertEquals(true, obj.lastNameValidator(lastName));
		} catch (LastNameValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testLastNameValidatorSad() {
		try {
			Validator obj = new Validator();
			String lastName = "singh";
			assertEquals(false, obj.lastNameValidator(lastName));
		} catch (LastNameValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testEmailValidator() {
		try {
			Validator obj = new Validator();
			String email = "abc.xyz@cg.com";
			assertEquals(true, obj.emailValidator(email));
		} catch (EmailValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testEmailValidatorSad() {
		try {
			Validator obj = new Validator();
			String email = "abc.xyz.cg.com";
			assertEquals(false, obj.emailValidator(email));
		} catch (EmailValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPhoneNumberValidator() {
		try {
			Validator obj = new Validator();
			String phoneNumber = "91 9469091234";
			assertEquals(true, obj.phoneNumberValidator(phoneNumber));
		} catch (PhoneNumberValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPhoneNumberValidatorSad() {
		try {
			Validator obj = new Validator();
			String phoneNumber = "919469091234";
			assertEquals(false, obj.phoneNumberValidator(phoneNumber));
		} catch (PhoneNumberValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPasswordValidator() {
		try {
			Validator obj = new Validator();
			String password = "xyzA@1111";
			assertTrue(obj.passwordValidator(password));
		} catch (PasswordValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPasswordValidatorSad() {
		try {
			Validator obj = new Validator();
			String password = "xyzA@@1111";
			assertTrue(obj.passwordValidator(password));
		} catch (PasswordValidationException e) {
			System.out.println(e.getMessage());
		}
	}

}
