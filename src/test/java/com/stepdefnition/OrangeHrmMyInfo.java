package com.stepdefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmMyInfo extends BaseClass{
	@Given("user is entering opensource-demo.orangehrmlive.com")
	public void user_is_entering_opensource_demo_orangehrmlive_com() {
	    loadDriver();
	    
	}
	@When("type the username and password")
	public void type_the_username_and_password() {
	    url("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	    
	}
	@When("user clicks the login Button")
	public void user_clicks_the_login_button() {
		WebElement login = driver.findElement(By.id("btnLogin"));
	    login.submit();
	}
	@Then("the user should able to login")
	public void the_user_should_able_to_login() {
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	}

   


}
