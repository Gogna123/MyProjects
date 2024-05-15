package Amazon_Source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Registeration_Page_01  {
	//WebDriver driver;
	@FindBy(id="ap_customer_name")
	WebElement firstAndLastName;
	
	@FindBy(id="ap_phone_number")
	WebElement mobileNumber;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement continueButton;

	//separate methods for all elements
	
	public void name() {
		firstAndLastName.sendKeys("Sangeeta Gogna");
	}
	
	public void phno() {
		mobileNumber.sendKeys("8921363164");
	}
	
	public void pwd() {
		password.sendKeys("Sangeeta@123");
	}
	
	public void continuebtn() {
		continueButton.click();
	}
	
	//initializing the elements inside the constructors
	public Registeration_Page_01(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}