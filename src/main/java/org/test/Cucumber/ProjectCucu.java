package org.test.Cucumber;







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

	@When("^user select radio button$")
	public void user_select_radio_button() throws Throwable {
		WebElement e=d.findElement(By.xpath("//input[@value='single']"));
		e.click();
		   
	}

	@Then("^user verifies the clicked option$")
	public void user_verifies_the_clicked_option() throws Throwable {
		WebElement e=d.findElement(By.xpath("//input[@value='single']"));
		boolean s=e.isSelected();
		System.out.println(s);
			
		}
	@When("^user select multiple check box$")
	public void user_select_multiple_check_box() throws Throwable {
		WebElement hobb = d.findElement(By.xpath("//input[@value='dance']"));
		hobb.click();
	   
	}

	@Then("^user verifies the selected check boxes$")
	public void user_verifies_the_selected_check_boxes() throws Throwable {
		WebElement hobb = d.findElement(By.xpath("//input[@value='dance']"));
		boolean s1=hobb.isSelected();
		System.out.println(s1);
	    
	}

	@When("^user select the afghanistan$")
	public void user_select_the_afghanistan() throws Throwable {
		WebElement con = d.findElement(By.id("dropdown_7"));
	   Select a = new Select(con);
	   a.selectByVisibleText("Afghanistan");
	}

	@Then("^user verifies the dropped option$")
	public void user_verifies_the_dropped_option() throws Throwable {
		WebElement con = d.findElement(By.xpath("//*[@id='dropdown_7']/option[1]"));
		boolean s2=con.isSelected();
		System.out.println(s2);
	    
	}


}
