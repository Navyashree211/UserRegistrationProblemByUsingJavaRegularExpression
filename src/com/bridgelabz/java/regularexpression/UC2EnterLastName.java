/**
 * Valid Last Name with first letter starting with capital and has minimum 3 characters in it.
 *
 * @author: Navya Shree
 * @since: 9.10.2021
 */

package com.bridgelabz.java.regularexpression;

public class UC2EnterLastName {   
	public static void main(String[] args) {  
		System.out.println(firstName("Navya"));
		System.out.println(firstName("Anokhi"));
		System.out.println(lastName("Shree"));
		System.out.println(lastName("Sha"));
	}
	//validate first name
	public static boolean firstName(String firstName)  {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	//validate last name
		public static boolean lastName(String lastName)  {
			return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
		}

}