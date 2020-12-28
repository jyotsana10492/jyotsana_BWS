package com.seleniumproject;

import java.util.concurrent.TimeUnit;

import javax.management.BadBinaryOpValueExpException;
import javax.security.auth.x500.X500Principal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class companyPage {
	

	


	public static void main(String[] args) throws Throwable {
		
	        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			
			String url="https:/test.subsource.com/login";
			String username="owner";
			String pwd="2551Woodland@";
		    String compname="BWS Software";
			String einno="23237878989";
			String address="Chandigarh";
			String address2="Mohali";
			String city="chd"; String zipcode="173001";
			String contactno="8989898939";
			String companyhrmail="abc@gmail.com";
			String payrollid="123";
			//company page
            companyPage cp=new companyPage();
			cp.launchBrowser(driver, url);
			cp.loginPage(driver, username, pwd);
			cp.companyAccoutSetting(driver);
			//cp.logOutPage(driver);
			//cp.companyDetails(driver, compname, einno, address,city,address2,zipcode,contactno,companyhrmail,payrollid);
			//cp.deleteFilledDetails (driver,compname);
			
			
			
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
		
		
		
		public void companyAccoutSetting(WebDriver driver) throws Throwable
		{
			Thread.sleep(5000);
		//click on the dd
		driver.findElement(By.xpath("//a[@class='sidebar-toggle']")).click();
		Thread.sleep(5000);
		//click on Preferences
		driver.findElement(By.xpath("//span[contains(text(),'Preferences')]")).click();
		Thread.sleep(5000);
		//click on Account setting
		driver.findElement(By.xpath("//a[contains(text(),'Account Settings')]")).click();
		//click on company  
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='company-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-ellipsis-v']")).click();
		Thread.sleep(5000);
      //  driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[contains(text(),'Import')]")).click();
        Thread.sleep(4000);
        //for selecting the Plus button 
       // driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-plus']")).click();
        //for the select button area
       
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\BWS-Tester\\Downloads\\Company.xlsx");
        driver.findElement(By.xpath("//span[contains(text(),'Upload')]")).click();
        System.out.print(driver.findElement(By.xpath("//span[@class = 'ui-growl-title']")).getText() + " :-  ");
        System.out.print(driver.findElement(By.xpath("//div[@class = 'ui-growl-message']/p")).getText());	
        
        
        
        
//        String value ="C:\\Users\\BWS-Tester\\Downloads\\Company.xlsx";
//		String expect=driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-plus']")).getAttribute(value);
//		
//		if(expect.equalsIgnoreCase("value")) 
//		{
//			
//			System.out.println("downloads successful");
//			
//			
//			
//		}
        
        
        
        
        
        
        
        
        
		}
      
     
		public void companyDetails(WebDriver driver, String compname,String einno,String address,String address2, String city ,String zipcode,String contactno,
				String companyhrmail,String payrollid) throws Throwable 
		{
			Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[formcontrolname = 'CompanyName']")).sendKeys(compname);

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class='ui-inputtext ui-corner-all ui-state-default ui-widget']")).sendKeys(einno); 
        Thread.sleep(5000);
        // for address1
        driver.findElement(By.cssSelector("input[formcontrolname = 'AddressLine1']")).sendKeys(address);
        // for address2
        driver.findElement(By.cssSelector("input[formcontrolname = 'AddressLine2']")).sendKeys(address2);
        // for  CITY 
        driver.findElement(By.cssSelector("input[formcontrolname = 'City']")).sendKeys(city);
        // for  ZIP CODE
        driver.findElement(By.cssSelector("input[formcontrolname = 'ZipCode']")).sendKeys(zipcode);
        
        // for CONTACTNUMBER
        driver.findElement(By.cssSelector("input[formcontrolname = 'ContactNo']")).sendKeys(contactno);
        //for companyhrmail
        driver.findElement(By.cssSelector("input[formcontrolname = 'CompanyHREmailID']")).sendKeys(companyhrmail);
        //for paurollid
        driver.findElement(By.cssSelector("input[formcontrolname ='PayrollID']")).sendKeys(payrollid);
        
        //for selecting state
        Select s = new Select(driver.findElement(By.cssSelector("select[formcontrolname = 'StateID']")));
        s.selectByVisibleText("Alaska");
       //click on save button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // For printing the successul uploading message
        System.out.print(driver.findElement(By.xpath("//span[@class = 'ui-growl-title']")).getText() + " :-  ");
        System.out.print(driver.findElement(By.xpath("//div[@class = 'ui-growl-message']/p")).getText());	
        

       
        
        

        		
		}
        
       
		public void deleteFilledDetails(WebDriver driver,String compname) throws Throwable
		{
			//click on delete button
			//driver.findElement(By.xpath("//a[contains(text(),'"+WebSoft+"')]/parent::div/following::td[6]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'"+compname+"')]/parent::div/following::td[6]")).click();
			
			//driver.findElement(By.xpath("//div[@class='content-wrapper']//table/tbody/tr[3]/td[7]/i")).click();
			Thread.sleep(5000);
			//click on yes button in pop up
		    driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-check']")).click();
		    System.out.println(driver.findElement(By.xpath("//span[@class = 'ui-growl-title']")).getText() + " :-  ");
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.xpath("//div[@class = 'ui-growl-message']/p")).getText());
			
	        
			
			
		}	
		
		
		
		
}
        
        
        
        
       
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
       
        
        
		
		
	
		
		
		
		
		
		
		
		
		
		
				
	
		
		
		
		
		


		
		
		
		
		
		
		
		

	


