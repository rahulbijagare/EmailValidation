package project.com;

import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		String email1 ="rahul.bijagare@rediffmail.com";
		String email2 ="rahulbijagarecom";
		System.out.println("email1= "+validateEmail(email1));
		System.out.println("email2 "+validateEmail(email2));
		
		
	}
		
		public static String validateEmail (String email) {
			if(email == null || email.isEmpty()) {
				return "Invalid";
			}
			String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			Pattern pattern=Pattern.compile(emailRegex);
			if(pattern.matcher(email).matches()) {
				return "Valid";
			}
			else {
				return"Invalid";
			}
				
				
			
			
		}
		
	}
	


