package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibraryClass;


	public class HwHomePage extends LibraryClass{
		@FindBy(xpath="//*[@id='mount_0_0\']/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[1]/ul/li[2]/div/a/div[1]/div[2]/div/div/div/div/span")
		WebElement group;
		
		
		public HwHomePage(WebDriver Driver) {
			this.driver= driver;
			PageFactory.initElements(driver,this);
		}
		public void clickGrps() throws InterruptedException {
			group.click();
		
		Thread.sleep(2000);
	}
	}


