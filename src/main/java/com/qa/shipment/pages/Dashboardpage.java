package com.qa.shipment.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.shipment.base.TestBase;
import com.qa.shipment.util.TestUtil;

public class Dashboardpage extends TestBase {

	// Page factory - OR:
	@FindBy(xpath = "//span[contains(text(),'Shipment')]")
	WebElement shipment;

	// Initializing the page object
	public Dashboardpage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void verifydashboardtitle() {
		String s = "Dashboard";
		Assert.assertEquals(s,driver.getTitle());
	}

	public Searchpage selectshipment() throws Exception {
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(3000);
		shipment.click();
		return new Searchpage();
	}
}