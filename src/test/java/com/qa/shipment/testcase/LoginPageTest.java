package com.qa.shipment.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.shipment.base.TestBase;
import com.qa.shipment.pages.CustomerCorporatePage;
import com.qa.shipment.pages.Loginpage;

public class LoginPageTest extends TestBase {
	Loginpage lp;
	CustomerCorporatePage ccp;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		init();
		lp = new Loginpage();
	}

	@Test(priority = 2)
	public void validateTitle() {
		String title = lp.validateloginpage();
		Assert.assertEquals(title, "Login");
	}

	@Test(priority = 1)
	public void loginCredential() {
		ccp = lp.login(prop.getProperty("Email"), prop.getProperty("Password"));
	}

	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}

}
