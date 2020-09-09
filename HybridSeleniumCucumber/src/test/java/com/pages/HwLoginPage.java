package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibraryClass;


	public class HwLoginPage extends LibraryClass{
		@FindBy(id="email")
		WebElement username;
		@FindBy(id="pass")
		WebElement pwd;
		@FindBy(name="login")
		WebElement Loginbutton;
		
		public HwLoginPage(WebDriver Driver) {
			this.driver= driver;
			PageFactory.initElements(driver,this);
		}
		public void login(String uname,String password) throws InterruptedException {
		username.sendKeys(uname);
		pwd.sendKeys(password); 
		Thread.sleep(1000);
		Loginbutton.click();
		Thread.sleep(2000);
	}
	}


