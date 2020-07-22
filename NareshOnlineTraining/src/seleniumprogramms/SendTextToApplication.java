package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendTextToApplication {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mortgagecalculator.org/");
        Thread.sleep(3000);
        driver.findElement(By.id("homeval")).sendKeys("34567");
        Thread.sleep(3000);
        driver.findElement(By.name("cal")).click();
        Thread.sleep(3000);
        driver.close();
        

	}

}
