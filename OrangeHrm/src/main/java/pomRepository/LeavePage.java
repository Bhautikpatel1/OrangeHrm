package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.BaseTest;

public class LeavePage extends BaseTest{

	public LeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="menu_leave_viewLeaveModule")
	private WebElement leaveTab;

	@FindBy(id="menu_leave_viewLeaveList")
	private WebElement leaveList;

	@FindBy(id="calFromDate")
	private WebElement fromDate;

	@FindBy(id="calToDate")
	private WebElement toDate;

	@FindBy(id="btnSearch")
	private WebElement searchbtn;

	@FindBy(id="leaveList_txtEmployee_empName")
	private WebElement empSearchField;

	public WebElement getEmpSearchField() {
		return empSearchField;
	}
	public WebElement getLeaveTab() {
		return leaveTab;
	}
	public WebElement getLeaveList() {
		return leaveList;
	}
	public WebElement getFromDate() {
		return fromDate;
	}
	public WebElement getToDate() {
		return toDate;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
}
