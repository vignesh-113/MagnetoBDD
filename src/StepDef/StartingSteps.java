package StepDef;

import java.util.concurrent.TimeUnit;

import DriverFactory.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StartingSteps extends DriverFactory{
		
	@Given("^User is in Home Page$")
	public void user_is_in_Home_Page() throws Throwable {		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("http://live.guru99.com/index.php/");		
	}
	
	@Before
	public void beforeScenario() {
		driver = new DriverFactory().getDriver();
		System.out.println("this will run before the actual scenario");
	}
	
	@Before("@TestCase-one,@TestCase-two")
	public void beforeTag(){
		System.out.println("This should run everytime before any of the @TestCase-one tagged scenario");
	}
	@After("@TestCase-one,@TestCase-two")
	public void afterTag(){
		System.out.println("This should run everytime after any of the @TestCase-one tagged scenario");
	}
	@After
	public void afterScenario() throws Exception {
		new DriverFactory().destroyDriver();
		System.out.println("this will run after scenario is finished, even if it failed");
	}

}



