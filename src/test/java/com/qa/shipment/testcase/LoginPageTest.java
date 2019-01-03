package com.qa.shipment.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.shipment.base.TestBase;

public class LoginPageTest extends TestBase 
{
	
	public LoginPageTest() 
	{
	super();
	}
	
	@BeforeMethod
	public void setup()
	{
		init();
	}
	
	@Test
	public static void validateURL()
	{
		
	}
	
	@AfterMethod
	public static void teardown()
	{
		driver.quit();
	}

}
