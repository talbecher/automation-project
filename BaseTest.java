package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.LoginPage;

public class BaseTest {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Tal\\Automation\\drivers");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.involve.me/login");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@BeforeClass
	public void tc01_login() {
		LoginPage lp = new LoginPage(driver);
		lp.login("tal24385@gmail.com", "Tal0502439601");
	}


	@AfterClass
	public void tearDown() {
	//driver.quit();
	}
}
