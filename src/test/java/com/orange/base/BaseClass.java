package com.orange.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;

import com.orange.factory.BasePageFactory;
import com.orange.factory.WebPageFactory;
import com.orange.webdriverutil.DriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public Robot r;
	private WebDriver driver;
	public BasePageFactory pageFactory;
	public Actions a;
	
	@BeforeMethod
	public void openApp(ITestContext txt) throws InterruptedException, AWTException {
		r=new Robot();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		DriverManager.setWebDriver(driver);
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		Thread.sleep(1000);
		a=new Actions(getDriver());
		
	}
	
	
	public BasePageFactory getPageFactory() {
		pageFactory=new WebPageFactory(driver);
		return pageFactory;
	}
	
	public static WebDriver getDriver() {
		return DriverManager.getDriver();
	}
	
	public void upLoadFile(String filePath) throws InterruptedException {
		StringSelection s=new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	public void selectDayFromCal(String calXpath,String dayToSelect) {
		
		WebElement cal=driver.findElement(By.xpath(calXpath));
		
		List<WebElement> trows=cal.findElements(By.tagName("tr"));
		for(int i=0;i<trows.size();i++) {
			List<WebElement> tcols=trows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<tcols.size();i++) {
				if(tcols.get(j).getText().equals(dayToSelect)) {
					tcols.get(j).click();
				}
			}
		}
	}
}
