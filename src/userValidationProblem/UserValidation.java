package userValidationProblem;

public class UserValidation {
	
	public boolean validateFirstName( String fname) {
		System.out.println("Enter User First Name.\n"+"Note-> Name Start With Capital And Has Minimum Three Character. ");
		
		String regix="^[A-Z]{1,}"+"[a-z A-Z 0-9 ~!@#$%^&*?]{2,}";
		
		boolean result=fname.matches(regix);
		if(result) {
			System.out.println(fname+"  Is Valid. ");
			return true;
		}
		else
			System.out.println(fname+" Is Not Valid.");
		return false;
		
	}
	
	public  boolean validatingLastName(String lname) {
		System.out.println("Enter User Last Name.\n"+"Note-> Name Start With Capital And Has Minimum Three Character. ");
		
		String regix="^[A-Z]{1,}"+"[a-z A-Z 0-9 ~!@#$%^&*?]{2,}";
		
		boolean result=lname.matches(regix);
		if(result) {
			System.out.println(lname+"  Is Valid. ");
			return true;
		}
		else
		{
			System.out.println(lname+" Is Not Valid.");
		}
		return false;
		
	}
	
	public  boolean validatingEmail(String email) {
		
		System.out.println("Enter User Email Address.\n"+"Note-> ex.- abc.xyz@bl.co.in");
				
		String regix="^([a-z]*)"+"[-_.+]*?"+"([a-z 0-9 ]*?)"+"[@]{1}"+"([a-z 0-9]{1,})"+"[.]{1}"+"([a-z]{2,})"+"[.]?"+"([a-z]*?)";
		
		boolean result=email.matches(regix);

		if(result)
		{
			System.out.println(email+"  Is Valid. ");
			return true;
		}
		else
		{
			System.out.println(email+" Is Not Valid.");
			return false;
			}
		
	}
	
		public  boolean validatingMobileNumber(String moNo) {
			
			System.out.println("Enter User Mobile Number\n"+"In this Formate -: xx x98xxxx988" );
			
			String regix="^[0-9]{2}"+" "+"[0-9]{10}";
			
			boolean result=moNo.matches(regix);

			if(result) {
				System.out.println(moNo+"  Is Valid. ");
				return true;
			}
			else
			{
				System.out.println(moNo+" Is Not Valid.");
				return false;
			}
			
		}
	
	public  boolean validatingPassword(String pswd) {
			
			System.out.println("Enter User Password\n"+"Note-: Having Minimum 8 character with Atleast One Upper Case, One Numeric Number,One special Character." );
						
			String regix="^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%&*?/+])[A-Z a-z 0-9 -_.]{8,}";
			
			boolean result=pswd.matches(regix);

			if(result) {
				System.out.println(pswd+"  Is Valid. ");
				return true;
				
			}
			else
			{
				System.out.println(pswd+" Is Not Valid.");
				return false;
			}
	}
	
	public String moodAnalyser(String mood) {
		
		if(mood.contains("sad")) {
			return "Sad";
		}
		else {
			return "Happy";
		}

		
	}
	
	
	
	
	
	
	
	
}
