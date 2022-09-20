package org.greatlearning.model;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Emp e=new Emp("Sachin", "Verma");
		CredentialService credentialService = new CredentialService();
		int ch;
		do
		{
			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				String email=credentialService.generateEmailAddress(e.getFirstName(), e.getLastName() , "Tech");
				
				char[] password=credentialService.generatePassword();
				credentialService.showCredentials(e, email, password);
				break;
			}
		}while(ch<=4);
	}

}
