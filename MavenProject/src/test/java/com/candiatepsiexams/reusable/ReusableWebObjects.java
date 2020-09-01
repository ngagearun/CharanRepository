package com.candiatepsiexams.reusable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.LogStatus;


public class ReusableWebObjects extends ExtentCustomizedReports {

	
	 public static WebDriver driver;
	 public static Actions action;
	 public static ExtentCustomizedReports ex;
	 
	 @BeforeTest(groups={"regression","smoke"})
		public void setup(){
		 ex=new ExtentCustomizedReports(System.getProperty("user.dir")+"\\results.html");
			launchbrowser("chrome");
			appurl("https://candidate.psiexams.com/index.jsp");
			
		}
	 
	 @AfterTest(groups={"regression","smoke"})
		public void tearDown(){
		 report.endTest(test);
		 report.flush();
			driver.close();
		}

	
	  public static void launchbrowser(String browsername){
		  if(browsername.equals("chrome")){
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		  }else if(browsername.equals("firefox")){
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
			  driver=new FirefoxDriver();
		  }else if(browsername.equals("interet")){
			  driver=new InternetExplorerDriver();
		  }	 
		  driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  
	  public static void appurl(String url){
		  driver.get(url);
	  }
	  
	  public static void switchtoframe(int index){
		  driver.switchTo().frame(index);
	  }
	  public static void sendtext(By locatornme,String value){
		  try{
		  driver.findElement(locatornme).clear();
		  driver.findElement(locatornme).sendKeys(value);
		  test.log(LogStatus.PASS,"SendText is working" );
		  }catch(Exception e){
			  test.log(LogStatus.FAIL, "SendText is not working");
		  }
		}
	  
	  public static void click(By locatornme){
		  try{
		  driver.findElement(locatornme).click();
		  test.log(LogStatus.PASS, "SendText is  working");
		  }catch(Exception e){
			  test.log(LogStatus.FAIL, "click is not working"); 
		  }
		  
	  }

	  public static void mousehover(By locatorname) {         

          action=new Actions(driver);

        WebElement element=driver.findElement(locatorname);

        action.moveToElement(element).perform();

}
	  
	  
	  public static void dropdown(By locatornme,String value){
		  Select objname=new Select(driver.findElement(locatornme));
		  objname.selectByVisibleText(value);
	  }
	
	  public static void draganddrop(){
		   action=new Actions(driver);
		  
	  }
	  
	  public static void alert(){
		  driver.switchTo().alert().accept();
	  }
	
	  
	  public static List<String> printingdropdownvalues(By locatorname){
		List<WebElement> ele= driver.findElements(locatorname);
		List<String> list=new ArrayList<String>();
		for(int i=0;i<ele.size();i++){
			   list.add(ele.get(i).getText());
		}		
		return list;
	  }
	
}
