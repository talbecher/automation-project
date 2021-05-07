package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntegrationsPage extends BasePage {

	@FindBy(css = ".row.natives>div>a")
	private List<WebElement> integrationList;
	@FindBy(css = ".flex.items-start.md\\:flex-grow > a:nth-child(4)")
	private WebElement integrationLink;

	public IntegrationsPage(WebDriver driver) {
		super(driver);

	}

	public void chooseIntegration(int pos) {
		
		click(integrationList.get(pos));
	}

	public void goToIntegration() {
		click(integrationLink);
	}

}
