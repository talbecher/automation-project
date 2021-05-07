package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ProjectsPage;
import pageObject.TemplatesPage;

public class AddAnotherProjectTest extends BaseTest {

	final String chooseWsName = "Tal4";
	final String projectType = "quiz";
	final String templateName = "What's Your Travel Type?";
	final String projectName = "plplplplpl";
	
	@Test(description = "check choose workspace")
	public void tc01_chooseWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseWs(chooseWsName);
		String expected = "Add team members";
		String actual = pp.getAddMembersText();
		assertEquals(actual, expected);
	}


	@Test(description = "check create project button")
	public void tc02_createProject() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.createProject();
		String expected = "Choose project type";
		String actual = pp.getChooseProjectTitle();
		assertEquals(actual, expected);
	}

	@Test(description = "check choose project type")
	public void tc03_chooseProjectType() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseProjectType(projectType);
		String expected = "Templates";
		String actual = pp.getTemplatesTitle();
		assertEquals(actual, expected);
	}
	
	@Test(description = "check choose templates + add new project to workspace")
	public void tc04_choosetemplateName() {
		TemplatesPage tp = new TemplatesPage(driver);
		tp.chooseTemplate(templateName);
		tp.addProjectToWs(projectName);
       
    
	}

}
