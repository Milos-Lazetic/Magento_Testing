package pageClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoItem {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//@FindBy(xpath = "//*[@id=\"option-label-size-143-item-170\"]")

// elements
	@FindBy(css = "#option-label-size-143-item-170")
	WebElement size;
	
	@FindBy(id = "option-label-color-93-item-52")
	WebElement color;
	
	@FindBy(id = "product-addtocart-button")
	WebElement addToCartButton;
	
	@FindBy(className = "counter-number")
	WebElement number;
	
	@FindBy(css = ".action.delete")
	WebElement deleteNumber;
	
	@FindBy(css = ".action.primary.checkout")
	WebElement proceedToCheckout;
	
	@FindBy(css = ".action-primary.action-accept")
	WebElement buttonOK;
	
	@FindBy(css = ".message-success.success.message")
public	WebElement messageSuccess;
	
	
// constructor
	public MagentoItem(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
// methods
	public void clickOnSize() {
		wait.until(ExpectedConditions.visibilityOf(size));
		size.click();
	}
	
	public void clickOnColor() {
		color.click();
	}
	
	public void clickAddToCartButton() {
		addToCartButton.click();
	}
	
	public void clickOnNumber() {
		wait.until(ExpectedConditions.elementToBeClickable(number));
		number.click();
	}

	public void deleteItem() {
		deleteNumber.click();
	}
	
	public void clickOnProceedToCheckout() {
		wait.until(ExpectedConditions.visibilityOf(proceedToCheckout));

		proceedToCheckout.click();
	}
	
	public void clickOkButton() {
		wait.until(ExpectedConditions.visibilityOf(buttonOK));
		buttonOK.click();
	}
}
