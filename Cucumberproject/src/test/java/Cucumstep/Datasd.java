//package Cucumstep;
//
//import java.util.List;
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
//public class Datasd 
//{
//	WebDriver driver;
//	@Given("user Launch The Application")
//	public void userLaunchTheApplication() 
//	{
//	   WebDriverManager.chromedriver().setup();
//	   driver= new ChromeDriver();
//	   driver.get("https://www.facebook.com/");
//	   driver.manage().window().maximize();
//	   System.out.println("launch the application");
//	}
//	@When("user Enter The Username And Password")
//	public void userEnterTheUsernameAndPassword(DataTable dataTable)
//	{
//		List<String> m = dataTable.asList();
//		String user = m.get(0);
//		String pass = m.get(1);
//		
//	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
//	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pass);
//	    System.out.println("user enter username and password");
//	    
//	}
//	@Then("user Enter The Login Button")
//	public void userEnterTheLoginButton() 
//	{
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		System.out.println("login done");
//	   
//	}
//	
//	}
//
