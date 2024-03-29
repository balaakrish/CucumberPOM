package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;
//Home Page class
public class HomePage extends TestBase{
	
@FindBy(xpath="//td[contains(text(),'User: Naveen K')]")
@CacheLookup
WebElement userNameLabell; 

@FindBy(xpath="//a[contains(text(), 'Contacts')]")
WebElement contactsLink; 

@FindBy(xpath="//a[contains(text(),'New Contact')]")
WebElement newContactLink;

@FindBy(xpath="//a[contains(text(),'Deals')]")
WebElement dealsLink;

@FindBy(xpath="//a[contains(text(), 'Tasks')]")
WebElement tasksLink;

public HomePage()
{
	PageFactory.initElements(driver, this);
}

public String verifyHomePageTitle()
{
	return driver.getTitle();
}

public boolean verifyCorrectUSerName()
{
	return userNameLabell.isDisplayed();
	
}

public void clickOnNewContactLink()
{
	Actions action = new Actions(driver);
	action.moveToElement(contactsLink).build().perform();
	newContactLink.click();
			
}

}


