package com.orange.webdriverutil;

import org.openqa.selenium.WebDriver;

import com.orange.base.BaseClass;
import com.orange.factory.BasePageFactory;

public class Page {

	public WebDriver driver;
	public WebDriverHelper webDriverHelper;
	BasePageFactory pageFactory;
	
	public Page() {
		if(driver==null) {
			driver=DriverManager.getDriver();
			webDriverHelper=new WebDriverHelper(driver);
			pageFactory=new BaseClass().getPageFactory();
		}
	}
}
