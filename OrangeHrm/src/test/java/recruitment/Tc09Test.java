package recruitment;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.SelectClassUtil;
import pomRepository.HomePage;
import pomRepository.RecruitmentVacanciesPage;

public class Tc09Test extends BaseTest{

@Test
	
	public void searchVacancy() throws InterruptedException {
		HomePage homepage=new HomePage(driver);
		homepage.getRecruitment().click();
		
		RecruitmentVacanciesPage vacancypage=new RecruitmentVacanciesPage(driver);
		vacancypage.getVacancies().click();
		vacancypage.getVacancyDropdown().click();
		
		Thread.sleep(1000);
		
		SelectClassUtil dropdown=new SelectClassUtil();
		dropdown.selectDropDown(vacancypage.getVacancyDropdown(), "James");
		
		vacancypage.getSearchButton().click();
		Thread.sleep(1000);

	}
	
}
