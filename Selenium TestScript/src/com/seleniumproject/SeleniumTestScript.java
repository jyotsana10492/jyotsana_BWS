package com.seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTestScript {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		String url="https:/test.subsource.com/login";
		String username="owner";
		String pwd="2551Woodland@";

		SeleniumTestScript sc=new SeleniumTestScript();
		sc.launchBrowser(driver, url);
		sc.loginPage(driver, username, pwd);
		sc.logOutPage(driver);
		
		
		

	}
	
	public void launchBrowser(WebDriver driver,String url)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.get(url);
		
		
	}

	public void loginPage(WebDriver driver,String username,String pwd)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
	public void logOutPage(WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='user-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='navbar-custom-menu']/ul/li[4]/ul/li[3]/a")).click();
		driver.close();
		
	}

	
	
}






	








































