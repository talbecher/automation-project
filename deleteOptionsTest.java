package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ProjectsPage;

public class deleteOptionsTest extends BaseTest {
	
	final String wsName = "TAL NEW NAME2";
	final String chooseProjectName = "plplplplpl";
	final String option = "delete project";
	final String chooseDeleteWs = "delete project";

	@Test(description = "check choose WorkSpace")
	public void tc01_chooseWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseWs(wsName);
	}	
		
	@Test(description = "check search project")
	public void tc02_search() {
    ProjectsPage pp = new ProjectsPage(driver);
	pp.search(chooseProjectName);
	}
	
	
	@Test(description = "check delete project")
	public void tc03_delete() {
	ProjectsPage pp = new ProjectsPage(driver);
    pp.chooseOptions(option);
    pp.clickDeleteOption();
	}
	
	@Test(description = "check delete WorkSpace")
	public void tc04_deleteWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseWs("tal1");
		pp.deleteWs("tal1");
	}
	

	    
	}

