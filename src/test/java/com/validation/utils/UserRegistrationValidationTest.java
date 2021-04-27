package com.validation.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserRegistrationValidationTest {
	
	@Test
	public void testisValidfirstname_shouldreturn_true() throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidFirstname("Neha");
		assertEquals(true, result);
	}

	@Test
	public void testisValidFirstname_shouldreturn_false() throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidFirstname("ne!Ha ");
		assertEquals( false, result);
	}
	
	@Test
	public void testisValidFirstName_shouldreturn_false() throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidFirstname("@NeHa ");
		assertEquals( false, result);
	}
	

	@Test
	public void testisValidlastname_shouldreturn_false() throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidLastname("sharMa");
		assertEquals(false, result);
	}
	

	@Test
	public void testisValidlastname_shouldreturn_true() throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidLastname("Sharma");
		assertEquals(true, result);
	}
	
	@Test
	public void testisValidLastname_shouldreturn_false() throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidLastname("S12harM@");
		assertEquals(false, result);
	}
	
	
	@Test
	public void testisValidEmaiLId_shouldreturn_true()throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidEmailID("abc.xyz@bridgelabz.co.in");
		assertEquals(true, result);
	}
	
	@Test
	public void testisValidemaiLId_shouldreturn_false()throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidEmailID("abc@345@bridhelabz.hotmail.com");
		assertEquals(false, result);
	}
	
	@Test
	public void testisValidemaiLID_shouldreturn_false()throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidEmailID("!123.abx.@google.gmail.com");
		assertEquals(false, result);
	}
	
	
	@Test
	public void testisValidphoneNumb_shouldreturn_true()throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidPhoneNumb("+91 9987453342");
		assertEquals(true, result);
	}
	
	
	@Test
	public void testisValidPhonENumb_shouldreturn_false()throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidPhoneNumb("091 998745334232");
		assertEquals(false, result);
	}
	
	@Test
	public void testisValidPhoneNumb_shouldreturn_false()throws UserRegistrationValidationException {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidPhoneNumb("+91 7345A8756009");
		assertEquals(false, result);
	}
	
	@Test
	public void testisValidPassWord_shouldreturn_true()throws UserRegistrationValidationException  {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidPassword("RyzEn@!99443");
		assertEquals(true, result);
	}
	
	@Test
	public void testisValidpassWord_shouldreturn_false()throws UserRegistrationValidationException  {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidPassword("ryzen@@@@@@tab");
		assertEquals(false, result);
	}
	
	@Test
	public void testisValidpassword_shouldreturn_false()throws UserRegistrationValidationException  {
		UserRegistrationValidation userRegistrationValidation=new UserRegistrationValidation();
		boolean result=userRegistrationValidation.isValidPassword("4356!user#tab");
		assertEquals(false, result);
	}
}

