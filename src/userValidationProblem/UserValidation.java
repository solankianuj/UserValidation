package userValidationProblem;

import java.util.Scanner;

public class UserValidation {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter User Mobile Number\n"+"In this Formate -: xx x98xxxx988" );
		
		String moNo=scan.nextLine();
		
		String regix="^[0-9]{2}"+" "+"[0-9]{10}";
		
		boolean result=moNo.matches(regix);

		if(result)
			System.out.println(moNo+"  Is Valid. ");
		else
			System.out.println(moNo+" Is Not Valid.");
			
	}

}
