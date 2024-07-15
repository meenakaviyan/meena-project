//package Cucumstep;
//
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Withheadersd 
//{
//	WebDriver driver;
//	@Given("user Launch The Application")
//	public void userLaunchTheApplication() {
//		WebDriverManager.chromedriver().setup();
//		   driver= new ChromeDriver();
//		   driver.get("https://www.facebook.com/");
//		   driver.manage().window().maximize();
//	}
//	@When("user Enter The Username And Password")
//	public void userEnterTheUsernameAndPassword(DataTable data) 
//	{
//		List<Map<String, String>> m = data.asMaps();
//		String user = m.get(0).get("username");
//		String pass = m.get(0).get("password");
//		
//		WebElement element1 = driver.findElement(By.xpath("//input[@name='email']"));
//		element1.sendKeys(user);
//        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pass);
//	   
//	}
//	@Then("user Enter The Login Button")
//	public void userEnterTheLoginButton() {
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//	}
//
//
//
//}
