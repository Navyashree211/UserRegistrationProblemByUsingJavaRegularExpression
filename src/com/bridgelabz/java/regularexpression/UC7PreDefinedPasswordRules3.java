/**
 * User need to follow pre-defined password rules.
 * Rules3- Should have at least 1 numeric number in the password .
 * 
 * @author: Navya Shree 
 * @since: 11-10-2021
 */
package com.bridgelabz.java.regularexpression;
public class UC7PreDefinedPasswordRules3 {   
	public static void main(String[] args) {
		System.out.println(firstName("Navya"));
		System.out.println(firstName("Anokhi"));
		System.out.println(lastName("Shree"));
		System.out.println(lastName("Sha"));

		email();
		phoneNumber();
		password();
	}

	// validate first name
	public static boolean firstName(String firstName) {

		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}

	// validate last name
	public static boolean lastName(String lastName) {
		return lastName.matches("[A-z]{1}[a-z]{2,}$");
	}

	// validate given email
	public static void email() {
		String email = "abc.xyz@bl.co.in";
		String regex = "^[a-z]{3}[a-zA-Z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.][a-z]*$";
		boolean result = email.matches(regex);
		if (result) {
			System.out.println("Given email-id is valid");
		} else {
			System.out.println("Given email-id is not valid");
		}
	}

	// validate given phone number
	public static void phoneNumber()  {
		String phone = "91 9919819801";
		String regex = "[0-9]{2}[\s][0-9]{10}";
		boolean result = phone.matches(regex);
		if(result)  {
			System.out.println("Given phone number is valid");
		}
		else  {
			System.out.println("Given phone number is not valid ");
		}
	}

	// validate given password
	public static void password() {
		String password = "aBcd#123";
		String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}";
		boolean result = password.matches(regex);
		if (result) {
			System.out.println("Given password is valid");
		} else {
			System.out.println("Given password is not valid");
		}
	}

}
