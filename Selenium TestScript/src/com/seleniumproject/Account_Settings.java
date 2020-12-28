package com.seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account_Settings {
public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test.subsource.com/login");
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("owner");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("2551Woodland@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'ACA Settings')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='sidebar-toggle']")).click();
		Thread.sleep(5000);
		//click on Preferences
		driver.findElement(By.xpath("//span[contains(text(),'Preferences')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ACA Settings')]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//select[@class='slectBoxColm form-control ng-pristine ng-valid ng-touched']")).click();
		
		//driver.findElement(By.xpath("//select[@class='slectBoxIntlMemnt form-control ng-pristine ng-valid ng-touched']")).click();
		
		  Select s = new Select(driver.findElement(By.xpath("//select[@class='slectBoxColm form-control ng-pristine ng-valid ng-touched']")));
		
		// Select s = new Select(driver.findElement(By.xpath("/html/body/app-root/admin-root/div/div/ng-component/div/div/div[2]/div/div[1]/div[1]/ul/li[1]/div/select")));
		  Thread.sleep(5000);
		 // s.selectByVisibleText("");
		 // s.selectByValue("2");
		  s.selectByIndex(0);
		  
		  
		
		
}
}