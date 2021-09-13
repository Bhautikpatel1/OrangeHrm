package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseTest;

public class HomePage extends BaseTest {
     
    public HomePage(WebDriver driver){
    	
    	PageFactory.initElements(driver,this);
    }
	@FindBy(id="welcome")
	private WebElement account;
	
	@FindBy(linkText="Logout")
	private WebElement logout;
	
	@FindBy(xpath="//b[text()='Admin']")
	private WebElement admin;

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getLogout() {
		return logout;
	}
}
