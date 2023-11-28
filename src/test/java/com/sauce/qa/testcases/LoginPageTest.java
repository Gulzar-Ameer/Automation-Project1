package com.sauce.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.TestBase;
import com.sauce.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void validateLogin() {
		boolean flag = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void validateTitle() {
		String check = loginPage.getTitle();
		Assert.assertEquals(check, "Swag Labs");
	}
	
	@AfterMethod
	public void finishLine() {
		driver.close();
	}
	
	

}
