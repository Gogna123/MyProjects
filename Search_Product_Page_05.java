package Amazon_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Product_Page_05 {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
     WebElement search_field;
	
	//separate methods for all elements
	public void searchProductShoe() {
		search_field.sendKeys("shoes");
		search_field.sendKeys(Keys.ENTER);
	}
	//initializing the elements inside the constructors
     public Search_Product_Page_05(ChromeDriver driver) {
	 PageFactory.initElements(driver, this);
 }	


}
