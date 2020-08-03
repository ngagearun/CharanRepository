package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebBasedAlert {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();        
        driver.navigate().to("http://only-testing-blog.blogspot.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='post-body-3647323225296998740']/div[1]/button[1]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.close();

	}

}
