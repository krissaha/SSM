package com.qa.shipment.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.shipment.base.TestBase;
import com.qa.shipment.util.TestUtil;

public class Searchpage extends TestBase {

	// Page factory - OR:
	@FindBy(xpath = "//div[@class='dropdown slick-slide slick-active' and @data-slick-index='0']")
	WebElement click_search; // clicking on SEARCH button on the top of the panel.

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]")
	WebElement selectitem1; // click the first item from the search list

	@FindBy(xpath = "//div[@class='dropdown slick-slide slick-active' and @data-slick-index='2']")
	WebElement click_edit; // click on EDIT button from the top of the panel

	@FindBy(xpath = "//input[@id='CreatedDateFrom']")
	WebElement clear_date1; // clear DATE from fields

	@FindBy(xpath = "//input[@id='CreatedDateTo']")
	WebElement clear_date2; // clear DATE to fields

	@FindBy(xpath = "//textarea[@id='ShipmentNo']")
	WebElement shipmentnumber; // Enter Text in Shipment number

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")
	WebElement selectitem2; // Select the check box

	// Initializing the page objects
	public Searchpage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void verifysearchpagetitle() {
		String s = "Search";
		Assert.assertEquals(s, driver.getTitle());
	}

	public Maintenancepage globalShipmentSearch() throws Exception {
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		click_search.click();
		Thread.sleep(7000);
		selectitem1.click();
		Thread.sleep(5000);
		click_edit.click();
		Thread.sleep(5000);
		return new Maintenancepage();
	}
	
	public Maintenancepage shipmentnumberSearch(String shpnumber) throws Exception
	{
		clear_date1.clear();
		clear_date2.clear();
		shipmentnumber.sendKeys(shpnumber);
		click_search.click();
		Thread.sleep(2000);
		selectitem2.click();
		click_edit.click();
		Thread.sleep(5000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(7000);
		return new Maintenancepage();
	}
}
