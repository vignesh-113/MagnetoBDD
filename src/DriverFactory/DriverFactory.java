package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
		protected static WebDriver driver;
		
		public DriverFactory() {
			initialize();
		}
		
		public void initialize() {
		if (driver == null)
			
			createNewDriverInstance();
		}
		
		private void createNewDriverInstance() {
			System.setProperty("webdriver.chrome.driver","D:/Common drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		public WebDriver getDriver() {
			return driver;
		}
		
		public void destroyDriver() {
			driver.quit();
			driver = null;
		}
		}
