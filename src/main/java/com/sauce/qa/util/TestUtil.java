package com.sauce.qa.util;

import com.sauce.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT =20;
	public static long PAGE_IMPLICIT_WAIT = 10;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel"); 
		
	}
}

