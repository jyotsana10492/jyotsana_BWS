package com.seleniumproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class shopPage {

	public static void main(String[] args) throws Throwable {
		
		
		
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			
			String url="https:/test.subsource.com/login";
			String username="owner";
			String pwd="2551Woodland@";
			String shpname="105";
			String emailid="abd@gmail.com";
			String address="Chandigarh";
			String address2="Mohali";
			String city="chd";
			String zipcode="17001";
			String rent="1000";
			String cost="7000";
			String st1="abb@gmail.com";String st2="dhg@gmail.com";String st3="fff@gmail.com"; String st4="ddd@gmail.com"; String st5="qqq@gmail.com"; String st6="zzz@gmail.com";     
			
			
			
			shopPage shp=new shopPage();
			shp.launchBrowser(driver, url);
			shp.loginPage(driver, username, pwd);
			shp.shopPageVerify(driver);
		    shp.shopDetails(driver,shpname,emailid,address,address2,city,zipcode,rent,cost);
		    shp.dateEnding1(driver);
		    shp.tabFunForEndingDate(driver);
		    //shp.datePicker(driver);
			shp.mappingDetails(driver);
			shp.notificationDetails(driver,st1,st2,st3,st4,st5,st6);
			shp. DeleteShopPage(driver,shpname); 
			shp.closeMethod(driver);
			
	}



	private String shpname;
		
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
	public void shopPageVerify(WebDriver driver) throws Throwable
	{   Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@class='sidebar-toggle']")).click();
		Thread.sleep(5000);
		//click on Preferences
		driver.findElement(By.xpath("//span[contains(text(),'Preferences')]")).click();
		Thread.sleep(3000);
		//click on Account setting
		driver.findElement(By.xpath("//a[contains(text(),'Account Settings')]")).click();
		Thread.sleep(3000);
		//click on Shop button
		driver.findElement(By.xpath("//img[@alt='shops-icon']")).click();
		Thread.sleep(3000);
		//click on the three drops button
		driver.findElement(By.xpath("//i[@class='fa fa-ellipsis-v']")).click();
		//click on the add new 
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Add New')]")).click();
       // driver.findElement(By.xpath(formcontrolname="DisplayStoreNumber))
		
	
	}
	
	public void shopDetails(WebDriver driver, String shpname,String emailid,String address,String address2, String city,String zipcode,String rent,String cost) throws Throwable
	{
		
    
    driver.findElement(By.cssSelector("input[formcontrolname = 'DisplayStoreNumber']")).sendKeys(shpname);
   
    driver.findElement(By.cssSelector("input[formcontrolname = 'EmailID']")).sendKeys(emailid);
    Thread.sleep(5000);
    //for selecting regionId 
    Select s = new Select(driver.findElement(By.cssSelector("select[formcontrolname ='RegionID']")));
    s.selectByVisibleText("Hotel");
    //for toggling
    Thread.sleep(5000);
    driver.findElement(By.cssSelector("input[formcontrolname = 'DisplayStoreNumber']"));
    driver.findElement(By.xpath("//div[@class = 'container-fluid']/div/div[2]/form/div/div/div[1]/div[2]/div[4]/div/p-inputswitch/div/span")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class = 'container-fluid']/div/div[2]/form/div/div/div[1]/div[2]/div[5]/div/p-inputswitch/div/span")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class = 'container-fluid']/div/div[2]/form/div/div/div[1]/div[2]/div[6]/div/p-inputswitch/div/span")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class = 'container-fluid']/div/div[2]/form/div/div/div[1]/div[2]/div[7]/div/p-inputswitch/div/span")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class = 'container-fluid']/div/div[2]/form/div/div/div[1]/div[2]/div[8]/div/p-inputswitch/div/span")).click();
    Thread.sleep(5000);
  
   driver.findElement(By.cssSelector("input[formcontrolname = 'AddressLine1']")).sendKeys(address);
   // for address2
   driver.findElement(By.cssSelector("input[formcontrolname = 'AddressLine2']")).sendKeys(address2);
   // for  CITY 
   driver.findElement(By.cssSelector("input[formcontrolname = 'City']")).sendKeys(city);
   Thread.sleep(5000);
   //for selecting state
   Select s1= new Select(driver.findElement(By.cssSelector("select[formcontrolname = 'StateID']")));
   s1.selectByVisibleText("Alaska");
   // for zip code
   Thread.sleep(5000);
   driver.findElement(By.cssSelector("input[formcontrolname = 'ZipCode']")).sendKeys(zipcode);
   Thread.sleep(5000);
   
   //for cost purposes
   driver.findElement(By.cssSelector("input[formcontrolname = 'RentRoyality']")).sendKeys(rent);
   Thread.sleep(5000);
   driver.findElement(By.cssSelector("input[formcontrolname = 'Cost']")).sendKeys(cost);
 
	}
  
	
	public void mappingDetails(WebDriver driver) throws Throwable {
  //for selecting food code distributer
   Thread.sleep(5000);
  Select s2= new Select(driver.findElement(By.cssSelector("select[formcontrolname = 'DistributorID']")));
  s2.selectByVisibleText("ADP");
  Thread.sleep(6000);
  Select s3= new Select(driver.findElement(By.cssSelector("select[formcontrolname = 'CompanyID']")));
  s3.selectByVisibleText("CR SUBWAY LLC");
  
	}
   
  
   
    
	public void notificationDetails(WebDriver driver,String st1,String st2,String st3,String st4,String st5,String st6) throws Throwable {
    
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//div[@class='container-fluid']/div/div[2]/form/div/div/div[1]/div[10]/div[1]/div/div/tag-input/div/div/tag-input-form/form/input")).sendKeys(st1);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@class='container-fluid']/div/div[2]/form/div/div/div[1]/div[10]/div[2]/div/div/tag-input/div/div/tag-input-form/form/input")).sendKeys(st2);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@class='container-fluid']/div/div[2]/form/div/div/div[1]/div[10]/div[3]/div/div/tag-input/div/div/tag-input-form/form/input")).sendKeys(st3);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@class='container-fluid']/div/div[2]/form/div/div/div[1]/div[10]/div[4]/div/div/tag-input/div/div/tag-input-form/form/input")).sendKeys(st4);
		driver.findElement(By.xpath("//div[@class='container-fluid']/div/div[2]/form/div/div/div[1]/div[10]/div[5]/div/div/tag-input/div/div/tag-input-form/form/input")).sendKeys(st5);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//div[@class='container-fluid']/div/div[2]/form/div/div/div[1]/div[10]/div[6]/div/div/tag-input/div/div/tag-input-form/form/input")).sendKeys(st6);
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
		//for printing the error message
		 System.out.print(driver.findElement(By.xpath("//span[@class = 'ui-growl-title']")).getText() + " :-  ");
	     System.out.println((driver.findElement(By.xpath("//div[@class = 'ui-growl-message']/p")).getText()));
	     
	}
	
     
	 
	
	  public void dateEnding1(WebDriver driver) throws InterruptedException
	     
	     
	     {
	    	 WebElement date = driver.findElement(By.cssSelector("input[formcontrolname = 'Cost']"));
		     Actions a = new Actions(driver);
		     a.moveToElement(date).sendKeys(Keys.TAB).build().perform();
		     driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[1]")).click();
	    	 Thread.sleep(5000);
	    	 //div[@class='datepicker-days']/table/tbody/tr[4]/td[6]
	    	 List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='table-condensed']/tbody/tr/td"));
	    	 for(WebElement ele:allDates)
				{
					
					String date1=ele.getText();
					
		                        // once date is 28 then click and break
					if(date1.equalsIgnoreCase("28"))
					{
						ele.click();
						break;
					}
					
				}
				
				
			}

	    	
	  public void tabFunForEndingDate(WebDriver driver) throws InterruptedException {
	    	 
		  WebElement date1 = driver.findElement(By.cssSelector("input[formcontrolname = 'Cost']"));
	        date1.click();
	        Actions a1 = new Actions(driver);
	        a1.moveToElement(date1).sendKeys(Keys.TAB,Keys.TAB).build().perform();
	        Thread.sleep(2000);
	        //driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[1]")).click();
	        driver.findElement(By.xpath("/html/body/div/div[1]/table/thead/tr[2]/th[1]")).click();
	        // driver.findElements(By.xpath("//table[@class='table-condensed']/tbody/tr/td"))
	        driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[4]/td[6]")).click();

	  }
	  
		
		public void DeleteShopPage(WebDriver driver,String shpname) throws Throwable
		
		{

			
		Thread.sleep(5000);	
		//driver.findElement(By.xpath("//a[contains(text(),'"+105+"')]/parent::div/following::td[6]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'105')]/parent::span/parent::div/following::td[9]")).click();
		Thread.sleep(5000);
		//click on yes button in pop up
	    driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable pi pi-check']")).click();
	   
	    Thread.sleep(5000);
	    System.out.println(driver.findElement(By.xpath("//span[@class = 'ui-growl-title']")).getText() + " :-  ");
		Thread.sleep(5000);
		//System.out.println(driver.findElement(By.xpath("//div[@class = 'ui-growl-message']/p")).getText());
		
		
		
	}


	
	  public void closeMethod(WebDriver driver)
		
		{
				driver.close();
		}
		
	

	
	
	
	
	
}

	
	
	
	
	

