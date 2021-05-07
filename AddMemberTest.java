package tests;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ProjectsPage;

public class AddMemberTest extends BaseTest {
	
	final String workSpaceName = "tal012";
	final String inviteAs = "as viewer";
	final String teamMemberEmail = "Tal24385@gmail.com";
	
	
	@Test(description = "check choose WorkSpace")
	public void tc01_chooseWs() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.chooseWs(workSpaceName);
		String expected = "Add team members";
		String actual = pp.getAddMembersText();
		assertEquals(actual, expected);
	}
	
	@Test(description = "check add team member")
	public void tc02_addMember() {
		ProjectsPage psp = new ProjectsPage(driver);
		psp.addTeamMember(teamMemberEmail);

	}
	
	@Test(description = "check invite as editor")
	public void tc03_inviteAs() {
		ProjectsPage pp = new ProjectsPage(driver);
		pp.inviteAs(inviteAs);
		
	}


	
}
