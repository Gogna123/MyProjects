package Amazon_Source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Price_Review_Description_Visible_Page_07 {
	
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
     WebElement search_field;
	
	@FindBy(xpath="//div[@class='a-section aok-relative s-image-fixed-height']")
	WebElement select_01st_Product;
	
	@FindBy(xpath="//span[.='1,698']")
	WebElement priceDispalyedOrNot;
	
	@FindBy(xpath="//span[.='10,812 ratings']")
	WebElement reviewDisplayedOrNot;
	
	@FindBy(xpath="//span[.='        Havells MARINO Low Noise Glass Electric Kettle 1L|1200W Borosilicate Glass inner & Cool Touch Outer Body| Detachable LID|304 Rust Resistant SS Base|2 Yr Manufacturer Warranty (Black)       ']")
	WebElement descripicationDisplayOrNot;
	
	//different method of element
	public void search_field() {
		search_field.sendKeys("kettle");
		search_field.sendKeys(Keys.ENTER);
	}
	public void select_01_Product(ChromeDriver driver) {
		select_01st_Product.click();
		Set<String> child1=driver.getWindowHandles();
		Iterator<String> c2=child1.iterator();
		String parent=c2.next();
		String child2=c2.next();
		driver.switchTo().window(child2);
		//System.out.println(select_01st_Product);
	}
	
	public void  reviewDisplayedOrNot() {
		System.out.println(reviewDisplayedOrNot.getText());
		System.out.println(reviewDisplayedOrNot.isDisplayed());
		
	}

	public void priceDispalyedOrNot() {
		System.out.println(priceDispalyedOrNot.getText());
		System.out.println(priceDispalyedOrNot.isDisplayed());
		
	}
	
	public void descripicationDisplayOrNot() {
		System.out.println(descripicationDisplayOrNot.getText());
		System.out.println(descripicationDisplayOrNot.isDisplayed());
		
	}
	

	
	//initialized the element under constructor
	public Price_Review_Description_Visible_Page_07(ChromeDriver driver) {
		 PageFactory.initElements(driver, this);	
	}
	

}
