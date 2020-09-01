package com.candiatepsiexam.testcases;

import java.util.Date;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;


import org.testng.annotations.Test;

import com.candiatepsiexams.objectrepositories.Constants;
import com.candiatepsiexams.reusable.ReusableWebObjects;
import com.relevantcodes.extentreports.LogStatus;

public class CreateAnAccount extends ReusableWebObjects{

	
	
		
	@BeforeClass(groups={"regression","smoke"})
	public void clickoncreateaccount(){
		test=report.startTest("creating account page");
		
		click(By.linkText(Constants.createaccountlinktext));
		test.log(LogStatus.PASS, "Account lnk opened");
	}
	
	
	
	@Test(priority=4,groups={"regression"})
	public void createtheaccount() throws InterruptedException{	
		Thread.sleep(4000);
		Random r=new Random();
		int num=r.nextInt(1000);
		//
		sendtext(By.name(Constants.accountemailid), "ramesh"+num+"@gmail.com");
		sendtext(By.name("firstname"), "ramesh");
		sendtext(By.name("lastname"), "kumar");
		sendtext(By.name("password"), "123456789Aa!");
		sendtext(By.name("confirmpassword"), "123456789Aa!");
		dropdown(By.name("hintquestion"), "Place of birth");
		sendtext(By.name("hintanswer"), "Hyderabad");
		click(By.name("Submit"));
		test.log(LogStatus.PASS, "Created the account");
	}
	
	@Test(priority=2,groups={"regression"})
	public void checktheaccountalreadyexist(){

		sendtext(By.name(Constants.accountemailid), "ramesh@gmail.com");
		sendtext(By.name("firstname"), "ramesh");
		sendtext(By.name("lastname"), "kumar");
		sendtext(By.name("password"), "123456789Aa!");
		sendtext(By.name("confirmpassword"), "123456789Aa!");
		dropdown(By.name("hintquestion"), "Place of birth");
		sendtext(By.name("hintanswer"), "Hyderabad");
		click(By.name("Submidt"));
	}
	
	@Test(priority=1,groups={"regression"},enabled=false)
	public void createaccountuivalidationmesages() throws InterruptedException{
		Thread.sleep(4000);
		click(By.name("Submit"));
		boolean status=driver.findElement(By.className("errorInline")).isDisplayed();
		Assert.assertTrue(status, "The validation message is getting displayed");
		
	}
	
	@Test(priority=3,groups={"smoke"})
	public void validationpasswordrulematches() throws InterruptedException{
		Thread.sleep(4000);
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
	
	@AfterClass(groups={"regression","smoke"})
	public void logout(){
	   click(By.linkText("Logout"));
	}
	
	
	
	
}
