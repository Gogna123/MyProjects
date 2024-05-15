package Amazon_Source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Update_Quantity_Remove_Item_From_Cart_Page_10 {
	

	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
     WebElement search_field;    
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement firstProduct;
	
	@FindBy(id="quantity")
	WebElement dropDown;
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCart;
	
	@FindBy(xpath="//span[@id='sw-gtc']")
	WebElement goToCart;
	
	@FindBy(name="submit.delete.8489293f-1557-48e6-94f0-c4dedfeda654")
	WebElement deleteProductFromCart;
	
	//create separate methods for each element
	public void search_field() {
		search_field.sendKeys("lakme sunscreen");
		search_field.sendKeys(Keys.ENTER);
	}
	public void firstProduct(ChromeDriver driver) {
		firstProduct.click();
		Set<String> child1=driver.getWindowHandles();
		Iterator<String> c2=child1.iterator();
		String parent=c2.next();
		String child2=c2.next();
		driver.switchTo().window(child2);
	}
	public void  dropDown() {
    Select s1=new Select(dropDown);
    s1.selectByIndex(3);
	}
	
	public void addToCart() {
		addToCart.click();
	}
	
	public void goTocart() {
		goToCart.click();
	}
	
	public void deleteProductFromCart() {
		deleteProductFromCart.click();
	}
	//initialization of elements under constructor
	public Update_Quantity_Remove_Item_From_Cart_Page_10(ChromeDriver driver) {
		 PageFactory.initElements(driver, this);	
	}

}
