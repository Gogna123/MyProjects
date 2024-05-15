package Amazon_Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Source.Lauch_Quit_Page;
import Amazon_Source.Relevence_By_Ratings_Price_Page_08;

public class Testcase08 extends Lauch_Quit_Page {
	ChromeDriver driver;
	
	@Test
	public void ableToRelevenceByRating() {
		driver = (ChromeDriver)super.driver;
		
		Relevence_By_Ratings_Price_Page_08 r1=new Relevence_By_Ratings_Price_Page_08(driver);
		r1.search_field();
		r1.fourStar();
		r1.brand();
		
	}

}
