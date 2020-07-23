package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
				
          ChromeDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.navigate().to("https://www.selenium.dev/");
          String titlename=driver.getTitle();
          if(titlename.equalsIgnoreCase("SeleniumHQ Browser Automation")){
        	  System.out.println("Opned selenium hq page");
          } 
          
          Thread.sleep(3000);
          driver.findElement(By.linkText("Downloads")).click();

          Thread.sleep(3000);
          driver.findElement(By.linkText("Projects")).click();

          Thread.sleep(3000);
          driver.findElement(By.linkText("Documentation")).click();
          Thread.sleep(3000);
          driver.navigate().back();;
          Thread.sleep(3000);
          driver.navigate().forward();
          Thread.sleep(3000);
          driver.navigate().refresh();
          Thread.sleep(3000);
          String urlname =driver.getCurrentUrl();
          driver.get(urlname);
          Thread.sleep(3000);
          driver.findElement(By.id("search-by")).sendKeys(Keys.F5);
          Thread.sleep(3000);     
          driver.navigate().to(urlname);
          Thread.sleep(3000);               
          driver.close();
          
	}

}
