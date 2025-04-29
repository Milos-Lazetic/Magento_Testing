package pageClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoHomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
// elements
	@FindBy(linkText = "Create an Account")
	WebElement createAnAccount;
	
	@FindBy(linkText = "Sign In")
	WebElement sign_In;
	
	@FindBy(css = ".product-image-photo")
	List<WebElement> items; 
	
	@FindBy(css = ".message-success.success.message")
	WebElement message;
	
	@FindBy(css = ".message-error.error.message")
	WebElement errorMessage;
		
// constructor
	public MagentoHomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
// methods
	public void clickOnCreateAnAccount() {
		wait.until(ExpectedConditions.visibilityOf(createAnAccount));
		createAnAccount.click();
	}
	
	public void clickOnSignIn() {
		//wait.until(ExpectedConditions.visibilityOf(sign_In));
		sign_In.click();
	}
	
	public void clickOnItem() {
		items.get(3).click();
	}
	
	public String getMessage() {
		wait.until(ExpectedConditions.visibilityOf(message));
		return message.getText();
	}
	
	public String getErrorMessage() {
		wait.until(ExpectedConditions.visibilityOf(errorMessage));
		return errorMessage.getText();
	}
}
