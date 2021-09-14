package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentCandidatetPage {

	public RecruitmentCandidatetPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="btnAdd")
	private WebElement AddButton;


	@FindBy(id="addCandidate_firstName")
	private WebElement FirstNameTextField;

	@FindBy(id="addCandidate_middleName")
	private WebElement MiddleNameTextField;

	@FindBy(id="addCandidate_lastName")
	private WebElement LastNameTextField;

	@FindBy(id="addCandidate_email")
	private WebElement EmailTextField;

	@FindBy(id="addCandidate_contactNo")
	private WebElement ContactNoTextField;

	@FindBy(id="addCandidate_vacancy")
	private WebElement JobVacancyDropdown;

	@FindBy(id="addCandidate_resume")
	private WebElement resume;

	@FindBy(id="addCandidate_keyWords")
	private WebElement keywordsTextField;

	@FindBy(id="addCandidate_comment")
	private WebElement commentsTextField;

	@FindBy(id="addCandidate_appliedDate")
	private WebElement appliedDate;

	@FindBy(id="addCandidate_consentToKeepData")
	private WebElement checkbox;

	@FindBy(id="btnSave")
	private WebElement SaveButton;

	@FindBy(id="menu_recruitment_viewCandidates")
	private WebElement CandidatesList;


	@FindBy(id="candidateSearch_jobTitle")
	private WebElement jobTitle;
	
	@FindBy(id="candidateSearch_jobVacancy")
	private WebElement jobVacancy;

	@FindBy(id="candidateSearch_hiringManager")
	private WebElement hiringManager;
	
	@FindBy(id="candidateSearch_status")
	private WebElement searchStatus;
	
	@FindBy(id="candidateSearch_candidateName")
	private WebElement searchCandidateName;
	
	@FindBy(id="candidateSearch_keywords")
	private WebElement searchkeyword;
	
	@FindBy(id="candidateSearch_modeOfApplication")
	private WebElement modeOfApplication;
	
	@FindBy(id="vacancySearch_jobVacancy")
	private WebElement vacancyDropdown;
	
	;

	public WebElement getVacancyDropdown() {
		return vacancyDropdown;
	}
	
	@FindBy(id="btnSrch")
	private WebElement searchButton;


	public WebElement getSearchButton() {
		return searchButton;
	}
	
	@FindBy(xpath="//input[@type='checkbox']/../../../..//input[@name='chkSelectRow[]']")
    private WebElement selectRecord;


	public WebElement getSelectRecord() {
		return selectRecord;
	}
	
	@FindBy(id="btnDelete")
	private WebElement DeleteButton;

	
	public WebElement getDeleteButton() {
		return DeleteButton;
	}


	public WebElement getOkButton() {
		return OkButton;
	}

	@FindBy(id="dialogDeleteBtn")
	private WebElement OkButton;

	
	public WebElement getJobTitle() {
		return jobTitle;
	}


	public WebElement getJobVacancy() {
		return jobVacancy;
	}


	public WebElement getHiringManager() {
		return hiringManager;
	}


	public WebElement getSearchStatus() {
		return searchStatus;
	}


	public WebElement getSearchCandidateName() {
		return searchCandidateName;
	}


	public WebElement getSearchkeyword() {
		return searchkeyword;
	}


	public WebElement getModeOfApplication() {
		return modeOfApplication;
	}


	public WebElement getCandidatesList() {
		return CandidatesList;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCommentsTextField() {
		return commentsTextField;
	}

	public WebElement getAppliedDate() {
		return appliedDate;
	}

	public WebElement getKeywordsTextField() {
		return keywordsTextField;
	}

	public WebElement getAddButton() {
		return AddButton;
	}


	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getMiddleNameTextField() {
		return MiddleNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getContactNoTextField() {
		return ContactNoTextField;
	}

	public WebElement getJobVacancyDropdown() {
		return JobVacancyDropdown;
	}

	public WebElement getResume() {
		return resume;
	}

}
