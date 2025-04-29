package testClasses;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import pageClasses.MagentoCreateAccount;
import pageClasses.MagentoHomePage;
import pageClasses.MagentoItem;
import pageClasses.MagentoShipping;
import pageClasses.MagentoSignInPage;

public class BaseTestClass {
	
	 public WebDriver driver;
	 public MagentoHomePage home;
	 public MagentoCreateAccount account ;
	 public MagentoSignInPage signIn;
	 public MagentoItem item;
	 public MagentoShipping shipping;
	 
	 public String baseURL = "https://magento.softwaretestingboard.com";
	 public String baseURL1 = "https://magento.softwaretestingboard.com/checkout/#shipping";
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 
	 
	 @BeforeTest
	 public void initialization() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		 
		 
		 home = new MagentoHomePage(driver);
		 account = new MagentoCreateAccount(driver);
		 signIn = new MagentoSignInPage(driver);
		 item = new MagentoItem(driver);
		 shipping = new MagentoShipping(driver);
		 
	 }
			 
}
