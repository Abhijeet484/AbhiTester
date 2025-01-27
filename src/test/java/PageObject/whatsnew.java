package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class whatsnew {
	
	WebDriver ldriver;
	
	public whatsnew(WebDriver rDriver)
	{
		ldriver= rDriver;
		PageFactory.initElements(rDriver,this);
	}
	
	@FindBy(xpath="@FindBy(xpath=/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement Signin;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"send2\"]/span")
	WebElement LoginBtn;
	
	@FindBy(xpath="//*[@id=\"ui-id-3\"]/span")
	WebElement whatsnew;
	
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
	}
	public void clickonLoginButton()
	{
		LoginBtn.click();
	}
	public void clickonwhatsnewButton()
	{
		whatsnew.click();
	}
	

}

