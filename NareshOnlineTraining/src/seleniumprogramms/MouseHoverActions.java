package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.selenium.reusable.ReusableWebObjects;

public class MouseHoverActions extends ReusableWebObjects{


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();  
        mousehover(By.xpath("//*[@id=\\'container\\']/div/div[2]/div/ul/li[1]/span"));
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(6000);        
        Actions action=new Actions(driver);
        WebElement electronics=driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
        action.moveToElement(electronics).perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Mi")).click();
        Thread.sleep(3000);
        String text=driver.findElement(By.className("_2yAnYN")).getText();
        System.out.println(text);
        driver.close();
	}

}
