package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibraryClass;

public class OrangeHrmPage extends LibraryClass{
	
	@FindBy(id="tab1")
	WebElement admintab;
	
	
	public OrangeHrmPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
}
	public void clickAdminTab() {
		admintab.click();
					
	}

}
