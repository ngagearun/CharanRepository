package com.candiatepsiexam.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.candiatepsiexams.objectrepositories.Constants;
import com.candiatepsiexams.reusable.ReusableWebObjects;

public class CreateAnAccount extends ReusableWebObjects{

	@BeforeTest
	public void setup(){
		launchbrowser("chrome");
		appurl("https://candidate.psiexams.com/index.jsp");
		
	}
	
	@Test
	public void createtheaccount(){		
		click(By.linkText(Constants.createaccountlinktext));
		sendtext(By.name(Constants.accountemailid), "ramesh@gmail.com");
		sendtext(By.name("firstname"), "ramesh");
		sendtext(By.name("lastname"), "kumar");
		sendtext(By.name("password"), "123456789Aa!");
		sendtext(By.name("confirmpassword"), "123456789Aa!");
		dropdown(By.name("hintquestion"), "Place of birth");
		sendtext(By.name("hintanswer"), "Hyderabad");
		click(By.name("Submit"));
	}
	
	@Test
	public void checktheaccountalreadyexist(){
		
		click(By.linkText(Constants.createaccountlinktext));
		sendtext(By.name(Constants.accountemailid), "ramesh@gmail.com");
		sendtext(By.name("firstname"), "ramesh");
		sendtext(By.name("lastname"), "kumar");
		sendtext(By.name("password"), "123456789Aa!");
		sendtext(By.name("confirmpassword"), "123456789Aa!");
		dropdown(By.name("hintquestion"), "Place of birth");
		sendtext(By.name("hintanswer"), "Hyderabad");
		click(By.name("Submit"));
	}
	
	@Test
	public void createaccountuivalidationmesages(){
		
		click(By.linkText(Constants.createaccountlinktext));
		click(By.name("Submit"));
		boolean status=driver.findElement(By.className("errorInline")).isDisplayed();
		Assert.assertTrue(status, "The validation message is getting displayed");
		
	}
	
	@Test
	public void validationpasswordrulematches(){
		
		click(By.linkText(Constants.createaccountlinktext));
		sendtext(By.name(Constants.accountemailid), "ramesh@gmail.com");
		sendtext(By.name("firstname"), "ramesh");
		sendtext(By.name("lastname"), "kumar");
		sendtext(By.name("password"), "123456789Aa!");
		sendtext(By.name("confirmpassword"), "343344444!");
		dropdown(By.name("hintquestion"), "Place of birth");
		sendtext(By.name("hintanswer"), "Hyderabad");
		click(By.name("Submit"));
		alert();
	}
	
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}
	
}
