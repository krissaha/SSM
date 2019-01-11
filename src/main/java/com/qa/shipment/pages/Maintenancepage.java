package com.qa.shipment.pages;

import static org.testng.Assert.assertNotEqualsDeep;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.shipment.base.TestBase;
import com.qa.shipment.util.TestUtil;

public class Maintenancepage extends TestBase 
{
		// Page factory - OR:
	
		@FindBy(xpath = "//div[@class='dropdown slick-slide slick-active' and @data-slick-index='1']")
		WebElement click_create; // clicking on CREATE button on the top of the panel.

		@FindBy(xpath = "//div[@class='show-sidebar']")
		WebElement slider; // click the sliding bar

		@FindBy(id = "ShipmentNumber")
		WebElement shipmentno; // Capture the shipment number

		@FindBy(xpath = "//span[contains(text(), '- Select Branch -')]")
		WebElement branch_drop1; // click branch dropdown

		@FindBy(xpath = "//ul[@id='BranchKey_listbox']//child::li[3]")
		WebElement branch_drop2; // Branch data select 

		@FindBy(xpath = "//span[contains(text(), '- Select -')]")
		WebElement ShipmentType_drop1; // click ShipmentType dropdown 
		
		@FindBy(xpath = "//ul[@id='ShipmentType_listbox']//child::li[2]")
		WebElement ShipmentType_drop2; // select ShipmentType data 
		
		@FindBy(xpath = "//span[contains(text(), '- Select - ')]")
		WebElement RatingPreferences_drop1; // RatingPreferences select 
		
		@FindBy(xpath = "//ul[@id='RatingPreferences_listbox']//child::li[2]")
		WebElement RatingPreferences_drop2; // RatingPreferences select data
		
		@FindBy(xpath = "//div[@class='col-xs-7 col-md-7 padleftres']//span[contains(text(), '- Select -')]")
		WebElement ShipmentTerms_drop1; // ShipmentTerms_listbox click 
		
		@FindBy(xpath = "//ul[@id='ShipmentTerms_listbox']//child::li[2]")
		WebElement ShipmentTerms_drop2; // ShipmentTerms_listbox data click 
		
		@FindBy(xpath = "//a[contains(text(),'Add New Orgin/Destination')]")
		WebElement add;   // click on the add button  
		
		@FindBy(xpath = "//span[contains(text(),'Both')]")
		WebElement stop_Type;   // click on the Stop Type dropdown  
		
		@FindBy(xpath = "//ul[@id='ddlStopType_listbox']//child::li[2]")
		WebElement pickup;   // select pickup from the dropdown  
		
		@FindBy(xpath = "//a[@id='lookupLocationID']")
		WebElement Location_ID;   // click on the Location ID button
		
		@FindBy(xpath = "//div[@id='modalDialog']//span[contains(text(), '- Select -')]")
		WebElement country_dropdown;   // click on the country dropdown
		
		@FindBy(xpath = "//ul[@id='LocationCountry_listbox']//child::li[2]")
		WebElement select_country;   // select country 
		
		@FindBy(xpath = "//div[@id='modalDialog']//button[@id='btnLocationSearch']")
		WebElement search_btn;   // click on the search button 
		
		@FindBy(xpath = "//*[@id='Location']/div[3]/table/tbody/tr[1]/td[1]")
		WebElement location_select1;   // click location for selection
		
		@FindBy(xpath = "//div[@class='ui-dialog-buttonset']//button[@id='Select']")
		WebElement select_btn;   // click on the select button to get the search results
		
		@FindBy(xpath = "//*[@id='frmInnerGrid']/div/div/div[1]/div[1]/div/div[2]/span/span/span/span[1]")
		WebElement calender_1;   // click on the calender icon 
		
		@FindBy(xpath = "//div[@class='k-animation-container']//a[@class='k-link k-nav-today']")
		WebElement calender_2;   // click on the todays date
		
		@FindBy(xpath = "//a[@id='btnEdit' and @class='k-button k-button-icontext k-primary k-grid-update btnEdit']")
		WebElement update_btn;   // click on the update button 		
		
		@FindBy(xpath = "//ul[@id='ddlStopType_listbox']//child::li[3]")
		WebElement delivery;   // click on the delivery option
		
		@FindBy(xpath = "//div[@id='modalDialog']//input[@id='LocId']")
		WebElement locationID;   // send keys locationid
		
		@FindBy(xpath = "//*[@id='Location']/div[3]/table/tbody/tr[3]/td[1]/input")
		WebElement location_select2;   // select location from the location search 
		
		@FindBy(xpath = "//input[@id='ShipperRequestedDeliveryDate_2_2']")
		WebElement calender_3;   // sendkeys  to calender  
		
		@FindBy(xpath = "//div[@id='ShipmentProductGrid']//div[@class='k-header k-grid-toolbar k-grid-top']//a[contains(@class,'k-button k-button-icontext')]")
		WebElement product_btn;   // click on the product details 
		
		@FindBy(xpath = "//input[@name='txtProduct']")
		WebElement productCode;   // Send Keys for Product Code details 
		
		@FindBy(xpath = "//input[@name='txtProductDtlsID']")
		WebElement productDescription;   // Send Keys for Product Description 
		
		@FindBy(xpath = "//input[@id='Quantity']")
		WebElement quantity;   // Send Keys  quantity details
		
		@FindBy(xpath = "//span[contains(text(),'- Select -  ')]")
		WebElement UnitOfMeasure1;   // select drop down for Unit Of Measure		
		
		@FindBy(xpath = "//ul[@id='UnitMeasurelookup_listbox']//li[@class='k-item'][contains(text(),'Bag')]")
		WebElement UnitOfMeasure2;   // select bag from drop down 
		
