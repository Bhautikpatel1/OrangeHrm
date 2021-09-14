package performance;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.PerformancePage;

public class Tc11Test extends BaseTest{

@Test
	
	public void managerReview() {
		HomePage homepage=new HomePage(driver);
		homepage.getPerformanceButton().click();
		
		PerformancePage performancepage=new PerformancePage(driver);
		performancepage.getManageReview().click();
		performancepage.getManageReviewButton().click();
		performancepage.getEmpNameDropdown().sendKeys("Fiona Grace");
		performancepage.getJobTitleDropdown().sendKeys("Software Architect");
		performancepage.getStatusDropdown().sendKeys("In Progress");
		performancepage.getSearchButton().click();
	}
}
