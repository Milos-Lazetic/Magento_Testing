package testClasses;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MagentoHomePage_testClass extends BaseTestClass{
	
	@BeforeMethod
	public void navigation() {
		driver.navigate().to(baseURL);
	}
	
	@Test(priority = 1)
	// Successfully created account
	public void CreateAnAccountSuccess() throws InterruptedException {
		driver.navigate().to(baseURL);

		home.clickOnCreateAnAccount();
		account.enterFirstName("Mika");
		account.enterLastName("Peric");
		account.enterEmail("Jedan2113@gmail.com");
		account.enterPassword("SaMoJosJedanKoRaK212!");
		account.confirmPassword("SaMoJosJedanKoRaK212!");
		account.clickOnCreateAnAccountButton();
		
		assertEquals(home.getMessage(), "Thank you for registering with Main Website Store.");
		
	}
	
	
	@Test(priority = 0)
	// An attempt to create an already created account
	public void CreateAnAccountUnsuccess() throws InterruptedException {
		driver.navigate().to(baseURL);

		home.clickOnCreateAnAccount();
		account.enterFirstName("Mika");
		account.enterLastName("Peric");
		account.enterEmail("Jedan213@gmail.com");
		account.enterPassword("SaMoJosJedanKoRaK212!");
		account.confirmPassword("SaMoJosJedanKoRaK212!");
		account.clickOnCreateAnAccountButton();
		
		assertTrue(home.getErrorMessage().contains("There is already an account"));
	}

}