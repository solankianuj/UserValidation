package userValidationProblem;

import java.util.Scanner;

public class UserValidation {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter User First Name.\n"+"Note-> Name Start With Capital And Has Minimum Three Character. ");
		String fname=scan.next();
		
		String regix="^[A-Z]{1,}"+"[a-z A-Z 0-9 ~!@#$%^&*?]{2,}";
		
		boolean result=fname.matches(regix);
		if(result)
			System.out.println(fname+"  Is Valid. ");
		else
			System.out.println(fname+" Is Not Valid.");
	}

}
