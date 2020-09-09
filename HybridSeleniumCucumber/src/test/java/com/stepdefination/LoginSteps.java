package com.stepdefination;

import com.baseclass.LibraryClass;
import com.pages.LoginPage;
import com.reusableclass.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends LibraryClass{
	LoginPage lpage;
	SeleniumUtility su;
	@Given("to verify the title of the page")
	public void to_verify_the_title_of_the_page() {
		browserSetUp();
		su = new SeleniumUtility(driver);
		su.to_take_screenshot("src/test/resources/ScreenShots/orangelogin1.png");
		logger.info("Brower launch and screenshots taken");
	}

	
	@When("To enter {string} and {string}")
	public void to_enter_and(String username, String password) {
			 lpage=new LoginPage(driver);
				lpage.login(username, password); 
			 
				logger.info("Username and password entered");
		}   
	

	@Then("To click the submit button")
	public void to_click_the_submit_button() {
		
		
		tearDown();   
	}

}
