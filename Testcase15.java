package Amazon_Test;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Amazon_Source.Without_Login_Reach_Cart_Page_15;

public class Testcase15 {
	
	ChromeDriver driver ;
	@Test
	public void withoutLoginReachTillCartPage() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.amazon.in/");
		
		Without_Login_Reach_Cart_Page_15 w1=new Without_Login_Reach_Cart_Page_15(driver);
		w1.search_Field();
		w1.firstProduct(driver);
		w1.addToCart();
		
		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
		
		
	}


	/*@AfterMethod //AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result){
		//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		if(ITestResult.FAILURE==result.getStatus()){
			try{
				// To create reference of TakesScreenshot
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				// Call method to capture screenshot
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				// Copy files to specific location 
				// result.getName() will return name of test case so that screenshot name will be same as test case name
				FileUtils.copyFile(src, new File("C:\\temp\\"+result.getName()+".png"));
				System.out.println("Successfully captured a screenshot");
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
		}
		driver.quit();
	} */

}
