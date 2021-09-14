package leave;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.LeavePage;

public class Tc12Test extends BaseTest{

	@Test
	public void leave() throws InterruptedException {
		LeavePage leave=new LeavePage(driver);
		leave.getLeaveTab().click();
		leave.getLeaveList().click();
		leave.getFromDate().clear();
		leave.getFromDate().sendKeys("2020-09-13");//2020-09-13 or 13-09-2020
		leave.getToDate().clear();
		leave.getToDate().sendKeys("2021-09-13");//2021-09-13 or 13-09-2021
		Thread.sleep(2000);
		leave.getApprovalCheckBox().click();
		leave.getTakenCheckBox().click();
		leave.getEmpSearchField().sendKeys("Garry White");
		leave.getSearchbtn().click();
		String status = driver.findElement(By.linkText("Taken(1.00)")).getText();
		Assert.assertEquals(status, "Taken(1.00)","leave status is not verified");
		Reporter.log("Leave status is verified",true);
	}
}