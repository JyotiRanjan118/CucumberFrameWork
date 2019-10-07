package stepDefination;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCRMStepDefination {
	WebDriver driver;
	@Given("^User is already Login Page$")
	public void User_is_already_Login_Page()  {
	   System.setProperty("webdriver.chrome.driver", ".\\driverFiles\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.crmpro.com/");
	}

	@When("^Title of the Login Page is FreeCRM$")
	public void Title_of_the_Login_Page_is_FreeCRM()  {
	    String title=driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title);
	}

	@Then("^User enters Username and Password$")
	public void User_enters_Username_and_Password(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps()) {
				driver.findElement(By.name("username")).sendKeys(data.get("Username"));
				driver.findElement(By.name("password")).sendKeys(data.get("Password"));
		}
	}

	@Then("^User clicks on Login Page$")
	public void User_clicks_on_Login_Page()  {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@Then("^User is on Home Page$")
	public void User_is_on_Home_Page()  {
	    String title=driver.getTitle();
	    System.out.println("Home Page Title :"+title);
	    Assert.assertEquals("CRMPRO",title);
	}

	@Then("^User moves to new Deal Page$")
	public void User_moves_to_new_Deal_Page() {
	   driver.switchTo().frame("mainpanel");
	   Actions act=new Actions(driver);
	   act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	   driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}

	@Then("^User enters deal details$")
	public void User_enters_deal_details(DataTable dealData) throws InterruptedException  {
		for(Map<String, String> data : dealData.asMaps()) {
			
		driver.findElement(By.id("title")).sendKeys(data.get("title"));
		driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
		driver.findElement(By.id("probability")).sendKeys(data.get("Probability"));
		driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	   }
	}

	@Then("^Close the browser$")
	public void Close_the_browser() {
	   driver.quit(); 
	}
}
