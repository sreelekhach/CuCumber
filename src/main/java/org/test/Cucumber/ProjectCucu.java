package org.test.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProjectCucu {
	
	WebDriver d;
	@Given("^user in demoqa website$")
	public void user_in_demoqa_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "I:\\Users\\Deepak\\eclipse-deepu\\Select\\Drivers\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://demoqa.com/registration/");
		
	}

	@When("^user selecting the option as single$")
	public void user_selecting_the_option_as_single() throws Throwable {
		WebElement e=d.findElement(By.xpath("//input[@value='single']"));
		e.click();
		
		   
	}

	@Then("^user has to verifing the option as single$")
	public void user_has_to_verifing_the_option_as_single() throws Throwable{
		WebElement e=d.findElement(By.xpath("//input[@value='single']"));
		//boolean s=e.isSelected();
		//System.out.println(s);
		Assert.assertEquals("single", e.getAttribute("value"));
			
		}
	@When("^user selecting the option as Dance$")
	public void user_selecting_the_option_as_Dance() throws Throwable  {
		WebElement hobb = d.findElement(By.xpath("//input[@value='dance']"));
		hobb.click();
	   
	}

	@Then("^user has to verifying the option as Dance$")
	public void user_has_to_verifying_the_option_as_Dance() throws Throwable {
		WebElement hobb = d.findElement(By.xpath("//input[@value='dance']"));
		//boolean s1=hobb.isSelected();
		//System.out.println(s1);
		Assert.assertEquals("dance", hobb.getAttribute("value"));
	}

	@When("^user is on default country as Afghanistan$")
	public void user_is_on_default_country_as_Afghanistan() throws Throwable  {
		WebElement con = d.findElement(By.id("dropdown_7"));
	   Select a = new Select(con);
	   a.selectByVisibleText("Afghanistan");
	}

	@Then("^user has to verifying the country as Afghanistan$")
	public void user_has_to_verifying_the_country_as_Afghanistan() throws Throwable {
		WebElement con = d.findElement(By.xpath("//*[@id='dropdown_7']/option[1]"));
		//boolean s2=con.isSelected();
		//System.out.println(s2);
		Assert.assertEquals("Afghanistan", con.getAttribute("value"));
		
		
		
	    
	}


}
