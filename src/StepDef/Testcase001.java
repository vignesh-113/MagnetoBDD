package StepDef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Ordering;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Vigneshwaran.S
 *        Test Script 01
 *        ************** 
 *        Test Steps
 *        1) Go to http://live.guru99.com/index.php/
          2) Verify page title
          3) Click on "Mobile" menu
          4) Verify page title
          5) In the list of all mobile,select "SORT BY" dropdown as name
          6) Verify all products are sorted by name
 */
/**
 * 
 * @author Vigneshwaran.S
 *        Test Script 02
 *        ************** 
 *        Test Steps
 *        1) Go to http://live.guru99.com/index.php/
          2) Click on "Mobile" menu
          3) In the list of all mobile, read the cost of Sony Xperia mobile. Note this value
          4) Click on Sony Xperia mobile
          5) Read the cost of Sony Xperia mobile from detail page.
          6) Compare value of step3 and step5
 */
public class Testcase001 {
//	public WebDriver driver;	
//	String costout;
//	String costin;
//
//		@Given("^User is in Home Page$")
//		public void user_is_in_Home_Page() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "D:/Common drivers/chromedriver.exe");
//			driver = new ChromeDriver();
//	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	        driver.get("http://live.guru99.com/index.php/");
//	        driver.manage().window().maximize();
//	        String actualErrorDisplayed = driver.getTitle();
//			String requiredErrorMessage = "Home page";
//			Assert.assertEquals(requiredErrorMessage, actualErrorDisplayed);	                
//	        System.out.println(driver.getTitle()+"<-->"+requiredErrorMessage);	
//	   	}
//
//		@When("^Click on MOBILE menu$")
//		public void click_on_MOBILE_menu() throws Throwable {				
//			//WebDriverWait wait = new WebDriverWait(driver, 10);
//			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Mobile')]")));
//			//WebElement Mobile_menu = driver.findElement(By.linkText("Mobile"));
//			WebElement Mobile_menu = driver.findElement(By.xpath("//a[contains(text(),'Mobile')]"));
//			Mobile_menu.click();
//			Thread.sleep(2000);
//		    String actualErrorDisplayed = driver.getTitle();
//			String requiredErrorMessage = "Mobile";
//			Assert.assertEquals(requiredErrorMessage, actualErrorDisplayed);	                
//	        System.out.println(driver.getTitle()+"<-->"+requiredErrorMessage);			    	    
//		}
//
//		@When("^select SORT BY dropdown as name$")
//		public void select_SORT_BY_dropdown_as_name() throws Throwable {
//			
////		List<WebElement> product_name = driver.findElements(By.xpath("//h2[@class='product-name']"));
////		List<String> product_name1 = new ArrayList<>();
////		for(WebElement name:product_name)
////		{
////			System.out.println("When"+name.getText());
////			product_name1.add(name.getText());			
////		}
////		for(String name:product_name1)
////			System.out.println("Before sorted"+name);
////		Collections.sort(product_name1);
////		boolean sorted = Ordering.natural().isOrdered(product_name1);
////			System.out.println(sorted);
////		for(String name:product_name1)
////			System.out.println("After sorted"+name);
//		//Assert.assertThat(product_name, IsIterableContainingInOrder.contains("AAA", "ABC", "AZZ", "BBB"));		
//		WebElement sortby = driver.findElement(By.xpath("//*[@title='Sort By']"));			
//			Select sel = new Select(sortby);
//			sel.selectByVisibleText("Name");
//		}
//
//		@Then("^All products should be sorted by name$")
//		public void all_products_should_be_sorted_by_name() throws Throwable {
//			//List<String> product_name1 = Arrays.asList("IPHONE", "SAMSUNG GALAXY", "SONY XPERIA"); 
//			List<String> product_name2 = new ArrayList<String>();
//			List<WebElement> product_name = driver.findElements(By.xpath("//h2[@class='product-name']"));
//			for(WebElement name:product_name)
//			{
//				product_name2.add(name.getText());				
//			}			
////			for(String nam:product_name2)
////				System.out.println("Then"+nam);		
//			boolean sorted = Ordering.natural().isOrdered(product_name2);
//			Assert.assertTrue(sorted);
//			System.out.println("All products are sorted by Name");
//			//Assert.assertEquals(product_name1, product_name2);
//			
//		}
//		
//		
//		@When("^In the list of all mobile, read the cost of Sony Xperia mobile. Note this value$")
//		public void in_the_list_of_all_mobile_read_the_cost_of_Sony_Xperia_mobile_Note_this_value() throws Throwable {
//		Thread.sleep(1000);
//			List<WebElement> product_name = driver.findElements(By.xpath("//h2[@class='product-name']"));
//		int i=1;
//		Outerloop:
//		for(WebElement name:product_name)
//		{
//			System.out.println("When"+name.getText());
//			if(name.getText().equals("SONY XPERIA"))
//			{
//			System.out.println("//ul/li["+i+"]/div/div/span/span");			
//			costout = driver.findElement(By.xpath("//ul/li["+i+"]/div/div/span/span")).getText();
//			break Outerloop;
//			}
//			i++;
//			}
//		}	
//
//		@When("^Click on Sony Xperia mobile$")
//		public void click_on_Sony_Xperia_mobile() throws Throwable {
//			WebElement product_name = driver.findElement(By.xpath("//h2/a[contains(text(),'Sony Xperia')]"));
//			product_name.click();
//		}
//
//		@When("^Read the cost of Sony Xperia mobile from detail page\\.$")
//		public void read_the_cost_of_Sony_Xperia_mobile_from_detail_page() throws Throwable {
//			Thread.sleep(1000);
//			WebElement product_price = driver.findElement(By.xpath("//span[@class='price']"));
//			costin = product_price.getText();
//		}
//
//		@Then("^Both Value should be same$")
//		public void both_Value_should_be_same() throws Throwable {
//		    Assert.assertEquals(costout, costin);
//		    System.out.println("Both values are same");
//		}
	}

