package seleniumprogramms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.selenium.reusable.ReusableWebObjects;

public class AutoComplete extends ReusableWebObjects {

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser("chrome");
		appurl("https://jqueryui.com/autocomplete/");
		switchtoframe(0);
		sendtext(By.id("tags"), "A");
		WebElement autocomplete=driver.findElement(By.id("ui-id-1"));
		List<WebElement> ele=autocomplete.findElements(By.tagName("li"));
		System.out.println(ele.size());
		for(int i=0;i<ele.size();i++){
			String text=ele.get(i).getText();
			if(text.equalsIgnoreCase("basic")){
				ele.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.close();

	}

}
