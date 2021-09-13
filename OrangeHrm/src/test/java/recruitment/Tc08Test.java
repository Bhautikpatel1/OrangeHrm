package recruitment;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.HomePage;
import pomRepository.RecruitmentVacanciesPage;

public class Tc08Test extends BaseTest {
	@Test

	public void Vacancies() {
		HomePage homepage=new HomePage(driver);
		homepage.getRecruitment().click();
		RecruitmentVacanciesPage vacancypage=new RecruitmentVacanciesPage(driver);
		vacancypage.getVacancyBtn().click();

		vacancypage.getAddBtn().click();
		vacancypage.getJobTitleDropdown().click();

		SelectClassUtil dropdown=new SelectClassUtil();
		dropdown.selectDropDown(vacancypage.getJobTitleDropdown(), "Chief Executive Officer");
		vacancypage.getVacancyNameTextField().sendKeys("James");
		vacancypage.getHiringManagerTextField().sendKeys("Orange Test");
		vacancypage.getNoOfPositionsTexyField().sendKeys("10");
		vacancypage.getDescriptionTextField().sendKeys("Job vacancy details");
		vacancypage.getSaveButton().click();
	}
}
