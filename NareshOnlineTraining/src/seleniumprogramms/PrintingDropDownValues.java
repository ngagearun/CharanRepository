package seleniumprogramms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.reusable.ReusableWebObjects;

public class PrintingDropDownValues extends ReusableWebObjects{

	public static void main(String[] args) {
		
		launchbrowser("chrome");
		appurl("https://www.mortgagecalculator.org/");
		List<WebElement> li=driver.findElements(By.xpath("//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[8]/select/option"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++){
			System.out.println(li.get(i).getText());
		}
		driver.close();
	}

}
