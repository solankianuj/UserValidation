package userValidationProblem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserVAlidationTest {
	UserValidation valid;
	
	@Before
	public void setUp() {
		valid=new UserValidation();
		}
	
	@Test
	public void validatindFirstNameTest_IsValid_ThenTrue() {
		assertEquals(true,valid.validatingLastName("Anuj"));
	}

	@Test
	public void validatindLastNameTest_IsValid_ThenTrue() {
		assertEquals(true,valid.validatingLastName("Solanki"));
		}
	
	@Test
	public void validatingEmailTest_IsValid_ThenTrue() {
		assertEquals(true,valid.validatingEmail("anuj@solanki.com"));	
	}
	
	@Test
	public void validatingMobileNumberTest_IsValid_ThenTrue() {
		assertEquals(true,valid.validatingMobileNumber("91 7987359946"));	
	}
	
	@Test
	public void validatingPasswordTest_IsValid_ThenTrue() {
		assertEquals(true,valid.validatingPassword("Cccc2222@aj"));	
		}
	@Test
	public void moodAnalyserTest() {
		assertEquals("Sad",valid.moodAnalyser("This Is a sad Message"));	
	}
	
	
}
