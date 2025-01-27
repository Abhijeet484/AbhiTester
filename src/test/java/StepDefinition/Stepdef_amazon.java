package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Amazonlogin;
import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdef_amazon {

	public WebDriver driver;
	public Amazonlogin loginPg;

	//@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPg = new LoginPage(driver);*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://magento.softwaretestingboard.com/men/tops-men.html");
		loginPg = new Amazonlogin(driver);
		driver.manage().window().maximize();

	}
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver .get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@And("Enter name {string}")
	public void Enter_name(String name) {
		loginPg.entername(name);
	}
	@And("Enter email {string}")
	public void Enter_email(String email) {
		loginPg.entermail(email);
	}
	@And("Enter phone number {string}")
	public void Enter_phone_number(String phonenumber) {
		loginPg.phonenumbernew(phonenumber);
	}
	@And("Enter address {string}")
	public void Enter_address(String address) {
		loginPg.addressnew(address);
	}
	@And("select gender")
	public void select_gender() {
		loginPg.selectgender();
	}
	@And("select checkbox")
	public void select_checkbox() {
		loginPg.selectcheckbox();
	}
	@And("select dropdown")
	public void select_dropdown(){
		loginPg.selectdropdownvalue();
	}
	@And("select date")
	public void select_date() {
		loginPg.selectdatefromcalender();
	}
}
