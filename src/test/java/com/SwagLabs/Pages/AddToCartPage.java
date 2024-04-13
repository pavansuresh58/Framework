package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage 
{
	
	private WebDriver driver;
	
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	private By rbtn=By.xpath("//button[text()='Remove']");
	private By cbtn=By.id("continue-shopping");
	private By chbtn=By.id("checkout");
	private By cart=By.id("shopping_cart_container");
	
	
	
	//methods
	public void getCartPage()
	{
		driver.findElement(cart).click();
		System.out.println("Cart page is open!");
	}
	
	public void doRemove()
	{
		driver.findElement(rbtn).click();
		System.out.println("Product removed From the Cart!");
	}
	
	public String doContinue()
	{
		driver.findElement(cbtn).click();
		System.out.println("It should navigate to Invetory page");
		String curl=driver.getCurrentUrl();
		
		return curl;
		
		
	}
	
	
	public String doCheckout()
	{
		driver.findElement(chbtn).click();
		return driver.getCurrentUrl();
		
	}
	
	
}