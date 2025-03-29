package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POtestAutomationPractice {
WebDriver Adriver;
	
	public POtestAutomationPractice(WebDriver rDriver)
	{
		Adriver= rDriver;
		PageFactory.initElements(Adriver,this);
	}
	@FindBy(xpath="/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[2]/div[1]/button")
	WebElement emailnew;
	public void passemail() {
		emailnew.click();
	}
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement firstname;
	public void passfirstname() {
		firstname.sendKeys("abhijeet");
	}
	
}
