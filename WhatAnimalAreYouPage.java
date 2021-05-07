package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatAnimalAreYouPage extends BasePage{

	@FindBy(css = ".c-button.btn")
	private WebElement findOutBtn;
	@FindBy(css = ".answer-behaviour.circle>span")
	private List<WebElement> chooseLivingPlace ;
	@FindBy(css = ".btn.btn-secondary")
	private  List<WebElement> howFastAreYou;
	@FindBy(css = ".c-image-answer-title")
	private  List<WebElement> chooseFavoriteElement;
	@FindBy(css = ".c-answer.answer-behaviour.btn.btn-secondary")
	private  List<WebElement> chooseWhereYouBeIn10Years;
	@FindBy(css = ".c-button-group-button.e-use-template.float-right")
	private WebElement useTemplateBtn;
	@FindBy(css = "[name='project_name']")
	private WebElement projectNameField;
	@FindBy(css = ".swal-button.swal-button--confirm")
	private WebElement startEditingBtm;
	@FindBy(css = ".e-close.nav-link")
	private WebElement saveAndExitBtm;
	
	
	
	public WhatAnimalAreYouPage(WebDriver driver) {
		super(driver);

	}
	
	public void startQuiz() {
		sleep(2000);
	  click(findOutBtn);
		
	}
	
	public void WhereWouldYouChooseToLive(String answer) {
		sleep(2000);
		for (WebElement el : chooseLivingPlace) {
			if (getText(el).equalsIgnoreCase(answer)) {
         		mouseHover(el);
         		sleep(2000);
				click(el);
			}
			}
	}
	
	public void howFastAreYou(String numAnswer) {
		for (WebElement el : howFastAreYou) {
			if (getText(el).equalsIgnoreCase(numAnswer)) {
				click(el);
				
			}
		}
	
	}
	
	public void favoriteElement(String element) {
		for (WebElement el : chooseFavoriteElement) {
			if (getText(el).equalsIgnoreCase(element)) {
				click(el);
			}
		}
	}
	
	
	public void WhereDoYouSeeYourselfIn10Years(String placeName) {
		for (WebElement el : chooseWhereYouBeIn10Years) {
			if (getText(el).equalsIgnoreCase(placeName)) {
				click(el);
			}
		}
	}
	
	
//	public void addQuizToProject(String projectName) {
//		click(useTemplateBtn);
//		fillText(projectNameField, projectName);
//		click(startEditingBtm);
//		click(saveAndExitBtm);
//		
//	}
}
