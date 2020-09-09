package com.testcases;

import java.io.IOException;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.LibraryClass;
import com.pages.LoginPage;
import com.reusableclass.SeleniumUtility;

public class LoginTestcase extends LibraryClass {
	LoginPage lpage;
	SeleniumUtility su;
	@BeforeTest
	public void stratUp() {
		browserSetUp();
		
	}

	@Test
	public void login() {
	 lpage=new LoginPage(driver);
		lpage.login("admin", "admin123");
		
	}
			
	@AfterTest
	public void close() throws IOException {
		 su = new SeleniumUtility(driver);
		su.to_take_screenshot("src/test/resources/ScreenShots/orangelogin.png");
		
		tearDown();
		
	}

}
