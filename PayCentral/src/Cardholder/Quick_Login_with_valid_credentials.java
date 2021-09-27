package Cardholder;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class Quick_Login_with_valid_credentials extends Card_statement {
	public static WebDriver driver;
	
	@BeforeSuite
	public void openBrowser()
	{ 

	driver = BrowserSelection.usingChrome(); 
	}
	 String[][] data= {
			    
        		{"5192607817637633","GJj88HJ"},	
        		{"5192607817637308","GJj88HJ"},	
        		{"5192607817637633","GFHJ76878GVHJ"},
	    		{"5192607817637308","GFHJ76878GVHJ"}
	    		
	    };
	 
    @DataProvider(name="login_data")
	public String[][] login_data_provider(){
		return data;
		 
	}
	

	
	@Test(priority=1,dataProvider="login_data")
	public void cardholderlogin(String Username,String Password) throws InterruptedException{	
		
		
		
	//for(int i=0; i<data.length;i++) {
		
//			for(int j=0; j<data[i].length;j++) {	
//		System.out.println("Username is" +" "+ Username);
////		
//		System.out.println("password is" +" "+ Password);
//		
//		driver.get("https://chp.paycentral.co.za/");
		
			
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		Thread.sleep(2000);
		WebElement username=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='cardnumber']")));
		username.sendKeys(Username);
		Thread.sleep(2000);
		WebElement password=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='ID Number']")));
		password.sendKeys(Password);
		
		WebElement submit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-auth/app-login/html/div[1]/div[2]/form/div/div[3]/div[2]/button")));
		submit.click();
		username.clear();
		password.clear();
		//}
		//}
	}
	
       @Test(priority=2)	
       
   	public  void cardstatement() throws InterruptedException {
    	   Thread.sleep(3000);
   		WebDriverWait wait= new WebDriverWait(driver,20);
   		WebElement submit1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-dashboard/div[1]/div[3]/div[1]")));
   	//	WebElement submit1= driver.findElement(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-dashboard/div[1]/div[3]/div[1]"));
   		submit1.click();
   		Thread.sleep(3000);
   		submit1.click();
   	 	Thread.sleep(7000);
  		WebElement date01=driver.findElement(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-statement/div[1]/div[2]/div[2]/form/div[1]/div/div/div/div/button"));
  		date01.click();
  		Thread.sleep(3000);
  		driver.findElement(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-statement/div[1]/div[2]/div[2]/form/div[1]/div/div/div/ngb-datepicker/div[1]/ngb-datepicker-navigation/div[1]/button")).click();
  		Thread.sleep(3000);
  		driver.findElement(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-statement/div[1]/div[2]/div[2]/form/div[1]/div/div/div/ngb-datepicker/div[1]/ngb-datepicker-navigation/div[1]/button")).click();
  		Thread.sleep(3000);
  		driver.findElement(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-statement/div[1]/div[2]/div[2]/form/div[1]/div/div/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[2]/div[4]")).click();
  		Thread.sleep(3000);
  		driver.findElement(By.xpath("//div[@id=\"todte\"]/input")).click();
  		Thread.sleep(3000);
  		driver.findElement(By.xpath("//div[@id=\"todte\"]/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[6]/div[4]")).click();
  			
        Thread.sleep(3000);
   		
   		driver.findElement(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-statement/div[1]/div[2]/div[2]/form/div[3]/div/button[1]")).click();
   		Thread.sleep(3000);
   	driver.findElement(By.xpath("//img[@id=\"webimg\"]")).click(); //download statement excel file
   	Thread.sleep(3000);
   	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/button[2]")).click();
   	Thread.sleep(7000);
   	driver.findElement(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-statement/div[1]/div[1]/div/div[1]/p")).click();
   	

   }

		
		

//@AfterSuite
//public void close_browser() {
//
//driver.close();
//
//
//}
}