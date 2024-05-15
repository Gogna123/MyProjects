package Amazon_Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import Amazon_Source.Registeration_Page_01;


public class Testcase01 {
	ChromeDriver driver;
	@Test
	public void ableToDoRegisteration() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ascsubtag%3D_k_Cj0KCQjwudexBhDKARIsAI-GWYX_OSvhxC-sAsEvrFrviGmnDXlgLbc57rNzzvqLHjV3V20wOi5uwkIaAmGCEALw_wcB_k_%26tag%3Dgoogmantxtmob170-21%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Registeration_Page_01 r1=new Registeration_Page_01(driver);
		r1.name();
		r1.phno();
		r1.pwd();
		r1.continuebtn();
		
		String title=driver.getTitle();
		
          Assert.assertEquals("Authentication required", title);
	}

}
