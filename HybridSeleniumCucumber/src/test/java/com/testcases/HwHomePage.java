package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.LibraryClass;
import com.pages.HwHomePage;
import com.pages.HwLoginPage;
import com.pages.LoginPage;
import com.reusableclass.SeleniumUtility;


	public class HwHomePage extends LibraryClass {
		
		HwHomePage hpage;
		
		@Test
		public void clickgrp() throws InterruptedException {
			hpage=new HwHomePage();
			hpage.clickgrp();
			
		}
		
//		@AfterTest
//		public void close() throws IOException {
////			 su = new SeleniumUtility(driver);
////			su.to_take_screenshot("src/test/resources/ScreenShots/orangelogin.png");
////			
//			tearDown();
//
//		}
		
		
			
		
	

	
}


