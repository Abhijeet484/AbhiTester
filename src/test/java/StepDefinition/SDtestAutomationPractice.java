package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import PageObject.POtestAutomationPractice;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SDtestAutomationPractice extends BaseClass {
	
	
	
	
	
	@Given("testautomation User launch Chrome browser")
	public void testautomation_user_launch_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		autoprac = new POtestAutomationPractice(driver);
		driver.manage().window().maximize();

	}
	
	
	
	@And("Enter email")
	public void enter_email() {
		autoprac.passemail();
	}
	@And("Enter name")
	public void enter_name() {
		autoprac.passfirstname();
	}

}
