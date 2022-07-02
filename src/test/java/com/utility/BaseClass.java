package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
		public static WebDriver driver;
		
		public static void loadDriver() {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
		}	
		
		public static void url(String site) {
			driver.get(site);
		}
		
		public void type(WebElement element,String text) {
			element.sendKeys(text);
		}
		public void click(WebElement element) {
			element.click();
		}
		
		

	

}
 