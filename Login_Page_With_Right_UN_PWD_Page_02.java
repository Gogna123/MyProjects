package Amazon_Source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_With_Right_UN_PWD_Page_02 {
	@FindBy(id="ap_email")
	WebElement email_username;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signInBtn;
	
	//methods for each element
	public void emailphno() {
		email_username.sendKeys("+918921363164");
	}
	public void continuebtn() {
		continuebutton.click();
	}
	public void pwd() {
		password.sendKeys("Sangeeta@123");
	}
	public void signbtn() {
		signInBtn.click();
	}
	
	//initializing the elements inside the constructors
	public Login_Page_With_Right_UN_PWD_Page_02(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

}
