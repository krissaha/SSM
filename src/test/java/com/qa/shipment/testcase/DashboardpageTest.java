package com.qa.shipment.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.shipment.base.TestBase;
import com.qa.shipment.pages.CustomerCorporatePage;
import com.qa.shipment.pages.Dashboardpage;
import com.qa.shipment.pages.Loginpage;
import com.qa.shipment.pages.Searchpage;

public class DashboardpageTest extends TestBase {

	Loginpage lp;
	CustomerCorporatePage ccp;
	Dashboardpage db;
	Searchpage sp;

	public DashboardpageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws Exception {
		init();
		lp = new Loginpage();
		ccp = lp.login(prop.getProperty("Email"), prop.getProperty("Password"));
		db = ccp.companyselect(prop.getProperty("CompyValue"));
	}

	@Test()
	public void companyselection() throws Exception {
		db.verifydashboardtitle();
		sp = db.selectshipment();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
