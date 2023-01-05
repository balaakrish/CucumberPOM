package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver; 
	public static Properties prop; 
	
	public TestBase()
	{

		{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\balachandar.k\\eclipse-workspace\\CucumberMavenPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		}
		catch (IOException e)
		{
			e.getMessage();
		}
		}
	
	public static void initialization()
	{
		
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		driver = new ChromeDriver();
		//To maximize browser
		                driver.manage().window().maximize();
		                driver.get("https://3mocc-sl3-qa.ocsd.3m.com/");
		/*
		 * String browserName = prop.getProperty("browser");
		 
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url")); */
		}
		
}
