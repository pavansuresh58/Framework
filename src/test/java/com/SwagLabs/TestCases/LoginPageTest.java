package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl()
  {
	  String curl=lp.getAppURl();
	  Assert.assertTrue(curl.contains("demo"),"Url not match");
	  System.out.println("Url is matched!");
  }
  
  
  @Test(priority=2)
  public void verifyTitle()
  {
	  String atitle=lp.getAppTitle();
	  Assert.assertTrue(atitle.contains("Swag"),"Title is not matched");
	  System.out.println("Title is matched!");
  }
  
  
  
  @Test(priority=3)
  public void validationLogin()
  {
	  lp.doLogin("standard_user","secret_sauce");
	  Assert.assertTrue(lp.getAppURl().contains("inventory"),"Login Fail!");
	  System.out.println("Login Completed!");
	  
	  
  }
}