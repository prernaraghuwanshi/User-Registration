package com.bridgelabz.userreg;

import java.util.Scanner;
import java.util.regex.Pattern;



public class Regex {
	private static final Pattern FNAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	private static final Pattern LNAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	private static Scanner sc;
    
	private boolean checkFirstName(String s) {
        return FNAME_PATTERN.matcher(s).matches();
    }
	private boolean checkLastName(String s) {
        return LNAME_PATTERN.matcher(s).matches();
    }
	public static void main(String args[]) {
		System.out.println("Welcome to User Registration!");
		Regex r = new Regex();
		sc = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		boolean fnameValid = r.checkFirstName(firstName);
		if(fnameValid)
			System.out.println("First Name is VALID!");
		else
			System.out.println("ERROR! First Name is INVALID!");
		
		System.out.println("Enter Last Name: ");
		String lastName = sc.nextLine();
		boolean lnameValid = r.checkLastName(lastName);
		if(lnameValid)
			System.out.println("Last Name is VALID!");
		else
			System.out.println("ERROR! Last Name is INVALID!");
	
	}

}
