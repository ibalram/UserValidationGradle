package com.cg;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void testFirstNameValidator() {
		try {
			UserRegistration obj = new UserRegistration();
			String firstName = "Balram";
			assertEquals(true, obj.firstNameValidator(firstName));
		} catch (FirstNameValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testFirstNameValidatorSad() {
		try {
			UserRegistration obj = new UserRegistration();
			String firstName = "balram";
			assertEquals(false, obj.firstNameValidator(firstName));
		} catch (FirstNameValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testLastNameValidator() {
		try {
			UserRegistration obj = new UserRegistration();
			String lastName = "Singh";
			assertEquals(true, obj.lastNameValidator(lastName));
		} catch (LastNameValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testLastNameValidatorSad() {
		try {
			UserRegistration obj = new UserRegistration();
			String lastName = "singh";
			assertEquals(false, obj.lastNameValidator(lastName));
		} catch (LastNameValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testEmailValidator() {
		try {
			UserRegistration obj = new UserRegistration();
			String email = "abc.xyz@cg.com";
			assertEquals(true, obj.emailValidator(email));
		} catch (EmailValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testEmailValidatorSad() {
		try {
			UserRegistration obj = new UserRegistration();
			String email = "abc.xyz.cg.com";
			assertEquals(false, obj.emailValidator(email));
		} catch (EmailValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPhoneNumberValidator() {
		try {
			UserRegistration obj = new UserRegistration();
			String phoneNumber = "91 9469091234";
			assertEquals(true, obj.phoneNumberValidator(phoneNumber));
		} catch (PhoneNumberValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPhoneNumberValidatorSad() {
		try {
			UserRegistration obj = new UserRegistration();
			String phoneNumber = "919469091234";
			assertEquals(false, obj.phoneNumberValidator(phoneNumber));
		} catch (PhoneNumberValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPasswordValidator() {
		try {
			UserRegistration obj = new UserRegistration();
			String password = "xyzA@1111";
			assertTrue(obj.passwordValidator(password));
		} catch (PasswordValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testPasswordValidatorSad() {
		try {
			UserRegistration obj = new UserRegistration();
			String password = "xyzA@@1111";
			assertTrue(obj.passwordValidator(password));
		} catch (PasswordValidationException e) {
			System.out.println(e.getMessage());
		}
	}

}
