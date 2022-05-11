package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(how=How.XPATH, using="\r\n"
			+ "//input[@id=\"Username\"]") WebElement Username;
	@FindBy(how=How.XPATH, using="//input[@id='Password']") WebElement password;
	@FindBy(how=How.XPATH, using="//button[@id='button-submit']") WebElement submit;
	
	public LoginPage()
	{
	  PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public void validateCRMImage()
	{
		//return crmLogo.isDisplayed();
		
	}
	
	public HomePage login()
	{
		Username.sendKeys("bala40");
		password.sendKeys("Chennai@12345");
		submit.click();
		return new HomePage();
	}

}
