package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OverviewPageTEst extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	  System.out.println("Current url: "+op.getAppUrl());
  }
  
  
  @Test(priority=2)
  public void verifyProductDetails()
  {
	  op.getProductDetails();
  }
  
  
  @Test(priority=3)
  public void verifyCompleteProcess() 
  {
	  op.doFinish();
	  
	  
  }
}