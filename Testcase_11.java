package Amazon_Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Source.Full_Checkout_Process_Page_11;
import Amazon_Source.Lauch_Quit_Page;

public class Testcase_11 extends Lauch_Quit_Page {
	ChromeDriver driver;
	
	@Test
	public void endToendProcess() throws InterruptedException {
		driver = (ChromeDriver)super.driver;
		
		Full_Checkout_Process_Page_11 f1=new Full_Checkout_Process_Page_11(driver);
		
		f1.search_field();
		f1.firstProduct(driver);
		f1.addToCart();
		f1.proceedToBuy();
		f1.selectAddress();
		f1.useThisAddress();
		f1.useThisPaymentMethod();
		
	}

}

