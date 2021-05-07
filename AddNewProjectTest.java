package tests;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ProjectsPage;
import pageObject.TemplatesPage;

public class AddNewProjectTest extends BaseTest{
	

	
	@Test
	public void tc01_chooseWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseWs("tal new name");
	}
	
	@Test
	public void tc02_chooseNewProject() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.startProject();
	}

	@Test
	public void tc03_chooseProjectType() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseProjectType("quiz");
	}
	
	@Test
	public void tc04_choosetemplate() {
		TemplatesPage tp = new TemplatesPage(driver);
		tp.chooseTemplate("Technology Quiz");

	}
	

}
