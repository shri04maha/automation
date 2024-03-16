package com.tka.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browsersetting(String url) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	 
		}
	
	public void accessiFrame() {
		 
		//driver.switchTo().frame(1);
		driver.switchTo().frame("webform");
		
		
		try {
			Thread.sleep(4000);
			//for crossbutton close
			//driver.findElement(By.xpath("//*[@id=\"webform_preview\"]/div")).click();
			
			//for input box
			driver.findElement(By.xpath("/html/body/div/div/form/div/div[4]/div/div[2]/div[1]/div/input")).sendKeys("kiran@gmail.com");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		driver.switchTo().defaultContent();
		
	
		
		
		
		
	}

}
