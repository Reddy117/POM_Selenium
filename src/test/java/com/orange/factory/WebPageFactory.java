package com.orange.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orange.pageobjects.LoginPage;

public class WebPageFactory implements BasePageFactory{
	private WebDriver driver;
	public WebPageFactory(WebDriver driver) {
		this.driver=driver;
	}
	public LoginPage getLoginPage() {
		
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
