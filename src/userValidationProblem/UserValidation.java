package userValidationProblem;

import java.util.Scanner;

public class UserValidation {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter User Last Name.\n"+"Note-> Name Start With Capital And Has Minimum Three Character. ");
		String lname=scan.next();
		
		String regix="^[A-Z]{1,}"+"[a-z A-Z 0-9 ~!@#$%^&*?]{2,}";
		
		boolean result=lname.matches(regix);
		if(result)
			System.out.println(lname+"  Is Valid. ");
		else
			System.out.println(lname+" Is Not Valid.");
	}

}
