package recruitment;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.HomePage;
import pomRepository.RecruitmentCandidatetPage;

public class Tc07Test extends BaseTest{
	@Test
	public void login() throws InterruptedException {
		
		HomePage homePage=new HomePage(driver);
		homePage.getRecruitment().click();
		
		 RecruitmentCandidatetPage recruitementPage=new RecruitmentCandidatetPage(driver);
		recruitementPage.getAddButton().click();
		String s1="Sudarshan";
		String s2="S";
		String s3="Gowdru";
		recruitementPage.getFirstNameTextField().sendKeys(s1);
		recruitementPage.getMiddleNameTextField().sendKeys(s2);
		recruitementPage.getLastNameTextField().sendKeys(s3);
		recruitementPage.getEmailTextField().sendKeys("sudarshangkssdd@gmail.com");
		recruitementPage.getContactNoTextField().sendKeys("6362891381");
		recruitementPage.getJobVacancyDropdown().click();
		SelectClassUtil dropdown=new SelectClassUtil();
		dropdown.selectDropDown(recruitementPage.getJobVacancyDropdown(), "Associate IT Manager");
		recruitementPage.getResume().sendKeys("C:\\Users\\Devraj\\Desktop\\Sudarshan S.docx");
		recruitementPage.getKeywordsTextField().sendKeys("abc");
		recruitementPage.getCommentsTextField().sendKeys("details of Candidate");
		recruitementPage.getCheckbox().click();
		recruitementPage.getSaveButton().click();
		recruitementPage.getCandidatesList().click();
		recruitementPage.getSearchCandidateName().sendKeys(s1+" "+s2+" "+s3);
		recruitementPage.getSearchButton().click();
		recruitementPage.getSelectRecord().click();
		Thread.sleep(1000);
		recruitementPage.getDeleteButton().click();
		Thread.sleep(1000);
		recruitementPage.getOkButton().click();
		
		}
      
	}
