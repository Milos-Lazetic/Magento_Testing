package testClasses;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MagentoShipping_testClass extends BaseTestClass{

	
	//@BeforeMethod
	//public void navigation() {
		//driver.navigate().to(baseURL);
	//}
	
	@Test(priority = 0)
// choose an item and add it to the shopping cart
	public void shippingForm() throws InterruptedException {
		driver.navigate().to(baseURL);

		home.clickOnItem();
		item.clickOnSize();
		item.clickOnColor();
		item.clickAddToCartButton();

	}
	
	
	@Test(priority = 1)
// proceed to checkout 
	public void checkout() throws InterruptedException {	
		Thread.sleep(5000);

		item.clickOnNumber();
		item.clickOnProceedToCheckout();

	}

	@Test(priority = 2)
// completing shipping form and placing an order
	public void shipping() throws InterruptedException {
		Thread.sleep(5000);

		shipping.enterEmailAdress("mika@gmail.com");
		shipping.enterFirstName("Laza");
		shipping.enterLastName("Peric");
		shipping.enterStreetAddress("Zmaja od Nocaja 3");
		shipping.enterCity("Babusnica");
		shipping.enterZipCode("12345");
		shipping.enterPhoneNumber("7654321");
		shipping.clickOnRadioButton();
		shipping.selectState();
		shipping.clickOnNextButton();
		
		Thread.sleep(5000);
		
		shipping.clickOnPlaceOrderButton();
	
		Thread.sleep(5000);
		
		System.out.println(shipping.message.getText());
		assertEquals(shipping.message.getText(), "Thank you for your purchase!");
	}
		
	}
	
//	@Test(priority = 1)
	//public void emailAdress() {
		//shipping.enterEmailAdress("mika@gmail.com");
	//}
//}
