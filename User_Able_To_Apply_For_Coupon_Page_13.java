package Amazon_Source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Able_To_Apply_For_Coupon_Page_13 {
	
WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
     WebElement search_field;   
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement firstProduct;
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCart;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedToBuy;
	
	@FindBy(xpath="(//input[@name='submissionURL'])[2]")
	WebElement selectAddress;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement useThisAddress;
	
	@FindBy(name="ppw-claimCode")
	WebElement promocode;
	
	@FindBy(name="ppw-claimCodeApplyPressed")
	WebElement appliedbtn;
	
	//create methods for each element
	
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
		
		public void addToCart() {
			addToCart.click();
		}
		
		public void proceedToBuy() {
			proceedToBuy.click();
		}
		
		public void selectAddress() {
			selectAddress.click();
		}
		
		public void useThisAddress() {
			useThisAddress.click();
			
		}
		public void promocode() {
			promocode.sendKeys("*******");
		}
	public void appliedbtn() {
		appliedbtn.click();
	}
	
	//constructor
	
   public User_Able_To_Apply_For_Coupon_Page_13(ChromeDriver driver) {
	   PageFactory.initElements(driver, this);
   }
}
