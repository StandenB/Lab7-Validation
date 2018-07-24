package validateInputs;

import java.util.Scanner;

public class Lab7validator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Please enter your name:");
	String name = scnr.next();
	boolean realName = valName(name);
		if (realName == true) {
			System.out.println("Name is valid!");
		}
		else {
			System.out.println("Sorry, " + name + " is not valid");
		}
	
	System.out.println("Please enter your email address:");
	String email = scnr.next();
		
	boolean realEmail = valEmail(email);
	if (realEmail == true) {
		System.out.println("Email is valid!");
	}
	else {
		System.out.println("Sorry, " + email + " is not valid");
	}
	
	System.out.println("Please enter your phone number (xxx-xxx-xxxx):");
	String phone = scnr.next();
		
	boolean realPhone = valPhoneNumber(phone);
	if (realPhone == true) {
		System.out.println("Phone is valid!");
	}
	else {
		System.out.println("Sorry, " + phone + " is not valid");
	}
	
	System.out.println("Please enter a date (mm/dd/yyyy):");
	String date = scnr.next();
		
	boolean realDate = valDate(date);
	if (realDate == true) {
		System.out.println("Date is valid!");
	}
	else {
		System.out.println("Sorry, " + date + " is not valid");
		//System.out.println("Please reenter your name:");
		//name = scnr.nextLine(); 
	}
}
	public static boolean valName(String name) {
		boolean isValid = (name.matches("[A-Z][a-z]{0,29}"));
		return isValid;
	}
	public static boolean valEmail(String email) {
		boolean isValid = (email.matches("[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}"));
		return isValid;
	}
	public static boolean valPhoneNumber (String phone) {
		boolean isValid = (phone.matches("\\d{3}-\\d{3}-\\d{4}"));
		return isValid;	
	}
	public static boolean valDate (String date) {
		boolean isValid = (date.matches("[0-1][0-9][/]\\[0-3][0-9][/]\\d{4}"));
		return isValid;
	}
}
 