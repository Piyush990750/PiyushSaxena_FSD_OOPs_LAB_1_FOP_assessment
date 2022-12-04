package com.greatlearning.Services;


	import java.util.Random;

	import com.greatlearning.interfaces.UserCredentials;
	import com.greatlearning.model.Employee;		
	

	public  class Credentials implements UserCredentials {		
		
		
		public String generateEmailAddress(String firstName, String lastName, String department) {
			String emailAddress = firstName+lastName+"@"+department+".gl.com";
			return emailAddress;
		}
		
	
		public String generatePassword() {
			String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String smallLetters = "abcdefghijklmnopqrstuvwxyz";
			String numbers = "0123456789";
			String specialCharacters = "!@#$%^&*_=+-/.?<>)";
			
			String Values = capitalLetters + smallLetters 
					+ numbers + specialCharacters;
			
			
			
			Random randomObj = new Random();			
			String password="";
			
			for (int i=0; i < 8; i++) {

				int boundValue = Values.length();
				int randomIndex = randomObj.nextInt(boundValue);	
				char randomChar = Values.charAt(randomIndex);		
				password += String.valueOf(randomChar);
			}	
			return password;
		}

		
		public void showCredentials(Employee employee) {
			
			System.out.println("Dear "+employee.getFirstName() + " your generated Email ID and Password are :");
			System.out.println("Email ID : " + employee.getEmail());
			System.out.println("Password : " +employee.getPassword());
		}

}
