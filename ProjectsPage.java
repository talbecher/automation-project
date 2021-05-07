package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProjectsPage extends BasePage {

	@FindBy(css = ".flex.flex-col.justify-center.items-center a")
	private WebElement startBtn;
	@FindBy(css = ".title")
	private List<WebElement> chooseProjectType;
	@FindBy(css = "[title='Invite team member to workspace']")
	private WebElement addTeamMemberBtn;
	@FindBy(css = "#user-email")
	private WebElement emailField;
	@FindBy(css = "[name='role']")
	private WebElement inviteAsBtn;
	@FindBy(css = "[value='200']")
	private WebElement selectValue;

	@FindBy(css = ".font-medium.px-5 > button")
	private WebElement plusBtn;
	@FindBy(css = "[placeholder='Workspace name']")
	private WebElement workSpaceNameField;
	@FindBy(css = "#confirm-create-button")
	private WebElement createBtn;
	@FindBy(css = ".container>a")
	private WebElement goToMainBtn;

	@FindBy(css = ".mt-6.leading-loose a")
	private List<WebElement> selectedWs;
	@FindBy(css = ".mr-3.truncate")
	private List<WebElement> WsList;
	@FindBy(css = ".dropdown.relative.mr-3")
	private WebElement openDropDown;
	@FindBy(css = ".dropdown-menu.w-auto.whitespace-no-wrap.min-w-full.text-left.absolute.bg-white.mt-2.py-2.right-0.rounded.border.border-gray-300.shadow-md.text-gray-700.z-10")
	private List<WebElement> chooseOption;
	@FindBy(css = "div > ul > li:nth-child(2) > button")
	private WebElement deleteBtn;
	@FindBy(css = "div.p-6.md\\:p-8 > input")
	private WebElement deleteProjectTextField;
	@FindBy(css = "#confirm-create-button")
	private WebElement deleteWorkSpaceBtn;
	@FindBy(css = "li:nth-child(1) > button")
	private WebElement renameOption;
	@FindBy(css = "#app > div.vue-portal-target > div > div > div > form > div.p-6.md\\:p-8 > input")
	private WebElement renameField;
	@FindBy(css = "#confirm-create-button")
	private WebElement renameBtn;
	@FindBy(css = ".md\\:px-0.md\\:ml-6.lg\\:ml-8.xl\\:ml-12.items-center > a")
	private WebElement startNewProjectBtn;
	@FindBy(css = ".form-select.ml-auto")
	private WebElement SortingDropDown;
	@FindBy(css = "[value='default']")
	private WebElement sortingList;
	@FindBy(css = "div.hidden.md\\:flex.flex-1.h-8.pr-2.rounded.mr-3 > button")
	private WebElement searchBtn;
	@FindBy(css = "[type='text']")
	private WebElement searchfield;
	@FindBy(css = "[name='role']")
	private WebElement selectInvite;
	@FindBy(css = ".md\\:px-0.md\\:ml-6.lg\\:ml-8.xl\\:ml-12.items-center > a")
	private WebElement createProjectBtn;

	@FindBy(css = "[aria-labelledby='arrow-down']")
	private WebElement optionsBtn;
	@FindBy(css = "div.flex.justify-right.items-center > div > ul > li")
	private List<WebElement> optionsList;
	@FindBy(css = ".absolute.right-0.left-0.mt-8.mx-3.z-100.flex-1 .dropdown.relative")
	private List<WebElement> projectsOptionsList;
	@FindBy(css = "#confirm-delete-button")
	private WebElement deleteProjectBtn;
	@FindBy(css = ".block.text-3xl.font-medium.text-gray-900.leading-none.mb-8")
	private WebElement deleteMsg;
	@FindBy(css = "div.p-6.md\\:p-8 > select")
	private WebElement selectWs;
	@FindBy(css = "#confirm-create-button")
	private WebElement moveProjectBtn;
	@FindBy(css = ".details-container>h3")
	private List<WebElement> projectsList;
	@FindBy(css = "[aria-labelledby='edit']")
	private WebElement editProject;
	@FindBy(css = ".cursor-pointer.relative>span")
	private WebElement addMembersText;
	@FindBy(css = ".col-md-12.c-list-header>h1")
	private WebElement creatProjectPageTitle;
	@FindBy(css = "div.col-md-12.c-list-header > h1")
	private WebElement getTemplatesPageTitle;
	@FindBy(css = "tr:nth-child(7) > td:nth-child(1) > div > div.caption > div.e-button-container > a:nth-child(1) > button")
	private WebElement previewBtn;
	
	

	
	public ProjectsPage(WebDriver driver) {
		super(driver);
	}

	public void chooseProjectType(String name) {
		sleep(1500);
		for (WebElement el : chooseProjectType) {
			if (getText(el).equalsIgnoreCase(name)) {
				click(el);
				break;
			}
		}
	}

	public void addTeamMember(String email) {
		click(addTeamMemberBtn);
		fillText(emailField, email);

	}

	public void inviteAs(String name) {
		Select s = new Select(inviteAsBtn);
		s.selectByVisibleText(name);

	}

	public void createNewWorkSpace(String name) {
		click(plusBtn);
		fillText(workSpaceNameField, name);
		click(createBtn);
	}

	public void goToMain() {
		click(goToMainBtn);
	}

	public void chooseWs(String name) {
		for (int i = 0; i < selectedWs.size(); i++) {
			if (getText(WsList.get(i)).equalsIgnoreCase(name)) {
				click(WsList.get(i));
				break;
			}
		}

	}

	public void deleteWs(String wsName) {
		sleep(1200);
		click(openDropDown);
		for (WebElement el : chooseOption) {
			if (getText(deleteBtn).equalsIgnoreCase("delete workspace")) {
				click(deleteBtn);
				sleep(1000);
				fillText(deleteProjectTextField, wsName);
				click(deleteWorkSpaceBtn);

			}
		}

	}

	public void renameWs(String newWorkSpaceName) {
		click(openDropDown);
		for (WebElement el : chooseOption) {
			click(renameOption);
			renameField.clear();
			fillText(renameField, newWorkSpaceName);
			click(renameBtn);
			{

			}
		}
	}

	public void startProject() {
		click(startNewProjectBtn);

	}

	public void chooseSorting(String name) {
		Select dropdown = new Select(SortingDropDown);
		dropdown.selectByValue(name);
	}

	public void search(String text) {
		click(searchBtn);
		fillText(searchfield, text);

	}

	public void createProject() {
		click(createProjectBtn);
	}


	public void chooseOptions(String optionName) {
		click(optionsBtn);
		for (WebElement el : optionsList) {
			if (getText(el).equalsIgnoreCase(optionName)) {
				click(el);
			}
		}
	}
	
	public void moveProjectToOtherWs(String wsName) {
		click(selectWs);
		selectByVisibleText(selectWs, wsName);
		click(moveProjectBtn);
	}

	public void clickDeleteOption() {
		click(deleteProjectBtn);
	}
	
	public void chooseProject(String name , String option) {
		sleep(1000);
		for (WebElement el : projectsList) {
			if (getText(el).equalsIgnoreCase(name)) {
				mouseHover(el);
				sleep(2000);
		    	click(previewBtn);	
			}
			
		}
	
	}
	
//	public void chooseEditProject(String name) {
//		for (WebElement el : editProject) {
//			if (getText(el).equalsIgnoreCase(name)) {
//				click(el);
//			}
//		}
//	}
	
	// Delete validation
	public String getDeleteMsg() {
		return getText(deleteMsg);
	}
	
	// choose workspace validation
	public String getAddMembersText() {
		return getText(addMembersText);
	}
	
	//create project validation
	public String getChooseProjectTitle() {
		return getText(creatProjectPageTitle);
	}
	
	//Go to templates page validation
	public String getTemplatesTitle() {
		return getText(getTemplatesPageTitle);
	}



}
