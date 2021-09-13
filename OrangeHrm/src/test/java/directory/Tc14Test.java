package directory;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.DirectoryPage;

public class Tc14Test extends BaseTest{

	@Test()
	public void directory() throws InterruptedException {
		DirectoryPage directory= new DirectoryPage(driver);
		directory.getDirectoryTab().click();
		Reporter.log("Directory Page is Displayed",true);
		directory.getSearchName().sendKeys("Garry White");
		directory.getSearchButton();
		String userName = directory.getVerify().getText();
		Assert.assertEquals(userName,"Garry White","User not found");
		Reporter.log("User found",true);
		Thread.sleep(3000);
				
	}
	
}
