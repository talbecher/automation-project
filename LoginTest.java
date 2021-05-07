package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;

public class LoginTest extends BaseTest {

	@Test(description = "check failure of login", dataProvider = "getData")
	public void tc01_loginFailed(String user, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.login(user, password);
		String expected = "These credentials do not match our records.";
		String actual = lp.getErorMessage();
		assertEquals(actual, expected);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = { 
				{ "user1@gmail.com", "tal" },
				{ "user2@gmail.com", "1293" },
				{ "user3@gmail.com", "+><" },
				{ "user4@gmail.com", "Tal000000000000000" },
				{ "user5@gmail.com", "p" },

		};
		return data;

	}

	@Test(description = "check forgot password link")
	public void tc02_forgotPassword() {
		LoginPage lp = new LoginPage(driver);
		lp.forgotPassword();
		driver.navigate().back();

	}

//	@Test(description = "check read more link")
//	public void tc03_goToReadMore() {
//		LoginPage lp = new LoginPage(driver);
//		lp.readMore();
//		driver.navigate().back();
//	}


	@Test(description = "check successful login")
	public void tc05_loginSucceed() {
		LoginPage lp = new LoginPage(driver);
		lp.login("tal24385@gmail.com", "Tal0502439601");

	}

}
