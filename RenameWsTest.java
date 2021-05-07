package tests;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ProjectsPage;

public class RenameWsTest extends BaseTest {
	
	final String workspaceName = "tal5";
	final String workspaceNewName = "TAL NEW NAME2";
	
	@Test
	public void tc01_chooseWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseWs(workspaceName);
	}
	
	@Test
	public void tc02_renameWorkSpace() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.renameWs(workspaceNewName);
	}
	

}
