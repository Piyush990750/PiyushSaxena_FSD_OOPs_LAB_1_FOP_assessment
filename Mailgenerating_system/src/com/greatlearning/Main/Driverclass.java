package com.greatlearning.Main;

import java.util.Scanner;

import com.greatlearning.Services.Credentials;
import com.greatlearning.interfaces.UserCredentials;
import com.greatlearning.model.Employee;

public class Driverclass {
	public static void main(String[] args) {
		
		
		Employee demoEmployee = new Employee("piyush", "saxena");
		UserCredentials credentialsService = new Credentials();
		
		
		System.out.println("Please choose the department from the following options");
		System.out.println("_______________________________________________________");
		System.out.println("");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		System.out.println("_______________________________________________________");
		
		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();
		
		String generatedEmail = null;
		String generatedPassword = null;
		
		switch(option) {
			case 1: {
								generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),
											demoEmployee.getLastName().toLowerCase(), "tech");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			case 2: {
				
							generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),
											demoEmployee.getLastName().toLowerCase(), "admin");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			case 3: {
								generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),
											demoEmployee.getLastName().toLowerCase(), "hr");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			case 4: {
				
				generatedEmail = credentialsService.generateEmailAddress(demoEmployee.getFirstName().toLowerCase(),
											demoEmployee.getLastName().toLowerCase(), "legal");
				generatedPassword = credentialsService.generatePassword();
				break;
			}
			default : {
				System.out.println("Enter a valid department option");
			}
		}
		
		demoEmployee.setEmail(generatedEmail);
		demoEmployee.setPassword(generatedPassword);
		credentialsService.showCredentials(demoEmployee);
		
		userInput.close();
	}
}
