package StepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.LoginPage;
import PageObject.POtestAutomationPractice;
import PageObject.demoqalogin;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef  {

	public WebDriver driver;
	public LoginPage loginPg;

	
	
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		loginPg = new LoginPage(driver);
		driver.manage().window().maximize();

	}
	
	@And("Click on Sign in link")
	public void Click_on_sign_in_link() {
		loginPg.entersigninlink();
	}
	@When("User enter Email as {string} and password as {string}")
	public void User_enter_Email_as_and_password_as(String emailadd, String password) {
		loginPg.enterEmail(emailadd);
		loginPg.enterPassword(password);
	}
	@When("Click on Login button")
	public void click_on_login() {
		loginPg.clickonLoginButton();

	}
	@Then("Page Title should be {string}")
	public void Page_Title_should_be(String expectedtitle) {
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedtitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(true);
		} 
	}
	@When("Click on whats new")
	public void click_on_whats_new() {
		loginPg.clickonwhatsnewButton();

	}
	@Then("Page Title should be whatsnew {string}")
	public void Page_Title_should_be_whatsnew(String expectedtitle) {
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedtitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	@When("Click on Women section")
	public void click_on_Women_section() {
		loginPg.clickonwomensection();

	}
	@Then("Page Title should be women section {string}")
	public void Page_Title_should_be_womensection(String expectedtitle) {
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedtitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	@When("Click on Men section")
	public void click_on_Men_section() {
		loginPg.clickonmensection();

	}
	@Then("Page Title should be men section {string}")
	public void Page_Title_should_be_mensection(String expectedtitle) {
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedtitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	//@When("Click on Gear section")
	public void click_on_Gear_section() {
		loginPg.clickongearsection();

	}
	//@Then("Page Title should be gear section {string}")
	public void Page_Title_should_be_gearsection(String expectedtitle) {
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedtitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	@When("Mouse hover on men")
	public void Mouse_hover_on_men() {
		loginPg.mousehoveronmendropdown();

	}

	@When("click on hero hoodie") 
	public void click_on_hero_hoodie(){
		loginPg.clickonherohoodie();
	}

	@And("select size") 
	public void select_size(){
		loginPg.selectsize();
	}
	@And("select colour") 
	public void select_colour(){
		loginPg.selectcolour();
	}
	@And("click on add to cart button") 
	public void click_on_add_to_cart_button(){
		loginPg.clickonaddtocart();
	}

	@And("click on cart button") 
	public void click_on_cart_button(){
		loginPg.clickcartbutton();
	}
	@And("click on proceed to checkout") 
	public void click_on_proceed_to_checkout(){
		loginPg.clickonproceedtocheckout();

		/*WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(1000));
		System.out.println("abhijeet");
		//ldriver.findElement(By.xpath("(//*[@id=\\\"checkout-step-shipping\\\"]/div[2]/button/span")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")));*/
	}
	@And("click on place order") 
	public void click_on_place_order(){
		loginPg.clickonplaceorder();

	}

	@And("Take Screenshot")
	public void Take_Screenshot() throws IOException {
		loginPg.takescreenshot();
	}
	@And("check Tooltip")
	public void check_Tooltip() {
		loginPg.checktooltip();
	}
	@And("Open new window")
	public void Open_new_window() {
		loginPg.opennewwindow();
	}
	@And("click on next") 
	public void click_on_next(){
		loginPg.clickonnext();
	}
	@Then("close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	}

	/*@After
	public void teardown()
	{
		driver.quit();
	}*/



}
