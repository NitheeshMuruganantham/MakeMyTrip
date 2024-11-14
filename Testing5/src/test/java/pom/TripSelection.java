package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripSelection extends BasePOM {

	WebDriver driver;
	public TripSelection(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[@class='imageSlideContainer']//span[@class='commonModal__close']")
	WebElement alertAccount;
	@FindBy(xpath ="//a[@href='https://www.makemytrip.com/flights/']")
	WebElement flight;
	@FindBy(xpath ="//*[text()='Round Trip']")
	WebElement roundTrip;
	@FindBy(xpath ="//label[@for='fromCity']")
	WebElement fromBox;
	
	
	
	
	public void alertAccount() throws InterruptedException {
		Thread.sleep(5000);
		if(alertAccount.isDisplayed())
		{
			Thread.sleep(7000);
			alertAccount.click();
			}	
	}
	
	public void flight() {
		flight.click();
	}
	public void roundTrip() {
		roundTrip.click();
	}
	public void fromBox() {
		fromBox.click();
	}



	}
