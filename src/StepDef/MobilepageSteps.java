package StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import DriverFactory.DriverFactory;
import PageObjectPatten.HomePage;
import PageObjectPatten.MobilePage;
import PageObjectPatten.ProductViewPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MobilepageSteps extends DriverFactory {
	
	ProductViewPage PVP = new ProductViewPage(driver);
	@And("^select SORT BY dropdown as name$")
	public void select_SORT_BY_dropdown_as_name() throws Throwable{
		Thread.sleep(2000);
		PVP.SortBy("Name");				
	}
	
	@And("^All products should be sorted by name$")
	public void all_products_should_be_sorted_by_name() throws Throwable{
		PVP.all_products_should_be_sorted_by_name();		
		
	}
	
	@And("^In the list of all mobile, read the cost of Sony Xperia mobile. Note this value$")
	public void in_the_list_of_all_mobile_read_the_cost_of_Sony_Xperia_mobile_Note_this_value() throws Throwable{
		Thread.sleep(2000);
		PVP.in_the_list_of_all_mobile_read_the_cost_of_a_product_Note_this_value("SONY XPERIA");		
		System.out.println(PVP.costout);
				
	}
	@And("^Click on Sony Xperia mobile$")
	public void click_on_Sony_Xperia_mobile() throws Throwable{
		Thread.sleep(2000);
		PVP.click_on_Product("Sony Xperia");	
		
	}

	
	@When("^Read the cost of Sony Xperia mobile from detail page.$")
	public void read_the_cost_of_Sony_Xperia_mobile_from_detail_page() throws Throwable {
		PVP.read_the_cost_of_Sony_Xperia_mobile_from_detail_page();
	    System.out.println(PVP.costin);
	}

	@Then("^Both Value should be same$")
	public void both_Value_should_be_same() throws Throwable {
		System.out.println(PVP.costout+PVP.costin);
		Assert.assertEquals(PVP.costout, PVP.costin);
	}
}
