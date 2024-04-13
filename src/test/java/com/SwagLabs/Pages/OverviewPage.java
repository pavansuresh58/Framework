package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utilities.Utility;

public class OverviewPage
{
	
	private WebDriver driver;
	
	
	public  OverviewPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//locator
	private By getData=By.id("checkout_summary_container");
	private By fbtn=By.id("finish");
	
	private By msg=By.id("checkout_complete_container");
	//method
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void getProductDetails()
	{
		System.out.println("Final Product Details are:");
		Utility.getScreenshot(driver);
		System.out.println(driver.findElement(getData).getText());
	}
	
	public void doFinish()
	{
		driver.findElement(fbtn).click();
		Utility.getScreenshot(driver);
		System.out.println(driver.findElement(msg).getText());
		
	}
	
	
	
	

}