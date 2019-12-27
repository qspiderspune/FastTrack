package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static {
System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");		
	}
public WebDriver driver;

@BeforeTest
public void openBrowser() {
	driver=new ChromeDriver();
}
	@BeforeMethod
	public void login(){
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/");
	}
	@AfterMethod
	public void logout() {
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}                     
}
