/**
 * check valid Email
 * EX:- ac.xyz@bl.co.in
 * Email has 3 mandatory parts (abc,bl & co) annd 2 optional (xyz & in) with precise @ and . positions .
 * 
 * @author: Navya Shree
 * @since: 11-10-2021
 */
package com.bridgelabz.java.regularexpression;

public class UC3EnterValidEmail {  
	public static void main(String[] args) {   
		System.out.println(firstName("Navya"));
		System.out.println(firstName("Anokhi"));
		System.out.println(lastName("Shree"));
		System.out.println(lastName("Sha"));
		
		email();
	}
   //validate first name
	public static boolean firstName(String firstName) {
	
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	//validate last name
	public static boolean lastName(String lastName) {
		return lastName.matches("[A-z]{1}[a-z]{2,}$");
	}
	//validate given email
	public static void email()  {
		String email = "abc.xyz@bl.co.in";
		String regex = "^[a-z]{3}[a-zA-Z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.][a-z]*$";
		boolean result = email.matches(regex);
		if(result)  {
			System.out.println("Given email-id is valid");
		}
		else {
			System.out.println("Given email-id is not valid");
		}
	}

}
