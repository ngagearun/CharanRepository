package seleniumprogramms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasedAlertAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();        
        driver.navigate().to("http://only-testing-blog.blogspot.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[1]/input[10]")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\NareshUploadFile.exe");
        Thread.sleep(3000);
        
	}

}
