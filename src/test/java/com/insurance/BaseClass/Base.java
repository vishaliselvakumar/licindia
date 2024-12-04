package com.insurance.BaseClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

	public static WebDriverWait wait;
	public static WebDriver driver;
	public static Actions action;
	//public static JavascriptExecutor js;
	
	public void launchBrowser()
	{
		 
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		driver= new ChromeDriver(option);
		action = new Actions(driver);
		//js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
	}
	
	//webelementmethods
		public void button(WebElement element) 
		{
			element.click();
		}
	//webdriver methods
		public void appLaunch(String url) 
		{
			driver.get(url);
			
		}
		
		public void mouseOver(WebElement ele) 
		{
			action.moveToElement(ele).build().perform();
			
		}
		public void closeCurrentBrowser() {
			driver.close();
		}
//		public String currenturl() {
//		String url=driver.getCurrentUrl();
//		return url;
//		
//		}
//		public String title() {
//			String title = driver.getTitle();
//			return title;
//		}
//		public void submitButton(WebElement element) {
//			element.submit();
//		}
//		public void sendText(WebElement ele, String inputText) {
//			ele.sendKeys(inputText);
//			
//		}
		
}
