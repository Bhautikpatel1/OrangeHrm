package genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

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
		
	}
	@AfterClass
	/**
	 * This method is used to perform logout actions on the application
	 */
	public void logout() {
		
	}
	@AfterClass
	/**
	 * This method is used to perform postcondition actions on the application
	 */
	public void postCondition() throws InterruptedException {
		driver.quit();
	}
}
