package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectoryPage {

	public DirectoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//b[text()='Directory']") 
	private WebElement directoryTab;
		
	@FindBy(id="searchDirectory_emp_name_empName")
	private WebElement searchName;
	
	@FindBy(id="searchDirectory_job_title")
	private WebElement jobTitleListBox;
	
	@FindBy(id="searchDirectory_location")
	private WebElement jobLocationListBox;
	
	@FindBy(id="searchBtn")
	private WebElement searchButton;
		
	@FindBy(id="resetBtn")
	private WebElement resetButton;
	
	@FindBy(xpath="//b[text()='Garry White']")
	private WebElement verify;
	
	public WebElement getVerify() {
		return verify;
	}

	public WebElement getDirectoryTab() {
		return directoryTab;
	}

	public WebElement getSearchName() {
		return searchName;
	}

	public WebElement getJobTitleListBox() {
		return jobTitleListBox;
	}

	public WebElement getJobLocationListBox() {
		return jobLocationListBox;
	}
	
	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getResetButton() {
		return resetButton;
	}
	
	
}
