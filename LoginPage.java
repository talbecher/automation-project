package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	@FindBy(css = "[name='email']")
	private WebElement emailField;
	@FindBy(css = "[name='password']")
	private WebElement passwordField;
	@FindBy(css = ".btn.btn-primary.btn-lg")
	private WebElement loginBtn;
	@FindBy(css = ".form-group>div>a")
	private WebElement forgotPasswordBtn;
	@FindBy(css = ".btn.btn-secondary")
	private WebElement readMoreBtn;
	@FindBy(css = ".alert.alert-danger")
	private WebElement error;

	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void login(String email , String password) {
		fillText(emailField, email);
		fillText(passwordField, password);
		click(loginBtn);
	}
	
	public void forgotPassword() {
		click(forgotPasswordBtn);
		
	}
	
	public void readMore() {
		click(readMoreBtn);
	}
	
	//validation
	public String getErorMessage() {
		return getText(error);
		
	}
	
	

}
