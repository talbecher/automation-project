package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage  {
	WebDriver driver;
	private Actions action;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}
	/*
	 * Wrapped the clear + sendkeys methods with one method 
	 */
	public void fillText(WebElement el,String text) {
		highlightElement(el, "blue");
		el.clear();
		el.sendKeys(text);
		sleep(500);
	}

	public void click(WebElement el) {
		//highlight
		highlightElement(el, "blue");
		sleep(1000);
		el.click();
	}

	public String getText(WebElement el) {
		return el.getText();
	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void alertOK() {
		driver.switchTo().alert().accept();	
	}
	
	public void selectByValue(WebElement el , String value) {
		Select 	s = new Select(el);
		s.selectByValue(value);	
	}
	
	public void selectByVisibleText(WebElement el , String value) {
		Select 	s = new Select(el);
		s.selectByVisibleText(value);	
	}
	
	public void moveTo(WebElement el) {
		action = new Actions(driver);
		action.moveToElement(el).build().perform();
	}
	//mouse
	public void mouseHover(WebElement el) {
		action = new Actions(driver);
		action.moveToElement(el).build().perform();
	}

	//mouse
	public void rightClick(WebElement el) {
		action.moveToElement(el).build().perform();
	}
	
	

	/*
	 * Call this method with your element and a color like (red,green,orange etc...)
	 */
	protected void highlightElement(WebElement element, String color) {
		//keep the old style to change it back
		String originalStyle = element.getAttribute("style");
		String newStyle = "border: 1px solid " + color + ";background-color:yellow;" + originalStyle;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Change the style 
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '" + newStyle + "');},0);",
				element);

		// Change the style back after few miliseconds
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '"
				+ originalStyle + "');},400);", element);

	}
	
	
	
	
	
	
}
