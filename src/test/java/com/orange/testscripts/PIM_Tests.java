package com.orange.testscripts;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.orange.pageobjects.LoginPage;

public class PIM_Tests {
	

	@Test(priority=1)
	public void addEmployeeFromPIM() throws IOException, InterruptedException, AWTException {
		

		LoginPage lp=getPageFactory().
		//PIMPage pp=new PIMPage(driver);
		
		lp.doLogin("Admin", "admin123");
		//pp.addEmployee("Nara","Reddy");
	}
//	
//	//@Test(priority=2)
//	public void deleteEmployeeFromPIM() throws InterruptedException {
//
//		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
//		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
//	}
}
