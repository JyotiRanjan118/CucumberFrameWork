package step_Defination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OHRMaddEmp {
	WebDriver driver;
	String URL="https://opensource-demo.orangehrmlive.com/";
	@Given("^User is already Login Page$")
	public void User_is_already_Login_Page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", ".\\driverFiles\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get(URL);
	}

	@When("^Title of the Login Page of OrangeHRM$")
	public void Title_of_the_Login_Page_of_OrangeHRM() throws Throwable {
	    String title=driver.getTitle();
	    Assert.assertEquals(title, "OrangeHRM");
	    
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_and(String un, String pwd) throws Throwable {
	driver.findElement(By.id("txtUsername")).sendKeys(un);;
	driver.findElement(By.id("txtPassword")).sendKeys(pwd);;
	
	}

	@Then("^User click on Login button$")
	public void User_click_on_Login_button() throws Throwable {
		WebElement Login=driver.findElement(By.className("button"));
		Login.click(); 
	}

	@Then("^User is on home page$")
	public void User_is_on_home_page() throws Throwable {
		String title=driver.getTitle();
	    Assert.assertEquals(title, "OrangeHRM");
	}

	@Then("^User moves add employee page$")
	public void User_moves_add_employee_page() throws Throwable {
	WebElement viewPIM=driver.findElement(By.id("menu_pim_viewPimModule"));
		
		Actions act1=new Actions(driver);
		Thread.sleep(2000);
		act1.moveToElement(viewPIM).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
	}
	
	@Then("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enter_and(String firstname, String lastname) throws Throwable {
		
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		driver.findElement(By.id("lastName")).sendKeys(lastname);
	}

	@Then("^Close the browser$")
	public void Close_the_browser() throws Throwable {
	   driver.close();
	}
}
