package userValidationProblem;

import java.util.Scanner;
import java.util.regex.Pattern;


@FunctionalInterface
interface IvalidateFirstName{
	void validFirstName();
}

@FunctionalInterface
interface IvalidateLastName{
	void validLastName();
}

@FunctionalInterface
interface IvalidateMobileNum{
	void validatingMobileNumber();
}

@FunctionalInterface
interface IvalidatingEmail{
	void validatingEmail();
}

@FunctionalInterface
interface IvalidatingPassword{
	void validatingPassword();
}

public class UserValidation {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		
		IvalidateFirstName validateFirstName=() ->  {
		System.out.println("Enter User First Name.\n"+"Note-> Name Start With Capital And Has Minimum Three Character. ");
		 String fname=scan.next();
		boolean result=Pattern.matches("^[A-Z]{1,}"+"[a-z A-Z 0-9 ~!@#$%^&*?]{2,}", fname);
		try{
			if(result) {
				System.out.println(fname+"  Is Valid. ");
				return;
		}
		throw new UserValidationException("Invalid Enterd First Name");
		}catch (UserValidationException e) {
			System.out.println(e);
		}
	};
	
	IvalidateLastName validateLastName= ()->{
		System.out.println("Enter User Last Name.\n"+"Note-> Name Start With Capital And Has Minimum Three Character. ");
		String lname=scan.next();
		boolean result=Pattern.matches("^[A-Z]{1,}"+"[a-z A-Z 0-9 ~!@#$%^&*?]{2,}", lname);	
		try{
			if(result) {
				System.out.println(lname+"  Is Valid. ");
				return;
			}
			throw new UserValidationException("Invalid Enterd Last Name");
			}catch (UserValidationException e) {
				System.out.println(e);
			}
	};
	
	IvalidateMobileNum validateMobileNum=()->{
		System.out.println("Enter User Mobile Number\n"+"In this Formate -: xx 9xxxxxxxx8" );
		String moNo=scan.nextLine();
		
		String regix="^[0-9]{2}"+" "+"[1-9]{1}[0-9]{9}";
		
		boolean result=Pattern.matches(regix, moNo);
		System.out.println(result);
		try{
		if(result) {
			System.out.println(moNo+"  Is Valid. ");
			return;
		}
		throw new UserValidationException("Invalid Mobile Number");
		}catch (UserValidationException e) {
			System.out.println(e);
		}		
	};
	
	IvalidatingEmail validatingEmail=()->{
		System.out.println("Enter User Email Address.\n"+"Note-> ex.- abc.xyz@bl.co.in");
		String email=scan.next();
		String regix="^([a-z]*)"+"[-_.+]*?"+"([a-z 0-9 ]*?)"+"[@]{1}"+"([a-z 0-9]{1,})"+"[.]{1}"+"([a-z]{2,})"+"[.]?"+"([a-z]*?)";
		
		boolean result=Pattern.matches(regix, email);
		System.out.println(result);
		try{
		if(result)
		{
			System.out.println(email+"  Is Valid. ");
			return;
		}
		throw new UserValidationException("Invalid Email");
		}catch (UserValidationException e) {
			System.out.println(e);
		}	
	};
	
	IvalidatingPassword validatingPassword=()->{
		System.out.println("Enter User Password\n"+"Note-: Having Minimum 8 character with Atleast One Upper Case, One Numeric Number,One special Character." );
		String pswd=scan.next();			
		String regix="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&*?/+])[A-Z a-z 0-9 -_.]{8,}";
		
		boolean result=Pattern.matches(regix, pswd);
		
		try{
		if(result) {
			System.out.println(pswd+"  Is Valid. ");
			return;
		}
		throw new UserValidationException("Invalid Password");
		}catch (UserValidationException e) {
			System.out.println(e);
		}
		
	};
	
	validateFirstName.validFirstName();
	validateLastName.validLastName();
	validateMobileNum.validatingMobileNumber();
	validatingEmail.validatingEmail();
	validatingPassword.validatingPassword();
}
	
}
	