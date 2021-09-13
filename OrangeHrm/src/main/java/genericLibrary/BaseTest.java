package genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomRepository.HomePage;
import pomRepository.LoginPage;

/**
 * 
 * @author Sudarshan
 *
 */
public class BaseTest {
	public static WebDriver driver;
	@BeforeClass
	/**
	 * This method is used to perform precondition actions on the application
	 */
	public void preCondition() {
		System.setProperty(IAutoConstants.CHROME_KEY, IAutoConstants.CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	/**
	 * This method is used to perform login actions on the application
	 */
	public void loginCredentials() {
		driver.get(IAutoConstants.URL);
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getUsernameTextField().clear();
		loginPage.getUsernameTextField().sendKeys("Admin");
		Reporter.log("Successfully enter username into textFiled",true);
		Assert.assertEquals("Admin", loginPage.getUsernameTextField().getAttribute("value"), "Username is Incorrect");
		loginPage.getPasswordTextFiled().clear();
		loginPage.getPasswordTextFiled().sendKeys("admin123");
		Reporter.log("Successfully enter password into textFiled",true);
		Assert.assertEquals("admin123", loginPage.getPasswordTextFiled().getAttribute("value"), "Password is Incorrect");
		loginPage.getLoginButton().click();
		System.out.println(driver.getTitle());
		Assert.assertEquals("OrangeHRM", driver.getTitle(), "User is not abble to Login");
		
	}
	@AfterClass
	/**
	 * This method is used to perform logout actions on the application
	 */
	public void logout() {
		HomePage homePage=new HomePage(driver);
		homePage.getAccount().click();
		homePage.getLogout().click();
	}
	@AfterClass
	/**
	 * This method is used to perform postcondition actions on the application
	 */
	public void postCondition() throws InterruptedException {
		driver.quit();
	}
}
