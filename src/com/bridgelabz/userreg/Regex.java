package com.bridgelabz.userreg;

import java.util.Scanner;
import java.util.regex.Pattern;



public class Regex {
	private static final Pattern FNAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	private static final Pattern LNAME_PATTERN = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-z0-9]+[_+-.]{0,1}[a-z0-9]+@[a-z0-9]+.[a-z]{2,}(.[a-z]{2}){0,1}$");
	private static final Pattern MOBILE_PATTERN = Pattern.compile("^[0-9]{2} [0-9]{10}$");
	private static final Pattern PASSWORD_PATTERN = Pattern.compile("^.{8,}$");
	private static Scanner sc;
    
	private boolean checkFirstName(String s) {
        return FNAME_PATTERN.matcher(s).matches();
    }
	private boolean checkLastName(String s) {
        return LNAME_PATTERN.matcher(s).matches();
    }
	private boolean checkEmail(String s) {
        return EMAIL_PATTERN.matcher(s).matches();
    }
	private boolean checkMobile(String s) {
		return MOBILE_PATTERN.matcher(s).matches();
	}
	private boolean checkPassword(String s) {
		return PASSWORD_PATTERN.matcher(s).matches();
	}
	public static void main(String args[]) {
		System.out.println("Welcome to User Registration!");
		Regex r = new Regex();
		sc = new Scanner(System.in);
		int flag = 1;
		while(flag==1)
		{
			System.out.println("Enter First Name: ");
			String firstName = sc.nextLine();
			boolean fnameValid = r.checkFirstName(firstName);
			if(fnameValid)
			{
				System.out.println("First Name is VALID!");
				flag = 0;
			}
				
			else
			{
				System.out.println("ERROR! First Name is INVALID!");
				flag = 1;
			}
				
		}
		while(flag==0)
		{
			System.out.println("Enter Last Name: ");
			String lastName = sc.nextLine();
			boolean lnameValid = r.checkLastName(lastName);
			if(lnameValid)
			{
				System.out.println("Last Name is VALID!");
				flag = 1;
			}
			else
			{
				System.out.println("ERROR! Last Name is INVALID!");
				flag = 0;
			}
		}
		while(flag==1)
		{
			System.out.println("Enter Email: ");
			String email = sc.nextLine();
			boolean emailValid = r.checkEmail(email);
			if(emailValid)
			{
				System.out.println("Email is VALID!");
				flag = 0;
			}
				
			else
			{
				System.out.println("ERROR! Email is INVALID!");
				flag = 1;
			}
				
		}
		while(flag==0)
		{
			System.out.println("Enter Mobile No.: ");
			String mobile = sc.nextLine();
			boolean mobileValid = r.checkMobile(mobile);
			if(mobileValid)
			{
				System.out.println("Mobile No. is VALID!");
				flag = 1;
			}
			else
			{
				System.out.println("ERROR! Mobile No. is INVALID!");
				flag = 0;
			}
		}
		while(flag==1)
		{
			System.out.println("Enter Password: ");
			String password = sc.nextLine();
			boolean passwordValid = r.checkPassword(password);
			if(passwordValid)
			{
				System.out.println("Password is VALID!");
				flag = 0;
			}
				
			else
			{
				System.out.println("ERROR! Password is INVALID!");
				flag = 1;
			}
				
		}
	
	}

}
