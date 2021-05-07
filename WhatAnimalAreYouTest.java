package tests;

import org.testng.annotations.Test;

import pageObject.ProjectsPage;
import pageObject.WhatAnimalAreYouPage;

public class WhatAnimalAreYouTest extends BaseTest{

	
	@Test
	public void tc01_createProject() {
	   ProjectsPage pp = new ProjectsPage(driver);
	   pp.chooseWs("new name");
	   pp.createProject();
	   pp.chooseProjectType("Personality Test");
	   pp.chooseProject("what animal are you?", "preview");
	}
	@Test
	public void tc02_startQuiz() {
		WhatAnimalAreYouPage waay = new WhatAnimalAreYouPage(driver);
		waay.startQuiz();
	}
	
	@Test
	public void tc03_answerQuiz() {
		WhatAnimalAreYouPage waay = new WhatAnimalAreYouPage(driver);
		waay.WhereWouldYouChooseToLive("volcano");
	}
	
	@Test
	public void tc04_answerQuiz() {
		WhatAnimalAreYouPage waay = new WhatAnimalAreYouPage(driver);
		waay.howFastAreYou("3");
	}
	
	@Test
	public void tc05_answerQuiz() {
		WhatAnimalAreYouPage waay = new WhatAnimalAreYouPage(driver);
		waay.favoriteElement("fire");	

	}
	
	@Test
	public void tc06_answerQuiz() {
		WhatAnimalAreYouPage waay = new WhatAnimalAreYouPage(driver);
		waay.WhereDoYouSeeYourselfIn10Years("on the moon");		

	}
//	@Test
//	public void tc07_addQuizToProject() {
//		WhatAnimalAreYouPage waay = new WhatAnimalAreYouPage(driver);
//		waay.addQuizToProject("animal test project33");
//		
//	}
}
