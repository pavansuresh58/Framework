package com.SWAGLAB.TESTCASES;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.SWAGLAB.PAGES.*;

public class BASECLASS
{
	public WebDriver driver;
	public LOGINPAGE1 lp;
	
	@BeforeTest
	public void setUpBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		lp=new LOGINPAGE1(driver);
		
	}

}
