package com.qa.shipment.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.shipment.base.TestBase;
import com.qa.shipment.pages.CustomerCorporatePage;
import com.qa.shipment.pages.Dashboardpage;
import com.qa.shipment.pages.Loginpage;
import com.qa.shipment.pages.Searchpage;

public class CustomerCorporatePageTest extends TestBase {
	Loginpage lp;
	CustomerCorporatePage ccp;
	Dashboardpage db;
	

	public CustomerCorporatePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		init();
		lp = new Loginpage();
		ccp = lp.login(prop.getProperty("Email"), prop.getProperty("Password"));
	}
	
	@Test(priority = 1)
	public void companyselection() throws Exception {
		db = ccp.companyselect(prop.getProperty("CompyValue"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
