package Cardholder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelection 
{
static WebDriver driver;

public static WebDriver usingChrome()
{
System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
driver = new ChromeDriver(); 
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://chp.paycentral.co.za/");
return driver;

} 
}