package pageClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoCreateAccount {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(css = "#firstname")
	WebElement inputField_FirstName;
	
	@FindBy(css = "#lastname")
	WebElement inputField_LastName;
	
	@FindBy(name = "email")
	WebElement inputField_Email;
	
	@FindBy(css = ".control>#password")
	WebElement inputField_Password;
	
	@FindBy(css = "#password-confirmation")
	WebElement inputField_PasswordConfirmation;
	
	@FindBy(css = ".action.submit.primary")
	WebElement button_CreateAnAccount;

	public MagentoCreateAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	public void enterFirstName(String firstName) {
		wait.until(ExpectedConditions.visibilityOf(inputField_FirstName)).clear();
		inputField_FirstName.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		wait.until(ExpectedConditions.visibilityOf(inputField_LastName)).clear();
		inputField_LastName.sendKeys(lastName);
	}
	
	public void enterEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(inputField_Email)).clear();
		inputField_Email.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(inputField_Password)).clear();
		inputField_Password.sendKeys(password);
	}
	
	public void confirmPassword(String passwordConfirmation) {
		wait.until(ExpectedConditions.visibilityOf(inputField_PasswordConfirmation)).clear();
		inputField_PasswordConfirmation.sendKeys(passwordConfirmation);
		
	}
	
	public void clickOnCreateAnAccountButton() {
		button_CreateAnAccount.click();
	}
}
