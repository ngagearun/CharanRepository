package com.flipkart.electronics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		


		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.in/");		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Blog1']/div[1]/div[7]/div/div/div/h3/a")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
