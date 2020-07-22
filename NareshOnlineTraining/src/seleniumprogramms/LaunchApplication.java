package seleniumprogramms;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
				
          ChromeDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.selenium.dev/");
          String titlename=driver.getTitle();
          if(titlename.equalsIgnoreCase("SeleniumHQ Browser Automation")){
        	  System.out.println("Opned selenium hq page");
          }          
          driver.close();
          
	}

}
