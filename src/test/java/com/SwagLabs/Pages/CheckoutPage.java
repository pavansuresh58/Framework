package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utilities.Utility;

public class CheckoutPage
{

	private WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//locator
	private By firstn=By.id("first-name");
	private By lastn=By.id("last-name");
	private By zcode=By.id("postal-code");
	private By cbtn=By.id("continue");
	
	
	
	//method
	public void doContinue(String fn,String ln,String zc)
	{
		driver.findElement(firstn).sendKeys(fn);
		driver.findElement(lastn).sendKeys(ln);
		driver.findElement(zcode).sendKeys(zc);
		Utility.getScreenshot(driver);
		driver.findElement(cbtn).click();
	}
	
	
	
	
	
	
	
	
	
}