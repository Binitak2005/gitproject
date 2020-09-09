package com.testcases;

import java.io.IOException;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.LibraryClass;
import com.pages.LoginPage;
import com.pages.OrangeHrmPage;
import com.reusableclass.SeleniumUtility;

public class OrangeTestCase extends LibraryClass {
	OrangeHrmPage opage;
	SeleniumUtility su;
	@BeforeTest
	public void stratUp() {
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	@Test
	public void ClickAdminTab() {
	 opage=new OrangeHrmPage(driver);
		opage.clickAdminTab();
		
	}
			
	@AfterTest
	public void close() throws IOException {
		 su = new SeleniumUtility(driver);
		su.to_take_screenshot("src/test/resources/ScreenShots/orangelogin.png");
		
		tearDown();
		
	}

}
