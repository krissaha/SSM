package com.qa.shipment.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.shipment.base.TestBase;
import com.qa.shipment.pages.CustomerCorporatePage;
import com.qa.shipment.pages.Dashboardpage;
import com.qa.shipment.pages.Loginpage;
import com.qa.shipment.pages.Maintenancepage;
import com.qa.shipment.pages.Searchpage;

public class MaintenancepageTest extends TestBase{
	
	Loginpage lp;
	CustomerCorporatePage ccp;
	Dashboardpage db;
	Searchpage sp;
	Maintenancepage mp;
	
	public MaintenancepageTest() {
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
		mp = sp.clickCreate();
		
	}
	
	@Test(enabled = true)
	public void shipmentCreation() throws Exception {
		mp.createShipment(prop.getProperty("LocationID"), prop.getProperty("DeleveryDate"),prop.getProperty("Productcode"),
				prop.getProperty("Productdescription"), prop.getProperty("Quantity"),prop.getProperty("ChargeableWeight"), prop.getProperty("Billqty"),prop.getProperty("Length"),prop.getProperty("Width"),prop.getProperty("Height"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
