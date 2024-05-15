package Amazon_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Relevence_By_Ratings_Price_Page_08 {
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
    WebElement search_field;
	

	@FindBy(xpath="//span[.='& Up']")
	WebElement fourStar;
	
	@FindBy(xpath="//span[.='RENEE']")
	WebElement brand;

	
	public void search_field() {
		search_field.sendKeys("perfume for women");
		search_field.sendKeys(Keys.ENTER);
	}
	
	public void fourStar() {
		fourStar.click();
	}
	public void brand() {
		brand.click();
	}
	
	//initialized the element under constructor
		public Relevence_By_Ratings_Price_Page_08(ChromeDriver driver) {
			 PageFactory.initElements(driver, this);	
		}
		

}
