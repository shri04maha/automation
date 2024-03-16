package com.tka.window;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Automation%20material/Sellenium%20software%20234/Offline%20Website/index.html");
		
		WebElement emailelement = driver.findElement(By.id("email"));
		emailelement.sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).click();
		
		ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());
		System.out.println("window count => "+list.size());
		for(int i=0;i<list.size();i++) {
			
			if(i!=0) {
				driver.switchTo().window(list.get(i));
				driver.close();
				
			
			}
			
			//if(i!=0 && i!=2) {
				//driver.switchTo().window(list.get(i));
				//driver.close();
				
			//}
			
			//if(i<=2) {
			//driver.switchTo().window(list.get(i));
			//driver.close();
			
		//}
			
					
			
		}
		driver.switchTo().window(list.get(0));
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		
		
		
		
		
	

	}

}
