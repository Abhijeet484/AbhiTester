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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import ch.qos.logback.core.joran.action.Action;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver)
	{
		ldriver= rDriver;
		PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(xpath="@FindBy(xpath=/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement Signin;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[1]/div[1]/div/label/input")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[1]/div[2]/div/label/input")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[1]/div[3]")
	WebElement LoginBtn;
	
	@FindBy(xpath="https://magento.softwaretestingboard.com/checkout/#shipping")
	WebElement whatsnew;
	
	@FindBy(xpath="//*[@id=\"ui-id-4\"]/span[2]")
	WebElement womensection;
	
	@FindBy(xpath="//*[@id=\"ui-id-5\"]/span[2]")
	WebElement mensection;
	
	@FindBy(xpath="//*[@id=\"ui-id-6\"]/span[2]")
	WebElement gearsection;
	
	@FindBy(linkText="Training")
	WebElement mendropdown;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[2]/div/a/span/span/img")
	WebElement herohoodie;
	
	@FindBy(xpath="//*[@id=\"option-label-size-143-item-167\"]")
	WebElement size;
	
	@FindBy(xpath="//*[@id=\"option-label-color-93-item-53\"]")
	WebElement colour;
	
	@FindBy(xpath="//*[@id=\"product-addtocart-button\"]/span")
	WebElement addtocart;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/a/span[2]")
	WebElement clickcartbutton;
	
	@FindBy(xpath="//*[@id=\"top-cart-btn-checkout\"]")
	WebElement clickonproceedtocheckout;
	
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/div/button")
	WebElement clickonnext;
	
	public void clickonherohoodie()
	{
		herohoodie.click();	
		}
	
	public void selectsize()
	{
		size.click();
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
		//WebElement continueButton = ldriver.findElement(By.xpath("//*[@id=\"checkout-step-shipping\"]/div[2]/button/span"));
		//((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", clickonnext);
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
		//ldriver.findElement(By.xpath("//*[@id=\"mount_0_0_Xp\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/div/div")).click();
		ldriver.manage().window().maximize();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mount_0_0_eQ\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/div/div")));
		//WebElement notNowButton = ldriver.findElement(By.xpath("//*[@id=\"mount_0_0_74\"]/div/div/div[2]/div/div/div[1]/div[1]/div[1]/section/main/div/div/section/div/button"));
       // notNowButton.click();
		//ldriver.get("https://www.instagram.com/moment__sojo/");
		ldriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[8]/div/span/div/a/div/div[1]/div/div/span/img")).click();
		
		//WebElement element =ldriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/section/main/div/div[2]/div/div[10]/div[2]/a/div[1]/div[2]"));
		//JavascriptExecutor js = (JavascriptExecutor)ldriver;
		//js.executeScript("window.scrollBy(0,1000)");
		ldriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/section/main/div/div[1]/a[2]/div")).click();
		ldriver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div/div[1]/section/main/div/div[2]/div/div/div[3]/div[1]/div/a/div[2]/div[2]/div/div")).click();
		//ldriver.switchTo().frame(0);
		//WebElement element = ldriver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[3]/div/div/div/div/div[2]/div/article/div/div[1]/div/div/div/div/div/div/div/div/div/div[2]/button/div/svg"));
		/*Actions act = new Actions(ldriver);
		act.moveToElement(element).perform();*/
	}

	public void clickonwhatsnewButton()
	{
		whatsnew.click();
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

