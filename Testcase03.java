package Amazon_Test;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Source.Login_Page_With_Right_UN_PWD_Page_02;
import Amazon_Source.Login_Page_With_Wrong_UN_PWD_Page_03;

public class Testcase03 {
	ChromeDriver driver;
	@Test
	public void ableToLoginWithWrongUnPwd() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D150668181581%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104140%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D14593224369516014914%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9145968%26hvtargid%3Dkwd-10544572015%26hydadcr%3D5621_2412643%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		Login_Page_With_Wrong_UN_PWD_Page_03 l1= new Login_Page_With_Wrong_UN_PWD_Page_03(driver);
		 l1.emailphno();
		 l1.continuebtn();
		 l1.pwd();
		 l1.signbtn();
		 
	       if(driver.findElement(By.id("email_username")).isDisplayed()) {
			Assert.assertTrue(true);
		}
		

}
}