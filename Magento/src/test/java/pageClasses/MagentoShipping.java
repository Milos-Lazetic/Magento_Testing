package pageClasses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testClasses.BaseTestClass;

public class MagentoShipping {

	WebDriver driver;
	WebDriverWait wait;
	
// elements
	@FindBy(id = "customer-email")
	List<WebElement> emailAdressess;
	
	@FindBy(css = "[name=\"firstname\"]")
	WebElement firstName;
	
	@FindBy(css = "[name=\"lastname\"]")
	WebElement lastName;
	
	@FindBy(css = "[name=\"street[0]\"]")
	WebElement street;
	
	@FindBy(css = "[name=\"city\"]")
	WebElement nameOfTheCity;
	
	@FindBy(css = "[name=\"postcode\"]")
	WebElement zipCode;
	
	@FindBy(css = "[name=\"telephone\"]")
	WebElement phoneNumber;
	
	@FindBy(css = "[value=\"tablerate_bestway\"]")
	WebElement radio;
	
	@FindBy(css = ".button.action.continue.primary")
	WebElement buttonNext;
	
	@FindBy(css = "[name=\"region_id\"]")
	WebElement state;
	
	@FindBy(css = ".action.primary.checkout")
	WebElement buttonPlaceOrder;
	
	@FindBy(css = "h1.page-title")
//	@FindBy(css = "div.checkout-success>p")
public	WebElement message;
	
// constructor
	public MagentoShipping(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
// methods
	public void enterEmailAdress(String email) {
		wait.until(ExpectedConditions.visibilityOf(emailAdressess.getFirst())).clear();
		emailAdressess.getFirst().sendKeys(email);
	}
	
	public void enterFirstName(String fName) {
		wait.until(ExpectedConditions.visibilityOf(firstName)).clear();
		firstName.sendKeys(fName);
	}
	
	public void enterLastName(String lName) {
		wait.until(ExpectedConditions.visibilityOf(lastName)).clear();
		lastName.sendKeys(lName);
	}
	
	public void enterStreetAddress(String streetAddress) {
		wait.until(ExpectedConditions.visibilityOf(street)).clear();
		street.sendKeys(streetAddress);
	}
	
	public void enterCity(String city) {
		wait.until(ExpectedConditions.visibilityOf(nameOfTheCity)).clear();
		nameOfTheCity.sendKeys(city);
	}
	
	public void enterZipCode(String zip) {
		wait.until(ExpectedConditions.visibilityOf(zipCode)).clear();
		zipCode.sendKeys(zip);
	}
	
	public void enterPhoneNumber(String phone) {
		wait.until(ExpectedConditions.visibilityOf(phoneNumber)).clear();
		phoneNumber.sendKeys(phone);
	}
	
	public void clickOnRadioButton() {
		radio.click();
	}
	
	public void clickOnNextButton() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonNext)).click();
	}
	
	public void selectState() {
		Select dropdown = new Select(state);
		dropdown.selectByIndex(1);
	}
	
	public void clickOnPlaceOrderButton() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonPlaceOrder));
		buttonPlaceOrder.click();
	}
	
	//public String titleText() {
		//return title.getText();
	}
		
//}
