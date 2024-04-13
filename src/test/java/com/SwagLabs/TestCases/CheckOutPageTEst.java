package com.SwagLabs.TestCases;

import org.testng.annotations.Test;

public class CheckOutPageTEst extends BaseClass
{
  @Test
  public void validateContinueProcess() 
  {
	  cp.doContinue("Priyanka","Nigade","411047");
  }
}