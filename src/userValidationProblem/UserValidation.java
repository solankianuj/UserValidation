package userValidationProblem;

import java.util.Scanner;

public class UserValidation {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter User Email Address.\n"+"Note-> ex.- abc.xyz@bl.co.in");
		
		String email=scan.next();
		
		String regix="^([a-z]*)"+"[-_.+]*?"+"([a-z 0-9 ]*?)"+"[@]{1}"+"([a-z 0-9]{1,})"+"[.]{1}"+"([a-z]{2,})"+"[.]?"+"([a-z]*?)";
		
		boolean result=email.matches(regix);

		if(result)
			System.out.println(email+"  Is Valid. ");
		else
			System.out.println(email+" Is Not Valid.");
			
			
	}

}
