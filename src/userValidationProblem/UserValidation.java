package userValidationProblem;

import java.util.Scanner;

public class UserValidation {
	Scanner scan =new Scanner(System.in);
	public boolean validateFirstName() throws UserValidationException {
		System.out.println("Enter User First Name.\n"+"Note-> Name Start With Capital And Has Minimum Three Character. ");
		 String fname=scan.next();
		
		String regix="^[A-Z]{1,}"+"[a-z A-Z 0-9 ~!@#$%^&*?]{2,}";
		boolean result=fname.matches(regix);
		try{
			if(result) {
				System.out.println(fname+"  Is Valid. ");
			return true;
		}
		throw new UserValidationException("Invalid Enterd First Name");
		}catch (UserValidationException e) {
			System.out.println(e);
		}
		return false;
		
	}
	
	public  boolean validatingLastName() throws UserValidationException {
		System.out.println("Enter User Last Name.\n"+"Note-> Name Start With Capital And Has Minimum Three Character. ");
		String lname=scan.next();
		String regix="^[A-Z]{1,}"+"[a-z A-Z 0-9 ~!@#$%^&*?]{2,}";
		
		boolean result=lname.matches(regix);
		try{
		if(result) {
			System.out.println(lname+"  Is Valid. ");
			return true;
		}
		throw new UserValidationException("Invalid Enterd Last Name");
		}catch (UserValidationException e) {
			System.out.println(e);
		}
		return false;
	}
	
	public  boolean validatingEmail() throws UserValidationException{
		
		System.out.println("Enter User Email Address.\n"+"Note-> ex.- abc.xyz@bl.co.in");
		String email=scan.next();
				
		String regix="^([a-z]*)"+"[-_.+]*?"+"([a-z 0-9 ]*?)"+"[@]{1}"+"([a-z 0-9]{1,})"+"[.]{1}"+"([a-z]{2,})"+"[.]?"+"([a-z]*?)";
		
		boolean result=email.matches(regix);
		try{
		if(result)
		{
			System.out.println(email+"  Is Valid. ");
			return true;
		}
		throw new UserValidationException("Invalid Email");
		}catch (UserValidationException e) {
			System.out.println(e);
		}
		return false;
		
	}
	
		public  boolean validatingMobileNumber() throws UserValidationException {
			
			System.out.println("Enter User Mobile Number\n"+"In this Formate -: xx x98xxxx988" );
			String moNo=scan.next();
			
			String regix="^[0-9]{2}"+" "+"[0-9]{10}";
			
			boolean result=moNo.matches(regix);
			try{
			if(result) {
				System.out.println(moNo+"  Is Valid. ");
				return true;
			}
			throw new UserValidationException("Invalid Mobile Number");
			}catch (UserValidationException e) {
				System.out.println(e);
			}
			return false;
		}
	
	public  boolean validatingPassword() throws UserValidationException{
			
			System.out.println("Enter User Password\n"+"Note-: Having Minimum 8 character with Atleast One Upper Case, One Numeric Number,One special Character." );
			String pswd=scan.next();			
			String regix="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&*?/+])[A-Z a-z 0-9 -_.]{8,}";
			
			boolean result=pswd.matches(regix);
			
			try{
			if(result) {
				System.out.println(pswd+"  Is Valid. ");
				return true;
				
			}
			throw new UserValidationException("Invalid Password");
			}catch (UserValidationException e) {
				System.out.println(e);
			}
			return false;
	}
	
	public String moodAnalyser(String mood)  {
		
		if(mood.contains("sad")) {
			return "Sad";
		}
		else {
			return "Happy";
		}

	
	}
	
	public static void main(String[] args) throws UserValidationException {
		UserValidation userValidation=new UserValidation();
		
			userValidation.validateFirstName();
			userValidation.validatingLastName();
			userValidation.validatingMobileNumber();
			userValidation.validatingEmail();
			userValidation.validatingPassword();
	}
	
	
	
	
	
	
}