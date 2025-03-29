package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoqalogin {
	WebDriver  udriver;

	public demoqalogin(WebDriver qdriver){

		udriver = qdriver;
		PageFactory.initElements(qdriver, this);

	}

	
	
	



	@FindBy(xpath="//span[@class='rct-checkbox']")
	WebElement checkbox;
	public void clickcheckbox() {
		checkbox.click();
	}
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[1]")
	WebElement elementsweb;
	public void elementwebtable() {
		WebDriverWait wait = new WebDriverWait(udriver,Duration.ofSeconds(10)); // 10 seconds timeout
		wait.until(ExpectedConditions.elementToBeClickable(elementsweb)); 
		elementsweb.click();
	}
	@FindBy(xpath="//*[contains(text(), 'Web Tables')]")
	WebElement webtable;
	public void webtablebutton() {
		webtable.click();
	}
	@FindBy(xpath="//button[@id='addNewRecordButton']")
	WebElement addbuttonweb;
	public void addbutton() {
		addbuttonweb.click();
	}

}
