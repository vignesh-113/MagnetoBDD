package Tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuperTestNG
	{
		public WebDriver driver;
		
		@BeforeSuite
		public void preCondition()
		{
			System.setProperty("webdriver.chrome.driver", "D:/Common drivers/chromedriver.exe");
			driver=new ChromeDriver();
//			DesiredCapabilities DesireCaps = new DesiredCapabilities();
//	        DesireCaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "D:/Common drivers/phantomjs-2.0.0-windows/bin/phantomjs.exe");
//	        driver=new PhantomJSDriver(DesireCaps);								
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://live.guru99.com/index.php/");
			
			
		}
		@AfterSuite
		public void PostCondition() throws InterruptedException
		{			
			driver.quit();
		}
}

