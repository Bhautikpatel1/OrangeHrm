package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentVacanciesPage {
 
	public RecruitmentVacanciesPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(id="menu_recruitment_viewJobVacancy")
		private WebElement vacancyBtn;

		@FindBy(id="btnAdd")
		private WebElement AddBtn;
		
		@FindBy(id="addJobVacancy_jobTitle")
		private WebElement jobTitleDropdown;
		
		@FindBy(id="addJobVacancy_name")
		private WebElement vacancyNameTextField;
		
		@FindBy(id="addJobVacancy_hiringManager")
		private WebElement hiringManagerTextField;
		
		@FindBy(id="addJobVacancy_noOfPositions")
		private WebElement noOfPositionsTexyField;
		
		@FindBy(id="addJobVacancy_description")
		private WebElement descriptionTextField;
		
		@FindBy(id="btnSave")
		private WebElement SaveButton;
		
		public WebElement getVacancyBtn() {
			return vacancyBtn;
		}

		public WebElement getAddBtn() {
			return AddBtn;
		}

		public WebElement getJobTitleDropdown() {
			return jobTitleDropdown;
		}

		public WebElement getVacancyNameTextField() {
			return vacancyNameTextField;
		}

		public WebElement getHiringManagerTextField() {
			return hiringManagerTextField;
		}

		public WebElement getNoOfPositionsTexyField() {
			return noOfPositionsTexyField;
		}

		public WebElement getDescriptionTextField() {
			return descriptionTextField;
		}

		public WebElement getSaveButton() {
			return SaveButton;
		}

		
		
		
		
		
		
}
