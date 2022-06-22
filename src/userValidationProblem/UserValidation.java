package userValidationProblem;

import java.util.Scanner;

public class UserValidation {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter User Password\n"+"Note-: Having Minimum 8 character with Atleast One Upper Case." );
		
		String pswd=scan.next();
		
		String regix="^(?=.*[A-Z])[A-Z a-z]{8,}";
		
		boolean result=pswd.matches(regix);

		if(result)
			System.out.println(pswd+"  Is Valid. ");
		else
			System.out.println(pswd+" Is Not Valid.");
			
	}

}
