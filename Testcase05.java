package Amazon_Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Amazon_Source.Lauch_Quit_Page;
import Amazon_Source.Search_Product_Page_05;

public class Testcase05 extends Lauch_Quit_Page  {
	ChromeDriver driver;
	@Test
	public void ableToSearchProduct() {
		driver = (ChromeDriver)super.driver;
		
	Search_Product_Page_05 s2=new Search_Product_Page_05(driver);
	s2.searchProductShoe();
	
	String title=driver.getTitle();
	
    Assert.assertEquals("Amazon.in : shoes", title);

	}  
}
