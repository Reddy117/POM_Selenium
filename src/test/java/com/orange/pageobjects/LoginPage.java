package com.orange.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orange.webdriverutil.Page;

public class LoginPage extends Page{

	WebDriver driver;
	@FindBy(id="txtUsername")
	WebElement userNameTxt;
	
	@FindBy(id="txtPassword")
	WebElement passWordTxt;
	
	@FindBy(xpath="//*[@id=\"btnLogin\"]")
	WebElement loginBtn;

	public void doLogin(String uName,String passWord) {
		try {
			userNameTxt.sendKeys(uName);
			passWordTxt.sendKeys(passWord);
			loginBtn.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
