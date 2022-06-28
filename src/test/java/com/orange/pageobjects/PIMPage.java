package com.orange.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orange.webdriverutil.Page;

public class PIMPage extends Page {
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]")
	WebElement pimLink;
	
	@FindBy(xpath="//*[@id=\"btnAdd\"]")
	WebElement addbutton;
	
	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement firstNameTxt;
	
	@FindBy(xpath="//*[@id=\"lastName\"]")
	WebElement lastNameTxt;
	
	@FindBy(xpath="//*[@id=\"btnSave\"]")
	WebElement saveBtn;
	
//	public void addEmployee(String fName,String lName) {
//		try {
//			pimLink.click();
//			addbutton.click();
//			firstNameTxt.sendKeys(fName);
//			lastNameTxt.sendKeys(lName);
//			a.sendKeys(Keys.TAB).perform();
//			a.sendKeys(Keys.ENTER).perform();
//			Thread.sleep(2000);
//			upLoadFile("C:\\Framework\\OrangeHrm\\src\\main\\resources\\Images\\Mypic.jpg");
//			Thread.sleep(2000);
//			saveBtn.click();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
}
