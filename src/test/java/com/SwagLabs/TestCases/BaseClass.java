package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLabs.Pages.*;
import com.SwagLabs.Utilities.*;

public class BaseClass 
{
	
	public WebDriver driver;
	public LoginPage  lp;
	public InventoryPage ip;
	public AddToCartPage ap;
	public CheckoutPage cp;
	public OverviewPage op;
	public PropertiesRead ps;
	
	@BeforeTest
	public void AppSetUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		ps=new PropertiesRead("TestData//Config");
		
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		ap=new AddToCartPage(driver);
		cp=new CheckoutPage(driver);
		op=new OverviewPage(driver);
		
		
		
		
	}
	
	
	
	
	@BeforeClass
	public void pageSetUp()
	{
		System.out.println("***********Login***************");
		System.out.println("Application url: "+lp.getAppURl() );
		System.out.println("Application title:"+lp.getAppTitle());
		lp.doLogin(ps.getData("un"),ps.getData("psw"));
		Utility.getScreenshot(driver);
		addPause();
		System.out.println("***********Inventory**************");
		System.out.println("Total Products are:"+ip.getProductsCount());
		ip.getProductsName();
		Utility.getScreenshot(driver);
		addPause();
		ip.addProductToCart(ps.getData("pname1"));
		Utility.getScreenshot(driver);
		addPause();
		System.out.println("***********Cart Page**************");
		ap.getCartPage();
		addPause();
		ap.doRemove();
		Utility.getScreenshot(driver);
		addPause();
		ap.doContinue();
		Utility.getScreenshot(driver);
		addPause();
		ip.addProductToCart(ps.getData("pname2"));
		ap.getCartPage();
		addPause();
		ap.doCheckout();
		System.out.println("***********Checkout Page**************");
		cp.doContinue(ps.getData("fn"),ps.getData("ln"),ps.getData("zc"));
		
		System.out.println("***********Overview Page**************");

		
	}
	
	
	public void addPause()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}