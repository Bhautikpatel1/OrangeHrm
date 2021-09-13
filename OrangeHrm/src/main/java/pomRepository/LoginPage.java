package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseTest;

public class LoginPage extends BaseTest{
	
    public LoginPage(WebDriver driver){
    	
    	PageFactory.initElements(driver,this);
    }
    @FindBy(id="txtUsername")
    private WebElement usernameTextField;
    
    @FindBy(id="txtPassword")
    private WebElement passwordTextFiled;
    
    @FindBy(id="btnLogin")
    private WebElement loginButton;
    
    @FindBy(id="spanMessage")
    private WebElement errorMessage;
    
	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextFiled() {
		return passwordTextFiled;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
