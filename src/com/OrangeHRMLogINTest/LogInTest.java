package com.OrangeHRMLogINTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.sourceforge.cobertura.javancss.ccl.FileUtil;

public class LogInTest {
	WebDriver driver;
	String Url;
	
	@Given("^Open Chrome browser and navigate to OrangeHRM Application$")
	public void Open_Chrome_browser_and_navigate_to_OrangeHRM_Application()  {
		System.setProperty("webdriver.chrome.driver", ".\\driverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		Url="https://opensource-demo.orangehrmlive.com/";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" & click on Login Application$")
	public void User_enters_and_click_on_Login_Application(String UserName, String Password){
	  
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(UserName);
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(Password);
		
		WebElement Login=driver.findElement(By.className("button"));
		Login.click();
	}

	@Then("^User should be able to successfully login to the Application and close the applcation$")
	public void User_should_be_able_to_successfully_login_to_the_Application_and_close_the_applcation() throws IOException  {
	    try {
			String expected_Text="Welcome Admin";
			System.out.println("The Expected Text of the Page  :"+expected_Text);
			String actual_Text=driver.findElement(By.id("welcome")).getText();
			System.out.println("The actual Text of the Page  :"+actual_Text);
			
			if(actual_Text.contains(expected_Text)) {
				System.out.println("Successfully Login- PASS");
			}
		} catch (Exception e) {
			if(driver.findElement(By.id("spanMessage")).getText().equals("Invalid credentials")) {
				File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenShot,new File(".\\Selenium_Cucumber\\ScreenShot"));
				System.out.println("Login Failed-FAIL");
				driver.quit();
			}
			
		}
	}


	
}
