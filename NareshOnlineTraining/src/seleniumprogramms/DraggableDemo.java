package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();        
        driver.navigate().to("https://jqueryui.com/draggable/");
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        WebElement draggable =driver.findElement(By.id("draggable"));
        Actions action=new Actions(driver);
        action.dragAndDropBy(draggable, 168, 97).perform();
        Thread.sleep(3000);
        driver.close();
        
        
        
        
        
        

	}

}
