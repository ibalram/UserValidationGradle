package com.cg;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void testFirstNameValidator() {
		UserRegistration obj = new UserRegistration();
		String firstName = "Balram";
		assertTrue(obj.firstNameValidator(firstName));
	}
	
	@Test
	public void testFirstNameValidatorSad() {
		UserRegistration obj = new UserRegistration();
		String firstName = "balram";
		assertTrue(obj.firstNameValidator(firstName));
	}

	@Test
	public void testLastNameValidator() {
		UserRegistration obj = new UserRegistration();
		String lastName = "Singh";
		assertTrue(obj.lastNameValidator(lastName));
	}
	
	@Test
	public void testLastNameValidatorSad() {
		UserRegistration obj = new UserRegistration();
		String lastName = "singh";
		assertTrue(obj.lastNameValidator(lastName));
	}

	@Test
	public void testEmailValidator() {
		UserRegistration obj = new UserRegistration();
		String email = "abc.xyz@cg.com";
		assertTrue(obj.emailValidator(email));
	}
	
	@Test
	public void testEmailValidatorSad() {
		UserRegistration obj = new UserRegistration();
		String email = "abc.xyz.cg.com";
		assertTrue(obj.emailValidator(email));
	}

	@Test
	public void testPhoneNumberValidator() {
		UserRegistration obj = new UserRegistration();
		String phoneNumber = "91 9469091234";
		assertTrue(obj.phoneNumberValidator(phoneNumber));
	}
	
	@Test
	public void testPhoneNumberValidatorSad() {
		UserRegistration obj = new UserRegistration();
		String phoneNumber = "919469091234";
		assertTrue(obj.phoneNumberValidator(phoneNumber));
	}

	@Test
	public void testPasswordValidator() {
		UserRegistration obj = new UserRegistration();
		String password = "xyzA@1111";
		assertTrue(obj.passwordValidator(password));
	}
	
	@Test
	public void testPasswordValidatorSad() {
		UserRegistration obj = new UserRegistration();
		String password = "xyzA@@1111";
		assertTrue(obj.passwordValidator(password));
	}

}
