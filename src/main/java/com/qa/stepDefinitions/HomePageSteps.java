package com.qa.stepDefinitions;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePageSteps extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("user opens browser")
	public void user_opens_browser() {
	    TestBase.initialization();
	    
	}
	@Then("user is on login page")
	public void user_is_on_login_page() {
		loginPage = new LoginPage();
		String title = loginPage.validateLoginPageTitle();
		//Assert.assertEquals(false, false);
	    	    
	}
	@Then("user logs into app")
	public void user_enters_username_and_password() {
		homePage=loginPage.login();	
	    
	    	}
	
	@Then("home page is displayed")
	public void home_page_is_displayed() {
	    
	    homePage.verifyHomePageTitle();
	}
	@Then("validate logged in user name")
	public void validate_logged_in_user_name() {
	    
		boolean flag = homePage.verifyCorrectUSerName();
	    
	}



}
