package com.qa.shipment.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.shipment.base.TestBase;
import com.qa.shipment.util.TestUtil;

public class CustomerCorporatePage extends TestBase {

	// Page factory - OR:
	@FindBy(xpath = "//a[@class='logoarea']")
	WebElement logo;

	@FindBy(id = "SelectedCompanyId")
	WebElement CompanyName;

	@FindBy(className = "newsc")
	WebElement Continue;

	// Initializing the page object
	public CustomerCorporatePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String verifynvlogo() {
		return driver.getTitle();
	}

	public Dashboardpage companyselect(String value) throws Exception {
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Select os = new Select(CompanyName);
		os.selectByValue(value);
		Continue.click();
		return new Dashboardpage();
	}
}
