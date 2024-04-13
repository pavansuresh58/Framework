package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

public class AddToCartPageTEst extends BaseClass
{
  @Test(priority=1)
  public void verifyCartPage()
  {
	  ap.getCartPage();
  }
  
  
  @Test(priority=2)
  public void validateRemoveProduct()
  {
	  ap.doRemove();
	  addPause();
  }
  
  @Test(priority=3)
  public void validateContinue()
  {
	  ap.doContinue();
	  addPause();
	  ip.addProductToCart("Sauce Labs Bolt T-Shirt");
	  addPause();
	  ap.getCartPage();
	  addPause();
  }
  
  
  @Test(priority=4)
  public void validateCheckout()
  {
	  ap.doCheckout();
  }
}