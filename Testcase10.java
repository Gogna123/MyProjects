package Amazon_Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Source.Lauch_Quit_Page;
import Amazon_Source.Update_Quantity_Remove_Item_From_Cart_Page_10;

public class Testcase10 extends Lauch_Quit_Page{
	ChromeDriver driver;
	
	@Test
	public void ableToUpdateProductQuantity() {
		driver = (ChromeDriver)super.driver;
		
		Update_Quantity_Remove_Item_From_Cart_Page_10 u1= new Update_Quantity_Remove_Item_From_Cart_Page_10(driver);
		u1.search_field();
		u1.firstProduct(driver);
		u1.dropDown();
		u1.addToCart();
		u1.goTocart();
		u1.deleteProductFromCart();
		
	}
}
