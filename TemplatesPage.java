package pageObject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemplatesPage extends BasePage {

	@FindBy(css = ".c-thumbnail-image-wrapper>a")
	private List<WebElement> templatesList;
	@FindBy(css = "[name='project_name']")
	private WebElement projectNameField;
	@FindBy(css = ".swal-button.swal-button--confirm")
	private WebElement startEditingBtn;
	@FindBy(css = ".e-close.nav-link")
	private WebElement saveAndExitBtn;

	
	
	public TemplatesPage(WebDriver driver) {
		super(driver);

	}

	public void chooseTemplate(String name) {
		sleep(6000);
		for (WebElement el : templatesList) {
			if (getText(el).equalsIgnoreCase(name)); {
				click(el);
				break;

			}

		}

	}
	
	public void addProjectToWs(String name) {
		sleep(1500);
		fillText(projectNameField, name);
		click(startEditingBtn);
		click(saveAndExitBtn);
	}

}
