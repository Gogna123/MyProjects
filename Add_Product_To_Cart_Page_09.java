package Amazon_Source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Product_To_Cart_Page_09 {

	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
     WebElement search_field;  //sendkeys."handbag"  srch1.sendKeys(Keys.ARROW_DOWN);
	                            //srch1.sendKeys(Keys.ARROW_DOWN);
	                                 //srch1.sendKeys(Keys.ENTER);
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement thirdProductOnPage; // .click   //get control on child window
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCart;  //.click
	
	
	//create methods for each components
	
	public void search_field() {
		search_field.sendKeys("handbag");
		search_field.sendKeys(Keys.ARROW_DOWN);
		search_field.sendKeys(Keys.ARROW_DOWN);
		search_field.sendKeys(Keys.ENTER);
	}
	public void thirdProductOnPage(ChromeDriver driver) {
		thirdProductOnPage.click();
		Set<String> child1=driver.getWindowHandles();
		Iterator<String> c2=child1.iterator();
		String parent=c2.next();
		String child2=c2.next();
		driver.switchTo().window(child2);
	}
	public void addToCart() {
		addToCart.click();
	}
	//initialized the element under constructor
	public Add_Product_To_Cart_Page_09(ChromeDriver driver) {
		 PageFactory.initElements(driver, this);	
	}
	

}
