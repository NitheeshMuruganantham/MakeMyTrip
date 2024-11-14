package codes;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AllCode {

	public static void main(String[] args) throws InterruptedException {
	
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.makemytrip.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

WebElement alretAccount=driver.findElement(By.xpath("//div[@class='imageSlideContainer']//span[@class='commonModal__close']"));
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//wait.until(ExpectedConditions.elementToBeClickable(alretAccount));
if(alretAccount.isDisplayed())
{
	Thread.sleep(7000);
	alretAccount.click();
}
WebElement flight=driver.findElement(By.xpath("//a[@href='https://www.makemytrip.com/flights/']"));
flight.click();
WebElement roundTrip=driver.findElement(By.xpath("//*[text()='Round Trip']"));
roundTrip.click();	
WebElement fromBox=driver.findElement(By.xpath("//label[@for='fromCity']"));
fromBox.click();	
WebElement fromLoc=driver.findElement(By.xpath("//*[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]"));
fromLoc.sendKeys("Tiruchirappalli");

List <WebElement> fromSug= driver.findElements(By.xpath("//ui[contains(@class,'react-autosuggest__suggestions-list')]"));
for(WebElement fromPlace : fromSug)
	
{
	String fromplace1=fromPlace.findElement(By.xpath("//span/span")).getText();
	System.out.println(fromplace1);
	if(fromplace1.equalsIgnoreCase("tiruchirappalli"))
{
fromPlace.click();}
}
//
//WebElement toBox=driver.findElement(By.xpath("//label[@for='toCity']"));
//toBox.click();	
//WebElement toLoc=driver.findElement(By.xpath("//div[contains(@class,'flt_fsw_inputBox searchToCity inactiveWidget activeWidget')]//input[contains(@class,'react-autosuggest__input react-autosuggest__input--open')]"));
//toLoc.sendKeys("Colombo");
//
//List <WebElement> toSug= driver.findElements(By.xpath("//div[contains(@class,'flt_fsw_inputBox searchToCity inactiveWidget activeWidget')]//div[contains(@class,'react-autosuggest__suggestions-container react-autosuggest__suggestions-container--open')]"));
//for(WebElement toPlace : toSug)
//{if(toPlace.getText().equalsIgnoreCase("colombo"))
//	{System.out.println(toPlace);
//	toPlace.click();}
//}
//
//
////WebElement wholePage=driver.findElement(By.xpath("//div[@id='top-banner']"));
////wholePage.click();
//Thread.sleep(5000);
//
//String month= driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[1]/div[1]")).getText();
//System.out.println(month);
//
//String year= driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[1]/div[1]/span")).getText();
//System.out.println(year);
//
//WebElement nextYear=driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
//
//
//Thread.sleep(5000);
//driver.quit();

	}

}
