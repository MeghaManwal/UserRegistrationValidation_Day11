package com.validation.utils;

 import java.util.regex.Matcher;
 import java.util.regex.Pattern;

 public class UserRegistrationValidation {
	

	 public  boolean isValidFirstname(String firstname) throws UserRegistrationValidationException {
		 
	        String pattern1="^[A-Z]{1}[A-Z a-z]{2,}$";
	        Pattern P=Pattern.compile(pattern1);
	        if (firstname==null) {
	        System.out.println("FirstName is Null");
	        throw new UserRegistrationValidationException(" Null Value ! Please provide valid FirstName ");
	        }
	        else {
	        try {
	        Matcher m=P.matcher(firstname);
	        return m.matches();
	        }
	        catch (NullPointerException ae) {
	        	throw new UserRegistrationValidationException("Invalid FirstName! Please provide valid FirstName ");
	         }
	        }
	    }
	 
	 public  boolean isValidLastname(String lastname) throws UserRegistrationValidationException {
		 
	        String pattern1="^[A-Z]{1}[A-Z a-z]{2,}$";
	        Pattern P=Pattern.compile(pattern1);
	        if (lastname==null) {
		    System.out.println("LastName is Null");
		    throw new UserRegistrationValidationException(" Null Value ! Please provide valid FirstName ");
		    }
	        else {
	        try {
	        Matcher m=P.matcher(lastname);
	        return m.matches();
	        }
	        catch (NullPointerException ae) {
	        	throw new UserRegistrationValidationException("Invalid LastName! Please provide valid LastName ");
	         }
	        }
	    }
	 
	 public  boolean isValidEmailID(String emailId) throws UserRegistrationValidationException {

	        String pattern3="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";
	        Pattern R=Pattern.compile(pattern3);
	        if (emailId==null) {
		    System.out.println("EmailId is Null");
			throw new UserRegistrationValidationException(" Null Value ! Please provide valid FirstName ");
			}
	        else {
	        try {
	        Matcher o=R.matcher(emailId);
	        return o.matches();
	        }
	        catch (NullPointerException ae) {
	        	throw new UserRegistrationValidationException("Invalid EmailId! Please provide valid EmailId ");
	         }
	        }
	    }
	 
	  public  boolean isValidPhoneNumb(String phoneNumber) throws UserRegistrationValidationException {

	        String pattern4="^[+][0-9]{1,}\\s?[1-9]{1}[0-9]{9}$";
	        Pattern S=Pattern.compile(pattern4);
	        if (phoneNumber==null) {
			System.out.println("PhoneNumber is Null");
			throw new UserRegistrationValidationException(" Null Value ! Please provide valid FirstName ");
			}
	        else {
	        try {
	        Matcher p=S.matcher(phoneNumber);
	        return p.matches();
	        }
	        catch (NullPointerException ae) {
	        	throw new UserRegistrationValidationException("Invalid PhoneNumber! Please provide valid PhoneNumber ");
	         } 
	        }
	     }
	  
	  public  boolean isValidPassword(String password) throws UserRegistrationValidationException {

	        String pattern5="^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*[A-Z]{1,})(?=.*[0-9]{1,})(?=.*[!@#$%^&*();:]{1,}).*$";
	        Pattern T=Pattern.compile(pattern5);
	        if (password==null) {
			System.out.println("Password is Null");
			throw new UserRegistrationValidationException(" Null Value ! Please provide valid FirstName ");
			}
	        else {
	        try {
	        Matcher q=T.matcher(password);
	        return q.matches();
	        }
	        catch (NullPointerException ae) {
	        	throw new UserRegistrationValidationException("Invalid Password! Please provide valid Password ");
	         }
	        }
	    }

 }

 class UserRegistrationValidationException extends Exception {
	
	    public  UserRegistrationValidationException(String message) {
		   super(message);
		}
	
    }