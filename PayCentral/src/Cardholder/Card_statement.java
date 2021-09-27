package Cardholder;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Card_statement {
	public WebDriver driver;
	
	@Test
	public  void cardstatement() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver,2);
		WebElement submit1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-dashboard/div[1]/div[3]/div[1]")));
//		WebElement submit1= driver.findElement(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-dashboard/div[1]/div[3]/div[1]"));
		submit1.click();
		Thread.sleep(3000);
		submit1.click();
		
		WebElement date01=driver.findElement(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-statement/div[1]/div[2]/div[2]/form/div[1]/div/div/div/div/button"));
		date01.click();
		WebElement date=driver.findElement(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-walletstatement/div[2]/div[2]/form/div[1]/div/div/div/ngb-datepicker/div[2]/div/ngb-datepicker-month"));
		List<WebElement> columns=date.findElements(By.tagName("div"));

		for (WebElement cell: columns){
		   //Select 13th Date 
		   if (cell.getText().equals("20")){
		      cell.findElement(By.linkText("20")).click();
		      break;
		 }
		
		
    	Thread.sleep(7000);
		WebElement date1=driver.findElement(By.xpath("//div[@id=\"todte\"]/div/button"));
        date1.click();
		List<WebElement> columns1=date1.findElements(By.tagName("div"));

		for (WebElement cells: columns1)
		{
		   //Select 13th Date 
		   if (cells.getText().equals("28"))
		   {
		      cells.findElement(By.linkText("28")).click();
		      break;
		 }}
		
		
		driver.findElement(By.xpath("/html/body/app-root/app-base/div/div/div/div/app-statement/div[1]/div[2]/div[2]/form/div[3]/div/button[1]")).click();
	
	

}}}