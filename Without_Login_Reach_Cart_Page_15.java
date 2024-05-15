package Amazon_Source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Without_Login_Reach_Cart_Page_15 {
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_Field;
	
	@FindBy(xpath="(//a[.='+51 more colors'])[1]")
	WebElement firstProduct;
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCart;
	
	public void search_Field() {
		search_Field.sendKeys("nail paint");
		search_Field.sendKeys(Keys.ENTER);
		
	}
	public void firstProduct(ChromeDriver driver) {
		firstProduct.click();
		Set<String> child1=driver.getWindowHandles();
		Iterator<String> c2=child1.iterator();
		String parent=c2.next();
		//String child2=c2.next();
		driver.switchTo().window(parent);
	}
	public void addToCart() throws InterruptedException {
		Thread.sleep(2000);
		addToCart.click();
	}
	
	public Without_Login_Reach_Cart_Page_15(ChromeDriver driver) {
		PageFactory.initElements(driver,this );
	}

}
