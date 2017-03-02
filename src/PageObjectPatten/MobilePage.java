package PageObjectPatten;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Ordering;

public class MobilePage {
	
	private WebDriver driver;
	
	//@FindBy(xpath="//*[@title='Sort By']")
	//private WebElement SortItems;	
	
	@FindBy(xpath="//*[@title='Sort By']")
	private List<WebElement> SortItems;
	
	public String costout;	
	
	public MobilePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click_on_Product(String ProductName)
	{	
		driver.findElement(By.xpath("//h2/a[contains(text(),'"+ProductName+"')]")).click();	
	}

	public void SortBy(String select) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(SortItems.get(0));
		sel.selectByVisibleText(select);
	}
	
	public void all_products_should_be_sorted_by_name() throws Throwable {
		//List<String> product_name1 = Arrays.asList("IPHONE", "SAMSUNG GALAXY", "SONY XPERIA"); 
		List<String> product_name2 = new ArrayList<String>();
		List<WebElement> product_name = driver.findElements(By.xpath("//h2[@class='product-name']"));
		for(WebElement name:product_name)
		{
			product_name2.add(name.getText());				
		}			
//		for(String nam:product_name2)
//			System.out.println("Then"+nam);		
		boolean sorted = Ordering.natural().isOrdered(product_name2);
		Assert.assertTrue(sorted);
		System.out.println("All products are sorted by Name");
}
	public String in_the_list_of_all_mobile_read_the_cost_of_a_product_Note_this_value(String ProductName) {
		List<WebElement> product_name = driver.findElements(By.xpath("//h2[@class='product-name']"));
		int i=1;
		Outerloop:
		for(WebElement name:product_name)
		{
			System.out.println("When"+name.getText());
			if(name.getText().equals(ProductName))
			{
			System.out.println("//ul/li["+i+"]/div/div/span/span");			
			costout = driver.findElement(By.xpath("//ul/li["+i+"]/div/div/span/span")).getText();
			break Outerloop;
			}
			i++;
			}
		return costout;
		
		}
	
	public String pageTitle()
	{
		String title =driver.getTitle();
		return title;
	}
}
	
