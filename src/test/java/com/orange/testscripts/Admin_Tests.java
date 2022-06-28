package com.orange.testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.orange.base.BaseClass;

public class Admin_Tests extends BaseClass{
	

//	@Test(priority=1)
//	public void tc1_provideAdminRights() throws InterruptedException {
//
//		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
//		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//		Actions a=new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"))).perform();
//		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"))).perform();
//		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys("Jay Ray");
//		driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys("Jay RR");
//		driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]")).sendKeys("Anishrithwika@0821");
//		driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]")).sendKeys("Anishrithwika@0821");
//		driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
//		
//	}
//	
//	@Test(priority=2)
//	public void tc2_removeEmployeeFromAdmin() throws InterruptedException {
//		  
//		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
//		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//		Actions a=new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"))).perform();
//		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"))).perform();
//		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userName\"]")).sendKeys("Jay RR");
//		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
//		
//	}
//	
//	
}
