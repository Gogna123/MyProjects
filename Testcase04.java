package Amazon_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Amazon_Source.Check_User_Can_Edit_Profile_Page_04;
import Amazon_Source.Lauch_Quit_Page;

public class Testcase04  extends Lauch_Quit_Page 
{
	ChromeDriver driver;
	@Test
	public void ableToDoEdit() {
		driver = (ChromeDriver)super.driver;
		//driver= new ChromeDriver();
		
//		//driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		WebElement ph=driver.findElement(By.id("ap_email"));
//        ph.sendKeys("+918921363164");
//      //  Thread.sleep(1000);
//        WebElement continu=driver.findElement(By.id("continue"));
//        continu.click();
//       WebElement passwrd= driver.findElement(By.id("ap_password"));
//       passwrd.sendKeys("Sangeeta@123");
//      WebElement signin= driver.findElement(By.id("signInSubmit"));
//      signin.click();
      
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		
		Check_User_Can_Edit_Profile_Page_04 c1=new Check_User_Can_Edit_Profile_Page_04(driver);
		c1.hoveroveryouraccount();
		c1.yourAccount();
		c1.login_Security();
		c1.editbtn();
		c1.newName();
		c1.saveChangesBtn();
		
	}

}
