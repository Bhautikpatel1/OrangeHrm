package leave;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.LeavePage;

public class Tc13Test extends BaseTest{

	@Test
	public void leave() throws InterruptedException {
	LeavePage leave=new LeavePage(driver);
	leave.getLeaveTab().click();
	leave.getLeaveList().click();
	leave.getFromDate().clear();
	leave.getFromDate().sendKeys("2021-09-15");//2020-09-13 or 13-09-2020
	leave.getToDate().clear();
	leave.getToDate().sendKeys("2021-10-15");//2021-09-13 or 13-09-2021
	driver.findElement(By.xpath("//label[text()='Pending Approval']/..//input[@value='1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Taken']/..//input[@value='3']")).click();
	leave.getEmpSearchField().sendKeys("Garry White");
	leave.getSearchbtn().click();
	String status = driver.findElement(By.xpath("//td[text()='No Records Found']")).getText();
	Assert.assertEquals(status, "No Records Found","leave is verified");
	}
}
