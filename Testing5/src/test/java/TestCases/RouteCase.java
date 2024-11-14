package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.TripSelection;

public class RouteCase extends BaseCase {

	

	@Test
	public void tripSelecting() throws InterruptedException {
	
		TripSelection tripSelection = new TripSelection(driver);
		tripSelection.alertAccount();
		tripSelection.flight();
		tripSelection.roundTrip();
		//tripSelection.fromBox();
	}
	
}
