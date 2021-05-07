package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ProjectsPage;

public class CreateNewWsTest extends BaseTest {


	@Test(description = "check create workspace", dataProvider = "getData")
	public void tc01_createNewWs(String wsName) {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.createNewWorkSpace(wsName);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = {
				{"tal1"},
				{"tal2"},
				{"tal3"},
				{"tal4"},
				{"tal5"},
		};
		return data;	
	}
	
	
	


}
