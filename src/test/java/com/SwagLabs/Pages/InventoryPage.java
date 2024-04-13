package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage
{
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	//locators
	private By productOptions=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	private By productName=By.xpath("//div[@class='inventory_list']//div//div[@class='inventory_item_name ']");
	private By addToCartbtn=By.xpath("//button[text()='Add to cart']");
	
	
	//methods
	public int getProductsCount()
	{
		int count=driver.findElements(productOptions).size();
		return count;
	}
	
	
	public void getProductsName()
	{
		List<WebElement> list=driver.findElements(productName);
		System.out.println("******Product Names are***********");
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		
		
	}
	
	
	public void addProductToCart(String pname)
	{
		List<WebElement> list=driver.findElements(productName);
		
		for(WebElement i:list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		
		//click on button
		driver.findElement(addToCartbtn).click();
		System.out.println("Product "+pname+" is added to the cart");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}