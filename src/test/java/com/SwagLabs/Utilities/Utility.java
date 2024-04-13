package com.SwagLabs.Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	//screenshot
	public static void getScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File(System.getProperty("user.dir")+"//Screenshots//SwagLabs"+System.currentTimeMillis()+".png");
		  try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	//Explicit wait
	public static WebElement waitForPresenceEle(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));	
		
	}
	
	public static WebElement waitForVisibilityEle(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));	
		
	}
	
	public static WebElement waitForElementToClick(WebDriver driver,By loc)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.elementToBeClickable(loc));	
		
	}
	
	public static boolean waitForTitle(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.titleContains(title));	
		
	}
	
	public static boolean waitForUrl(WebDriver driver,String url)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.urlContains(url));	
		
	}
	
	
	
	
	
	//drop down
	public static void selectBasedDropdown(WebElement dele,String value)
	{
		Select dd=new Select(dele);
		System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
		
		List<WebElement> allopt=dd.getOptions();
		System.out.println("Total options are: "+allopt.size());
		
		
		for(WebElement i:allopt)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
			
		}
	}
}