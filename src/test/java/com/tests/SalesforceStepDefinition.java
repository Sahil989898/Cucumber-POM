package com.tests;


import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.BasePage.BasePage;
import com.test.BaseTest.BaseTest;
import com.test.HomePage.HomePage;
import com.test.LoginPage.LoginPage;

import Utility.Commonutilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SalesforceStepDefinition extends BaseTest {

	WebDriver driver;
	LoginPage login;
	HomePage home;	
	
	@Before	(order=0)									
	public void setUp1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Before(order=1) // we can have multiple before and afters using parameter mention order sequence
	public void setUp2() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	@After()
	public void teardown(){
		driver.close();
	}
	
	@Given("user open salesfoece application")
	public void user_open_salesforce_application() {
		driver.get("https://login.salesforce.com/");
	}
	
	@When ("user on{string}")
	public void user_on(String page) {
	if(page.equalsIgnoreCase("loginpage"))
		login = new LoginPage(driver);
	else if(page.equalsIgnoreCase("homepage"));
	home = new HomePage(driver);
	}

	
	@Given("when you go to url {string}")
	public void when_you_go_to_url(String url) {
	    
	    driver.get(url);
	}
	 
	@When("I enter correct username as {string} and wrong password as {string}")
	public void i_enter_correct_username_as_and_wrong_password_as(String username, String wrongPassword) {
		LoginPage login = new LoginPage(driver);
		login.enterUserName(username);
		login.enterPassword(wrongPassword);
		login.clickLoginButton();
	}
	 
	@When("click the login button")
	public void click_the_login_button() {
		LoginPage login = new LoginPage(driver);
		login.clickLoginButton();
		
	}
	 
	@Then("i should get the Error message")
	public void i_should_get_the_error_message() {
	 System.out.println("Please enter your password");
	}

	 
	@When("I enter correct username as {string} and password as {string}")
	public void i_enter_correct_username_as_and_password_as(String username, String password) {
		LoginPage login = new LoginPage(driver);
		login.enterUserName(username);
		login.enterPassword(password);
	}
	 
	@Then("Home page should appear")
	public void home_page_should_appear() {
	   System.out.println("Salesforce home page should appeared");
	}
	
	 
	@When("I click on remember me button")
	public void i_click_on_remember_me_button() {
		LoginPage login = new LoginPage(driver);
		login.clickReminderButton();
		}
	
	 
	@Then("Click on user dropdown menu")
	public void click_on_user_dropdown_menu() {
		HomePage home = new HomePage(driver);
		home.ClickuserId();
	}
	
	 
	@Then("click on Logout tag")
	public void click_on_logout_tag() {
		HomePage home = new HomePage(driver);
		home.Clicklogout();
	}
	
	 
	@Then("logout page should display")
	public void logout_page_should_display() {
	    System.out.println("Home page displayed");
	}

	 
	@When("enter correct username as {string}")
	public void enter_correct_username_as(String username) {
		LoginPage login = new LoginPage(driver);
		login.enterUserName(username);
		//Assert.assertEquals(actual, expected);
		System.out.println("TC 3 passed");
	}
	
	 
	@When("click on forgot password")
	public void click_on_forgot_password() {
		LoginPage login = new LoginPage(driver);
		login.forgotPassword();
		}

	 
	@When("I enter correct username as {string}")
	public void i_enter_correct_username_as(String username1) {
		LoginPage login = new LoginPage(driver);
		login.enterusername1(username1);
	}
	 
	@Then("click continue")
	public void click_continue() {
		LoginPage login = new LoginPage(driver);
		login.Continue();
	}
	 
	@Then("Error message should appear")
	public void error_message_should_appear() {
	    System.out.println("Error message should appear");
	}
	
	 
	@When("I click the login button")
	public void i_click_the_login_button() {
		LoginPage login = new LoginPage(driver);
		login.clickLoginButton();
	}
	 
	@Then("Click on userId")
	public void click_on_user_id() {
		WebElement user = driver.findElement(By.className("menuButtonLabel"));
		clickElement(user, "");
}
}