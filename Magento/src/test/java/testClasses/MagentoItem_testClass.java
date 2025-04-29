package testClasses;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MagentoItem_testClass extends BaseTestClass{
	
	@BeforeMethod
	public void navigation() {
		driver.navigate().to(baseURL);
	}
	
	@Test(priority = 0)
// choose an item and add it to the shopping cart
	public void item() throws InterruptedException {
		home.clickOnItem();
		item.clickOnSize();
		item.clickOnColor();
		item.clickAddToCartButton();
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(item.messageSuccess));
		assertEquals(item.messageSuccess.getText(),("You added Hero Hoodie to your shopping cart."));
		
	}
	
	@Test(priority = 1)
// delete an item from the shopping cart
	public void deleteItem() {
		item.clickOnNumber();
		item.deleteItem();
		item.clickOkButton();
		
	}

	@Test(priority = 2)
// choose an item and proceed to checkout
	public void checkout() throws InterruptedException {
		item();
		item.clickOnNumber();
		item.clickOnProceedToCheckout();
		
	}
}
