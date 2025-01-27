package PageObject;

import java.util.List;

import org.joda.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import junit.framework.Assert;

public class Amazonlogin {

	WebDriver ldriver;

	public Amazonlogin(WebDriver rDriver)
	{
		ldriver= rDriver;
		PageFactory.initElements(ldriver,this);
	}
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement nametextbox;

	public void entername(String name)
	{
		nametextbox.sendKeys(name);
	}
	@FindBy(xpath="/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[1]/input[2]")
	WebElement enteremail;

	public void entermail(String email)
	{
		enteremail.sendKeys(email);
	}
	@FindBy(xpath="/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[1]/input[3]")
	WebElement phonenum;

	public void phonenumbernew(String phonenumber)
	{
		phonenum.sendKeys(phonenumber);
	}
	@FindBy(xpath="/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[2]/textarea")
	WebElement addresselement;

	public void addressnew(String address)
	{
		addresselement.sendKeys(address);
	}
	@FindBy(xpath="/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[3]/div[1]/input")
	WebElement radiobuttonelement;

	public void selectgender()
	{
		radiobuttonelement.click();
	}
	@FindBy(xpath="/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[4]/div[1]/input")
	WebElement checkboxone;

	@FindBy(xpath="/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[4]/div[2]/input")
	WebElement checkboxtwo;
	public void selectcheckbox()
	{
		checkboxone.click();
		checkboxtwo.click();
	}
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[5]/select")
	WebElement dropdownwebelement;
	public void selectdropdownvalue()
	{
		Select dropdown = new Select(dropdownwebelement);
		//dropdown.selectByIndex(1);
		//dropdown.selectByValue("canada");
		dropdown.selectByVisibleText("China");
		
	}
	@FindBy(xpath="//*[@id=\"end-date\"]")
	WebElement selectdate;
	
	public void selectdatefromcalender() 
	{
		String expectedDay = "15";
		String expectedMonth ="Feb";
		String expectedYear ="2026";
		
		//ldriver.switchTo().frame(0);
		selectdate.click();
		// ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
