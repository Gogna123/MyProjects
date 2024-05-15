package Amazon_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Source.Lauch_Quit_Page;
import Amazon_Source.User_Able_To_Select_All_Payment_Method_Page_12;

public class Testcase12 extends Lauch_Quit_Page {
	ChromeDriver driver;
	@Test
	
	public void paymentMethodableToSelectAll()  {
		driver = (ChromeDriver)super.driver;
		
		User_Able_To_Select_All_Payment_Method_Page_12 u1=new User_Able_To_Select_All_Payment_Method_Page_12(driver);	
		
		u1.search_field();
		u1.firstProduct(driver);
		u1.addToCart();
		u1.proceedToBuy();
		u1.selectAddress();
		u1.useThisAddress();
		
		
		u1.creditCardRadioBtn(driver);
		u1.netBankingRadioBtn(driver);
	    u1.otherUPIApps(driver);
	   // u1.EMIUnavaiable(driver);
	    u1.COD(driver);
	}

}
