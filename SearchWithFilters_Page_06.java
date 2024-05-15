package Amazon_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchWithFilters_Page_06 {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
     WebElement search_field;
	
	@FindBy(xpath="//span[.='Smartphones']")
	WebElement chooseCategory;
	
	@FindBy(xpath="//span[.='Over ₹20,000']")
	WebElement priceCategory;
	
	//separate methods for all elements
	public void search_With_Filter() {
		search_field.sendKeys("mobile");
		search_field.sendKeys(Keys.ENTER);
	}
	public void chooseCategory() {
		chooseCategory.click();
	}
	public void  priceCategory() {
		 priceCategory.click();
	}
	//initializing the elements inside the constructors
	public SearchWithFilters_Page_06 (ChromeDriver driver) {
		 PageFactory.initElements(driver, this);
	 }	
}
