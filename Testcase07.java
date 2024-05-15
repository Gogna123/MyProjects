package Amazon_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Amazon_Source.Lauch_Quit_Page;
import Amazon_Source.Price_Review_Description_Visible_Page_07;

public class Testcase07 extends Lauch_Quit_Page {
	ChromeDriver driver;
	@Test
	public void Price_Review_Description_Able_To_See() {
		driver = (ChromeDriver)super.driver;
		
		 Price_Review_Description_Visible_Page_07 p1=new  Price_Review_Description_Visible_Page_07(driver);
		 p1.search_field();
		 p1.select_01_Product(driver);
		 p1.reviewDisplayedOrNot();
		 p1.descripicationDisplayOrNot();
		 p1.priceDispalyedOrNot();
		 
		 
		// System.out.println(driver.findElement(By.id("productTitle")));
		 
		 //if(driver.findElement(By.id("productTitle")).isDisplayed()) {
			//	Assert.assertTrue(true);
			//}
		 
		 
	}

}
