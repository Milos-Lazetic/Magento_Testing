package testClasses;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MagentoSignInPage_testClass extends BaseTestClass{
	
	@BeforeMethod
	public void navigation() {
		driver.navigate().to(baseURL);
	}
	
	@Test
	// Successful sign in
	public void clickSignIn() {
		home.clickOnSignIn();
		signIn.enterEmail("Jedan3@gmail.com");
		signIn.enterPass("SaMoJosJedanKoRaK212!");
		signIn.clickSignInButton();
	}
}
