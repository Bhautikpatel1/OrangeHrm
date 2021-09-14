package recruitment;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.HomePage;
import pomRepository.RecruitmentVacanciesPage;

public class Tc10Test extends BaseTest{

	@Test
	public void deleteVacancy() {
		
		
		HomePage homepage=new HomePage(driver);
		homepage.getRecruitment().click();
		
		RecruitmentVacanciesPage vacancypage=new RecruitmentVacanciesPage(driver);
		vacancypage.getVacancies().click();
		vacancypage.getSelectRecord().click();
		vacancypage.getDeleteButton().click();
		vacancypage.getOkButton().click();
		
		
	}
}
