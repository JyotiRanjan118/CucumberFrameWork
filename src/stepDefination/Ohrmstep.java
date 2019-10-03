package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ohrmstep {
	WebDriver driver;
	String Url;
@Given("^Open Chrome browser and navigate to OrangeHRM Application$")
public void Open_Chrome_browser_and_navigate_to_OrangeHRM_Application() throws Throwable {
	System.setProperty("webdriver.chrome.driver", ".\\driverFiles\\chromedriver.exe");
	driver=new ChromeDriver();
	Url="https://opensource-demo.orangehrmlive.com/";
	driver.get(Url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("^User enters UserName and Password & click on Login Application$")
public void User_enters_UserName_and_Password_click_on_Login_Application() throws Throwable {
	WebElement UserName=driver.findElement(By.id("txtUsername"));
	UserName.sendKeys("Admin");
	WebElement Password=driver.findElement(By.id("txtPassword"));
	Password.sendKeys("admin123");
	
	driver.findElement(By.id("btnLogin")).click();
}

@Then("^User should be able to Login to the Application and close the applcation$")
public void User_should_be_able_to_Login_to_the_Application_and_close_the_applcation() throws Throwable {
	try {
		String expected_Text="Welcome Admin";
		System.out.println("The Expected Text of the Page  :"+expected_Text);
		String actual_Text=driver.findElement(By.id("welcome")).getText();
		System.out.println("The actual Text of the Page  :"+actual_Text);
		
		if(actual_Text.contains(expected_Text)) {
			System.out.println("Successfully Login- PASS");
		}
	} catch (Exception e) {
		if(driver.findElement(By.id("spanMessage")).getText().equals("Invalid credentials"));
			System.out.println("Login Failed-FAIL");
			driver.quit();
		}
		
	}
}
