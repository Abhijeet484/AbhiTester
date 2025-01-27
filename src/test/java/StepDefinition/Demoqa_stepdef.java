package StepDefinition;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObject.demoqalogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Demoqa_stepdef{
	public WebDriver driver;
	public demoqalogin loginpage;
	@Given("abhi launch Chrome browser")
	public void abhi_launch_chrome_browser() {
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPg = new LoginPage(driver);*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://magento.softwaretestingboard.com/men/tops-men.html");
		loginpage = new demoqalogin(driver);
		driver.manage().window().maximize();
	}
	@When("User opens demoqa URL {string}")
	public void User_opens_demoqa_URL(String url) {
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@And("click on elementabhi")
	public void click_on_elementabhi() {
		loginpage.Element();
	}
	@And("click on checkboxsection")
	public void click_on_checkboxsection() {
		loginpage.widgets();
	}
	@And("click on checkbox")
	public void click_on_checkbox() {
		loginpage.clickcheckbox();
	}
	@And("click on elementwebtable")
	public void click_on_elementwebtable() {
		loginpage.elementwebtable();
	}
	@And("click on webtables")
	public void click_on_webtables() {
		loginpage.webtablebutton();
	}
	@And("click on add button")
	public void click_on_add_button() {
		loginpage.addbutton();
	}

}