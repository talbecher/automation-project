package tests;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.MainPage;

public class MainMenuTest extends BaseTest {
	
	final String optionName = "log out";
	
	
    @Test(description = "check menu")
    public void chooseFromMenu() {
    	MainPage mp = new MainPage(driver);
    	mp.chooseSettingOption(optionName);
    	
    }
    
    
    


}
