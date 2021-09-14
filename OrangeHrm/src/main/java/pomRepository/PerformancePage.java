package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformancePage {

	 public PerformancePage(WebDriver driver){
	    	
	    	PageFactory.initElements(driver,this);
	 }

	 @FindBy(id="menu_performance_ManageReviews")
	 private WebElement manageReview;
	 
	public WebElement getManageReview() {
		return manageReview;
	}

	@FindBy(id="menu_performance_searchPerformancReview")
	private WebElement manageReviewButton;
	
	@FindBy(id="performanceReview360SearchForm_employeeName")
	private WebElement EmpNameDropdown;
	
	@FindBy(id="performanceReview360SearchForm_jobTitleCode")
	private WebElement jobTitleDropdown;
	
	@FindBy(id="performanceReview360SearchForm_status")
	private WebElement statusDropdown;
	
	@FindBy(id="btnSearch")
	private WebElement searchButton;

	public WebElement getManageReviewButton() {
		return manageReviewButton;
	}

	public WebElement getEmpNameDropdown() {
		return EmpNameDropdown;
	}

	public WebElement getJobTitleDropdown() {
		return jobTitleDropdown;
	}

	public WebElement getStatusDropdown() {
		return statusDropdown;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
}
