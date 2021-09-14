package recruitment;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.HomePage;
import pomRepository.RecruitmentCandidatetPage;

public class Tc06Test extends BaseTest{

	@Test
	public void addCandidateDetails() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		homePage.getRecruitment().click();
		RecruitmentCandidatetPage recruitementPage=new RecruitmentCandidatetPage(driver);
		recruitementPage.getAddButton().click();
		recruitementPage.getFirstNameTextField().sendKeys("Sudarshan");
		recruitementPage.getMiddleNameTextField().sendKeys("S");
		recruitementPage.getLastNameTextField().sendKeys("Gowdru");
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
		recruitementPage.getSearchCandidateName().sendKeys("Charles Haywire");
		recruitementPage.getSearchButton().click();
	}
}
