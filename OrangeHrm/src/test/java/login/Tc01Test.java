package login;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLibrary.BaseTest;
import pomRepository.LoginPage;

public class Tc01Test extends BaseTest{

	@Test
		public void login() {
			LoginPage loginPage=new LoginPage(driver);
			loginPage.getUsernameTextField().clear();
			loginPage.getUsernameTextField().sendKeys("Admin");
			Reporter.log("Successfully enter username into textFiled",true);
			Assert.assertEquals("Admin", loginPage.getUsernameTextField().getAttribute("value"), "Username is Incorrect");
			loginPage.getPasswordTextFiled().clear();
			loginPage.getPasswordTextFiled().sendKeys("admin123");
			Reporter.log("Successfully enter password into textFiled",true);
			Assert.assertEquals("admin123", loginPage.getPasswordTextFiled().getAttribute("value"), "Password is Incorrect");
			loginPage.getLoginButton().click();
			System.out.println(driver.getTitle());
			Assert.assertEquals("OrangeHRM", driver.getTitle(), "User is not abble to Login");
	}
}
