package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazoncart {
	WebDriver driver=new ChromeDriver();
	@Given("Url is running")
	public void url_is_running() {
		driver.get("https://www.facebook.com/");
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
		driver.findElement(By.id("email")).sendKeys();
	}

	@When("valid password")
	public void valid_password() {
		WebElement xyz=driver.findElement(By.id("pass"));
		xyz.sendKeys("Harshada123");
		xyz.sendKeys(Keys.ENTER);
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	     System.out.println("we are able to login");
	     
	}

	@When("user enters valid username {string}\\/\\/ Firstname")
	public void user_enters_valid_username_firstname(String string) {
		driver.findElement(By.id("email")).sendKeys(string); }

	@When("valid password {string}")
	public void valid_password(String string) {
		WebElement xyz=driver.findElement(By.id("pass"));
		xyz.sendKeys(string);
		xyz.sendKeys(Keys.ENTER);
	}

	@When("^user enters valid username (.+)$")
	public void user_enters_valid_username_ruhi(String Username) {
		driver.findElement(By.id("email")).sendKeys(Username);
	}

	@When("^valid password (.+)$")
	public void valid_password_ruhi123(String password) {
		WebElement xyz=driver.findElement(By.id("pass"));
		xyz.sendKeys(password);
		xyz.sendKeys(Keys.ENTER);
	}

//	@When("user enters valid username priya")
//	public void user_enters_valid_username_priya() {
//	   }
//
//	@When("valid password Priya213")
//	public void valid_password_priya213() {
//	   }
//
//	@When("user enters valid username tushar")
//	public void user_enters_valid_username_tushar() {
//	   }
//
//	@When("valid password tushar123")
//	public void valid_password_tushar123() {
//	    }
//
//	@When("user enters valid username rutu")
//	public void user_enters_valid_username_rutu() {
//	  }
//
//	@When("valid password tutu123")
//	public void valid_password_tutu123() {
//	  }
//
//

}
