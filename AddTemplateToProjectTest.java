package tests;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ProjectsPage;
import pageObject.TemplatesPage;

public class AddTemplateToProjectTest extends BaseTest{
	

	@Test
	public void tc01_chooseWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseWs("Tal new name2");
	}

	@Test
	public void tc02_createProject() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.createProject();
		pp.chooseProjectType("quiz");
	}
	
	@Test
	public void tc03_choosetemplate() {
		TemplatesPage tp = new TemplatesPage(driver);
		tp.chooseTemplate("Technology Quiz");

	}

	@Test
	public void tc04_chooseProjectType() {
	TemplatesPage tp = new TemplatesPage(driver);
	tp.addProjectToWs("Quiz Project");
	}
	

	
//	@Test
//	public void tc07_addToProject() {
//		TemplatesPage tp = new TemplatesPage(driver);
//		tp.addProjectToWs(name);
//	}
	
	


}
