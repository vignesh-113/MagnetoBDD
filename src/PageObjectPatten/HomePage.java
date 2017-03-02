package PageObjectPatten;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	//WebDriverWait wait;
	private WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Mobile')]")
	private WebElement MobileMenu;	
	
	@FindBy(xpath="//a[contains(text(),'TV')]")
	private WebElement TVMenu;	

	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click_on_MOBILE_menu()
	{
		//wait.until(ExpectedConditions.elementToBeClickable(MobileMenu));
		MobileMenu.click();
	}

	public String pageTitle()
	{
		String title =driver.getTitle();
		return title;
	}

	public void click_on_TV_menu() {
		TVMenu.click();
		
	}

}
