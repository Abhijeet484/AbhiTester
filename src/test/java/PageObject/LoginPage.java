package PageObject;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.codehaus.plexus.util.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import ch.qos.logback.core.joran.action.Action;
import io.cucumber.java.en.And;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver)
	{
		ldriver= rDriver;
		PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement Signin;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@title='Password']")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"send2\"]/span")
	WebElement LoginBtn;
	
	@FindBy(xpath="//*[@id=\"ui-id-4\"]/span[2]")
	WebElement whatsnew;
	
	@FindBy(xpath="//*[@id=\"ui-id-4\"]/span[2]")
	WebElement womensection;
	
	@FindBy(xpath="//*[@id=\"ui-id-5\"]/span[2]")
	WebElement mensection;
	
	@FindBy(xpath="//*[@id=\"ui-id-6\"]/span[2]")
	WebElement gearsection;
	
	@FindBy(linkText="Training")
	WebElement mendropdown;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[1]/a")
	WebElement herohoodie;
	
	@FindBy(xpath="//*[@id=\"option-label-size-143-item-167\"]")
	WebElement size;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[2]/div[2]/div")
	WebElement colour;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span")
	WebElement addtocart;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/a")
	WebElement clickcartbutton;
	
	@FindBy(xpath="//*[@id=\"top-cart-btn-checkout\"]")
	WebElement clickonproceedtocheckout;
	
	@FindBy(xpath="/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")
	WebElement clickonnext;
	
	@FindBy(xpath="/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")
	WebElement clickonplaceorder;
	
	
	
	public void clickonherohoodie()
	{
		herohoodie.click();	
		}
	
	
	public void selectsize()
	{
		size.click();
        System.out.print("abhijeet");
	}
	
	public void selectcolour()
	{
		colour.click();
	}
	
	public void clickcartbutton()
	{
		clickcartbutton.click();
	}
	
	public void clickonproceedtocheckout()
	{
		clickonproceedtocheckout.click();
		/*WebDriverWait w=new WebDriverWait(ldriver,Duration.ofSeconds(10));
		System.out.println("abhijeet");
		//ldriver.findElement(By.xpath("(//*[@id=\\\"checkout-step-shipping\\\"]/div[2]/button/span")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"checkout-step-shipping\"]/div[2]/button")));
		JavascriptExecutor jse =(JavascriptExecutor) ldriver;
		jse.executeScript("window.scrollBy(0,400)");*/
		
	}
	public void clickonaddtocart()
	{
		addtocart.click();
	}
	public void clickonnext()
	{
		JavascriptExecutor js=(JavascriptExecutor)ldriver;   
		js.executeScript("window.scrollBy(0,300)");
		clickonnext.click();
		//clickonnext.click();
	}
	public void entersigninlink()
	{
		Signin.click();
	}
	
	public void enterEmail(String Email)
	{
		email.sendKeys(Email);
	}
	public void enterPassword(String password)
	{
		Password.sendKeys(password);
		//ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void clickonLoginButton() 
	{
		
		LoginBtn.click();
		
	
	}

	public void clickonwhatsnewButton()
	{
		whatsnew.click();
	}
	
	
	
	public void clickonplaceorder()
	{
		//WebDriverWait wait = new WebDriverWait(ldriver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button")));
		Actions actions = new Actions(ldriver);
		actions.moveToElement(clickonplaceorder).click();
		//clickonplaceorder.click();
	}

	public void clickonwomensection() 
	{
		womensection.click();
	}
	
	public void clickonmensection() 
	{
		mensection.click();
	}
	public void clickongearsection() 
	{
		gearsection.click();
	}
	public void takescreenshot() throws IOException 
	{
		TakesScreenshot screenshot = ((TakesScreenshot)ldriver);
		File scr = screenshot.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\screenshot\\abhi2.png");
		FileUtils.copyFile(scr,dst);
	}
	public void checktooltip() {
		String actualtooltip =ldriver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[1]/a")).getAttribute("title");
		System.out.println("abhijeet"+ actualtooltip);
		String expectedtooltip = "Go to Home Page";
		assertEquals(actualtooltip,expectedtooltip,"This is not matching =");
	}	
	public void opennewwindow() {
		//ldriver.switchTo().newWindow(WindowType.TAB);
		//ldriver.get("https://www.instagram.com/");
		ldriver.findElement(By.xpath("//*[@id=\"mount_0_0_Xp\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/div/div")).click();
		ldriver.manage().window().maximize();
		//ldriver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/a[1]/img")).click();
	}
	public void mousehoveronmendropdown() {
		Actions act = new Actions(ldriver);
		act.moveToElement(womensection);
		//mendropdown.click();
	}

}

