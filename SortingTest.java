package tests;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ProjectsPage;

public class SortingTest extends BaseTest{
	
	@Test
	public void tc01_login() {
		LoginPage lp = new LoginPage(driver);
		lp.login("tal24385@gmail.com", "Tal0502439601");
	}
	
  	@Test
  	public void tc02_chooseWs() {
  		ProjectsPage pp = new ProjectsPage(driver);
  		pp.chooseWs("ABC");
  	}
  	
	@Test
  	public void tc03_chooseSort() {
  		ProjectsPage pp = new ProjectsPage(driver);
  		pp.chooseSorting("created-asc");
  	}
	
	

}
