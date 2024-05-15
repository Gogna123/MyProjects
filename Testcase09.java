package Amazon_Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Amazon_Source.Add_Product_To_Cart_Page_09;
import Amazon_Source.Lauch_Quit_Page;
import Amazon_Source.SearchWithFilters_Page_06;

public class Testcase09 extends Lauch_Quit_Page {
	ChromeDriver driver;
	@Test
	public void  Add_Product_To_Cart_Page(){
		driver = (ChromeDriver)super.driver;
		
		 Add_Product_To_Cart_Page_09 a1=new  Add_Product_To_Cart_Page_09 (driver);
		 a1.search_field();
		 a1.thirdProductOnPage(driver);
		 a1.addToCart();
		
		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
		
		
		
	}
	

}
