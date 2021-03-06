package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions{
	
WebDriver 	driver =null;

@Given("^A user is on Demoqa\\.com$")
public void A_user_is_on_Demoqa_com() throws Throwable {
	
 driver = new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
 driver.get("http://store.demoqa.com");
}
@When("^User clicks on MyAccounts link$")
public void user_clicks_on_MyAccounts_link() throws Throwable {
 WebElement MyAccountLink = driver.findElement(By.className("account_icon"));
 MyAccountLink.click();
 }

@When("^User logs in using valid username and password$")
public void user_logs_in_using_valid_username_and_password() throws Throwable {

	 WebElement usernameField = driver.findElement(By.id("log"));
	 usernameField.sendKeys("LearnCucumber");
	 
	 WebElement passwordField = driver.findElement(By.id("pwd"));
	 passwordField.sendKeys("TestPassword123@");
	 
	 WebElement LoginButton = driver.findElement(By.id("login"));
	 LoginButton.click();
	 
}

@Then("^User is taken to my accounts page$")
public void user_is_taken_to_my_accounts_page() throws Throwable {
    driver.findElement(By.id("account_logout"));
}


}
