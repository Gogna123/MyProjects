package Amazon_Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Source.Lauch_Quit_Page;
import Amazon_Source.User_Able_To_Apply_For_Coupon_Page_13;

public class Testcase13 extends Lauch_Quit_Page {
	ChromeDriver driver;
	
	@Test
	public void verifyCouponAppliedOnPurchase() {
		driver = (ChromeDriver)super.driver;
		
		User_Able_To_Apply_For_Coupon_Page_13 u1=new User_Able_To_Apply_For_Coupon_Page_13(driver);
		u1.search_field();
		u1.firstProduct(driver);
		u1.addToCart();
		u1.proceedToBuy();
		u1.selectAddress();
		u1.useThisAddress();
		u1.promocode();
		u1.appliedbtn();
		
	}
}
