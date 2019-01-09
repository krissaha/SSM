package com.qa.shipment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.shipment.base.TestBase;

public class Loginpage extends TestBase {

	// Page factory - OR:
	@FindBy(name = "Email")
	WebElement email;
	@FindBy(name = "Password")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	// Initializing the page object
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateloginpage() {
		return driver.getTitle();
	}

	public CustomerCorporatePage login(String em, String psd) {
		email.sendKeys(em);
		password.sendKeys(psd);
		String hiddenCaptchaVal = driver.findElement(By.id("HiddenCaptcha")).getAttribute("value");
		driver.findElement(By.id("Captcha")).sendKeys(hiddenCaptchaVal);
		loginBtn.click();
		return new CustomerCorporatePage();

	}

}
