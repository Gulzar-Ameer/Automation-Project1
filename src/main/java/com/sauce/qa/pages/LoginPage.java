package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="user-name")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(css="input.submit-button")
	WebElement LoginBtn;
	
	@FindBy(css="span.title")
	WebElement product;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean Login(String user, String pwd) {
		Username.sendKeys(user);
		Password.sendKeys(pwd);
		LoginBtn.click();
		return product.isDisplayed();
	}
	

}
