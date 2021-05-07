package pageObject;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObject.BasePage;

public class MainPage extends BasePage{
	
	@FindBy(css = ".fas.fa-caret-down.ml-2")
	private WebElement openSettingList;
	@FindBy(css = ".dropdown-menu.w-auto .dropdown-item")
	private List<WebElement> settingList;

	public MainPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void chooseSettingOption(String name) {
		click(openSettingList);
		for (WebElement el : settingList) {
			if (getText(el).equalsIgnoreCase(name)) {
				click(el);
				sleep(1000);
			}
		}
		
	}
	


}
