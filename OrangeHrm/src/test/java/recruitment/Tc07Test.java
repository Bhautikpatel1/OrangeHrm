package recruitment;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.RecruitmenCandidatetPage;

public class Tc07Test extends BaseTest{
	@Test
	public void login() {
		
		RecruitmenCandidatetPage recruitementPage=new RecruitmenCandidatetPage(driver);
		recruitementPage.getAddButton().click();
		recruitementPage.getFirstNameTextField().sendKeys("Sudarshan");
		recruitementPage.getMiddleNameTextField().sendKeys("S");
		recruitementPage.getLastNameTextField().sendKeys("Gowdru");
		recruitementPage.getEmailTextField().sendKeys("sudarshangkssdd@gmail.com");
		recruitementPage.getContactNoTextField().sendKeys("8861855490");
		recruitementPage.getJobVacancyDropdown().click();
		SelectClassUtil dropdown=new SelectClassUtil();
		dropdown.selectDropDown(recruitementPage.getJobVacancyDropdown(), "Associate IT Manager");
		recruitementPage.getResume().sendKeys("C:\\Users\\Devraj\\Desktop\\Sudarshan S.docx");
		recruitementPage.getKeywordsTextField().sendKeys("abc");
		recruitementPage.getCommentsTextField().sendKeys("details of Candidate");
		recruitementPage.getCheckbox().click();
		recruitementPage.getSaveButton().click();
		
		recruitementPage.getCandidatesList().click();
		recruitementPage.getSelectRecord().click();
		recruitementPage.getDeleteButton().click();
		recruitementPage.getOkButton().click();
		
		}
}
