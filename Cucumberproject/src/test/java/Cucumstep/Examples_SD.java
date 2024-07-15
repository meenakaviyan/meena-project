package Cucumstep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Examples_SD {
	WebDriver driver;
	@Given("user Launch The Application")
	public void userLaunchTheApplication() 
	{
		 WebDriverManager.chromedriver().setup();
		   driver= new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
		   System.out.println("launch the application");
	}
	@When("user Enter The {string} And {string}")
	public void userEnterTheAnd(String Username, String Password) 
	{
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Username);
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Password);
		 System.out.println("user enter username and password");
	}
	@Then("user Enter The Login Button")
	public void userEnterTheLoginButton() 
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("login done");
	}
}
