package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass {
  @Test(priority=1)
  public void verifyProductCount()
  {
	  int count=ip.getProductsCount();
	  Assert.assertEquals(count,6,"Product count not matched!");
	  System.out.println("Total Products are: "+count);
  }
  
  
  
  @Test(priority=2)
  public void verifyProductNames()
  {
	  ip.getProductsName();
  }
  
  
  
  @Test(priority=3)
  public void validateAddToCart()
  {
	  ip.addProductToCart("Sauce Labs Fleece Jacket");
  }
}