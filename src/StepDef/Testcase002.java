package StepDef;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/** 
 * @author Vigneshwaran.S
 *        Test Script 02
 *        ************** 
 *        Test Steps
 *        1) Go to http://live.guru99.com/index.php/
 *        2) Click on "Mobile" menu
 *        3) In the list of all mobile, read the cost of Sony Xperia mobile. Note this value
 *        4) Click on Sony Xperia mobile
 *        5) Read the cost of Sony Xperia mobile from detail page.
 *        6) Compare value of step3 and step5
 */
public class Testcase002 {
	public WebDriver driver;
		
	
//	public Testcase002()
//	{
//		
//	}
//	
//	String costout;
//	String costin;
//	
//	@When("^In the list of all mobile, read the cost of Sony Xperia mobile\\. Note this value$")
//	public void in_the_list_of_all_mobile_read_the_cost_of_Sony_Xperia_mobile_Note_this_value() throws Throwable {
//	Thread.sleep(10000);
//		List<WebElement> product_name = driver.findElements(By.xpath("//h2[@class='product-name']"));
//	int i=1;
//	for(WebElement name:product_name)
//	{
//		System.out.println("When"+name.getText());
//		if(name.getText().equals("Sony Xperia"))
//		{
//		System.out.println("//ul/li["+i+"]/div/div/span/span");			
//		costout = driver.findElement(By.xpath("//ul/li["+i+"]/div/div/span/span")).getText();
//		}
//		i++;
//		}
//	}	
//
//	@When("^Click on Sony Xperia mobile$")
//	public void click_on_Sony_Xperia_mobile() throws Throwable {
//		WebElement product_name = driver.findElement(By.xpath("//h2/a[contains(text(),'Sony Xperia')]"));
//		product_name.click();
//	}
//
//	@When("^Read the cost of Sony Xperia mobile from detail page\\.$")
//	public void read_the_cost_of_Sony_Xperia_mobile_from_detail_page() throws Throwable {
//		WebElement product_price = driver.findElement(By.xpath("//span[@class='price']"));
//		costin = product_price.getText();
//	}
//
//	@Then("^Both Value should be same$")
//	public void both_Value_should_be_same() throws Throwable {
//	    Assert.assertEquals(costout, costin);
//	}
	
}
