package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import DriverFactory.DriverFactory;
import PageObjectPatten.HomePage;
import cucumber.api.java.en.When;

public class HomepageSteps extends DriverFactory
{	
		
	HomePage HP = new HomePage(driver);
	
	@When("^Click on MOBILE menu$")
	public void click_on_MOBILE_menu() throws Throwable {
		HP.click_on_MOBILE_menu();
	}	
	
}
