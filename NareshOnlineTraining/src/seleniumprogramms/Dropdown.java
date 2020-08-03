package seleniumprogramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.navigate().to("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
        Thread.sleep(3000);
        WebElement dropdown=driver.findElement(By.id("c0"));
        Select sponsorname=new Select(dropdown);
        
        sponsorname.selectByIndex(4);
        Thread.sleep(3000);
        sponsorname.selectByValue("453^-99");
        Thread.sleep(3000);
        sponsorname.selectByVisibleText("Commission on Dietetic Registration Specialties (CDRS)");
        Thread.sleep(3000);
        driver.close();
        
        

	}

}
