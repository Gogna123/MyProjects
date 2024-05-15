package Amazon_Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Source.Lauch_Quit_Page;
import Amazon_Source.SearchWithFilters_Page_06;

public class Testcase06 extends Lauch_Quit_Page {
	ChromeDriver driver;
	@Test
	public void ableToSearchProductWithFilter(){
		driver = (ChromeDriver)super.driver;
		
		SearchWithFilters_Page_06 s1=new SearchWithFilters_Page_06 (driver);
		s1.search_With_Filter();
		s1.chooseCategory();
		s1.priceCategory();
		
		
		
	}

}
