package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseTest;

public class AdminPage extends BaseTest{

	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="btnAdd")
	private WebElement add;
	
	@FindBy(id="systemUser_userType")
	private WebElement userRoleDropDown;
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement employeeName;
	
	@FindBy(id="systemUser_userName")
	private WebElement userName;
	
	@FindBy(id="systemUser_status")
	private WebElement statusDropDown;
	
	@FindBy(id="systemUser_password")
	private WebElement password;
	
	@FindBy(id="systemUser_confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id="btnSave")
	private WebElement save;
	
	@FindBy(id="btnCancel")
	private WebElement cancel;
	
	@FindBy(id="searchSystemUser_userName")
	private WebElement searchUserName;
	
	@FindBy(id="searchSystemUser_userType")
	private WebElement userRole;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	private WebElement searchemployeeName;
	
	@FindBy(id="searchSystemUser_status")
	private WebElement searchstatus;
	
	@FindBy(id="searchBtn")
	private WebElement search;
	
	@FindBy(id="resetBtn")
	private WebElement reset;

	public WebElement getAdd() {
		return add;
	}

	public WebElement getUserRoleDropDown() {
		return userRoleDropDown;
	}

	public WebElement getEmployeeName() {
		return employeeName;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getStatusDropDown() {
		return statusDropDown;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getSearchUserName() {
		return searchUserName;
	}

	public WebElement getUserRole() {
		return userRole;
	}

	public WebElement getSearchemployeeName() {
		return searchemployeeName;
	}

	public WebElement getSearchstatus() {
		return searchstatus;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}
	
	
}
