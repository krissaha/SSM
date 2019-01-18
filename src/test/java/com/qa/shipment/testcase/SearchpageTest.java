package com.qa.shipment.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.shipment.base.TestBase;
import com.qa.shipment.pages.CustomerCorporatePage;
import com.qa.shipment.pages.Dashboardpage;
import com.qa.shipment.pages.Loginpage;
import com.qa.shipment.pages.Maintenancepage;
import com.qa.shipment.pages.Searchpage;
import com.qa.shipment.util.CustomListener;

@Listeners(CustomListener.class)
public class SearchpageTest extends TestBase {
	
	Loginpage lp;
	CustomerCorporatePage ccp;
	Dashboardpage db;
	Searchpage sp;
	Maintenancepage mp;

	public SearchpageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws Exception {
		init();
		lp = new Loginpage();
		ccp = lp.login(prop.getProperty("Email"), prop.getProperty("Password"));
		db = ccp.companyselect(prop.getProperty("CompyValue"));
		db.verifydashboardtitle();
		sp = db.selectshipment();
	}

	@Test(enabled = true)
	public void globalSearch() throws Exception {
		sp.verifysearchpagetitle();
		mp = sp.globalShipmentSearch();

	}

	@Test(enabled = true)
	public void shipmentnumberSearch() throws Exception {
		sp.verifysearchpagetitle();
		mp = sp.shipmentnumberSearch(prop.getProperty("ShipmentNumber"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
