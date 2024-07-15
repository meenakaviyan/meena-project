//package Cucumstep;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Regularsd 
//{
//	WebDriver driver;
//	@Given("user Launch The Application")
//	public void userLaunchTheApplication() 
//	{
//	    WebDriverManager.chromedriver().setup();
//	    driver = new ChromeDriver();
//	    driver.get("https://www.facebook.com/");
//	    driver.manage().window().maximize();
//	}
//	@When("user Enter The Username {string}")
//	public void userEnterTheUsername(String username) 
//	{
//	   driver.findElement(By.name("email")).sendKeys(username);
//	}
//	@Then("user Enter the Password {string}")
//	public void userEnterThePassword(String password) 
//	{
//	    driver.findElement(By.name("pass")).sendKeys(password);
//	}
//
//
//
//}