		@FindBy(xpath = "//input[@id='Weight']")
		WebElement chargeableWeight;   // Send keys Chargeable Weight
		
		@FindBy(xpath = "//span[contains(text(),'- Select -  ')]")
		WebElement wum1;   // click the drop down 
		
		@FindBy(xpath = "//ul[@id='WeigthUomlookup_listbox']//child::li[2]")
		WebElement wum2;   // Select data from the drop down 
		
		@FindBy(xpath = "//input[@id='BillQty']")
		WebElement billqty;   // Send keys bill qty  

		@FindBy(xpath = "//input[@id='Length']")
		WebElement length;   // Send keys Length  
		
		@FindBy(xpath = "//input[@id='Width']")
		WebElement width;   // Send keys Width 
		
		@FindBy(xpath = "//input[@id='Height']")
		WebElement height;   // Send keys height
		
		@FindBy(xpath = "//span[contains(text(),'- Select -  ')]")
		WebElement dim1;   // Select dim dropdown 
		
		@FindBy(xpath = "//ul[@id='DimUomlookup_listbox']//child::li[2]")
		WebElement dim2;   // Select from the dropdown 
		
		@FindBy(linkText = "Update")
		WebElement update;   // click the update button 
		
		@FindBy(xpath = "//div[@class='dropdown slick-slide slick-active']//span[contains(text(),'Save')]")
		WebElement save;   // click the update button 
		
		//Success! Shipment Successfully Updated.
		@FindBy(xpath = "//div[@id='result_info']")
		WebElement el;   // capture the shipment number 
		
		@FindBy(xpath = "//div[@id='result_info']")
		WebElement el1;   // capture the shipment number 
		
		@FindBy(xpath = "//div[@id='divShipmentNumber']//input[@id='ShipmentNumber']")
		WebElement element;   // capture the shipment number 
		
		
		// Initializing the page objects
		public Maintenancepage() {
			PageFactory.initElements(driver, this);
		}
		
		public void createShipment(String lID, String cal, String pcode, String pdec, String quan, String cw, String bq, String l, String w, String h) throws Exception
		{
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,-2000)");
			branch_drop1.click();
			Thread.sleep(3000);
			branch_drop2.click();
			Thread.sleep(3000);
			ShipmentType_drop1.click();
			Thread.sleep(3000);
			ShipmentType_drop2.click();
			Thread.sleep(1000);
			RatingPreferences_drop1.click();
			Thread.sleep(3000);
			RatingPreferences_drop2.click();
			ShipmentTerms_drop1.click();
			Thread.sleep(3000);
			ShipmentTerms_drop2.click();
			Thread.sleep(1000);
			add.click();
			
		// Add Origin details
			stop_Type.click();
			Thread.sleep(3000);
			pickup.click();
			Thread.sleep(3000);
			Location_ID.click();
			Thread.sleep(3000);
			
		// Select details from the child window 				
			country_dropdown.click();
			Thread.sleep(3000);
			select_country.click();
			Thread.sleep(3000);
			search_btn.click();
			Thread.sleep(10000);
			location_select1.click();
			Thread.sleep(3000);
			select_btn.click();
			Thread.sleep(3000);
			calender_1.click();
			Thread.sleep(3000);
			calender_2.click();
			Thread.sleep(3000);
			update_btn.click();
			Thread.sleep(3000);
			add.click();
			Thread.sleep(3000);
			
		// Add Destination details	
			stop_Type.click();
			delivery.click();
			Location_ID.click();
			Thread.sleep(3000);
			
		// Select details from the child window 				
			locationID.sendKeys(lID);
			Thread.sleep(5000);
			search_btn.click();
			Thread.sleep(10000);
			location_select2.click();
			select_btn.click();
			Thread.sleep(3000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,200)");
			calender_3.sendKeys(cal);
			Thread.sleep(3000);
			update_btn.click();
			Thread.sleep(7000);	
			
		// Add New Product Details
			product_btn.click();
			Thread.sleep(3000);
			productCode.sendKeys(pcode);
			productDescription.sendKeys(pdec);
			quantity.sendKeys(quan);
			UnitOfMeasure1.click();
			Thread.sleep(3000);
			UnitOfMeasure2.click();
			Thread.sleep(3000);
			chargeableWeight.sendKeys(cw);
			wum1.click();
			Thread.sleep(3000);
			wum2.click();
			billqty.sendKeys(bq);
			length.sendKeys(l);
			width.sendKeys(w);
			height.sendKeys(h);
			dim1.click();
			Thread.sleep(3000);
			dim2.click();
			Thread.sleep(3000);
			update.click();
			Thread.sleep(3000);
			save.click();
			Thread.sleep(5000);
			// Switching to Alert        
	        Alert alert = driver.switchTo().alert();	
	        alert.accept();
	        Thread.sleep(10000);
			
	        boolean b1 = driver.findElement(By.xpath("//div[@id='result_info']")).isDisplayed();
	        if(b1 == true)
	        {
	        	WebElement el = driver.findElement(By.xpath("//div[@id='result_info']"));
	        	System.out.println(el.getText());
	        	try{
	                List<WebElement> elements = driver.findElements(By.xpath("//div[@id='divShipmentNumber']//input[@id='ShipmentNumber']"));
	                for(WebElement ele : elements){
	                    System.out.println("------------------------------------------------------------");
	                    System.out.println("Shipment number = " + ele.getAttribute("value"));
	                    System.out.println("------------------------------------------------------------");
	                }}finally{}
	        }
	        else{
	        	System.out.println("Shipment number not displayed");
	        }
			
						
			
		}
		
				
}
