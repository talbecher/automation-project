package tests;

import org.testng.annotations.Test;

import pageObject.IntegrationsPage;
import pageObject.LoginPage;

public class IntegrationTest extends BaseTest {
	
	
	@Test
	public void tc01_goToIntegrationPage() {
		IntegrationsPage ip = new IntegrationsPage(driver);
		ip.goToIntegration();
	}
	
	@Test
	public void tc02_chooseIntegration() {
		IntegrationsPage ip = new IntegrationsPage(driver);
		ip.chooseIntegration(0);
	}


}
