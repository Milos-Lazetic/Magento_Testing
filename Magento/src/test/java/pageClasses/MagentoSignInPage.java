package pageClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoSignInPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
// elements
	@FindBy(css = "#email")
	WebElement inputField_Email;
	
	@FindBy(css = "[title=\"Password\"]")
	WebElement inputField_pass;
	
	@FindBy(css = ".action.login.primary")
	WebElement signInButton;
	
// constructor
	public MagentoSignInPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
// methods
	public void enterEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(inputField_Email)).clear();
		inputField_Email.sendKeys(email);
	}

	public void enterPass(String pass) {
		wait.until(ExpectedConditions.visibilityOf(inputField_pass)).clear();
		inputField_pass.sendKeys(pass);
	}
	
	public void clickSignInButton() {
		signInButton.click();
	}
	
	}

