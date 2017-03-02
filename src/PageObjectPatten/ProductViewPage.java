package PageObjectPatten;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductViewPage extends MobilePage{
private WebDriver driver;
	
	@FindBy(xpath="//*[@title='Sort By']")
	private WebElement SortItems;
	
	public String costin;
	
	public ProductViewPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String pageTitle()
	{
		String title =driver.getTitle();
		return title;
	}
	
	public String read_the_cost_of_Sony_Xperia_mobile_from_detail_page() throws Throwable {
		Thread.sleep(2000);
		WebElement product_price = driver.findElement(By.xpath("//span[@class='price']"));
		costin = product_price.getText();
		return costin;
	}

	
}
