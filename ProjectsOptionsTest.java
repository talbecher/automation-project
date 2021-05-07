package tests;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ProjectsPage;

public class ProjectsOptionsTest extends BaseTest {
	
	final String workSpaceName = "TAL NEW NAME2";
	final String searchProjectName = "copywriter project tal";
	final String optionName = "move to workspace";
	final String moveToWsName = "tal4";
	
	
	@Test(description = "check choose workspace")
	public void tc01_chooseWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseWs(workSpaceName);
	}
	
	@Test(description = "check search")
	public void tc02_search() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.search(searchProjectName);
	}
	
	@Test(description = "check move project to another workspace")
	public void tc03_chooseProjectOption() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseOptions(optionName);
		pp.moveProjectToOtherWs(moveToWsName);
	}


}
