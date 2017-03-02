package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectPatten.HomePage;
import PageObjectPatten.MobilePage;
import PageObjectPatten.ProductViewPage;


public class TestCase1 extends SuperTestNG
{	
	@Test
	public void TestCase() throws Throwable
	{			
		HomePage HP=new HomePage(driver);
		HP.click_on_MOBILE_menu();
		
		MobilePage MP = new MobilePage(driver);		
		MP.SortBy("Name");
		MP.all_products_should_be_sorted_by_name();
		MP.in_the_list_of_all_mobile_read_the_cost_of_a_product_Note_this_value("SONY XPERIA");
		MP.click_on_Product("Sony Xperia");
		
		ProductViewPage PVP = new ProductViewPage(driver);
		PVP.read_the_cost_of_Sony_Xperia_mobile_from_detail_page();
		System.out.println(MP.costout+PVP.costin);
		Assert.assertEquals(MP.costout, PVP.costin);
	}
}
