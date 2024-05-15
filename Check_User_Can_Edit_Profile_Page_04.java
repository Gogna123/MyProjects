package Amazon_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_User_Can_Edit_Profile_Page_04 {
	WebDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement accountList;
	
	@FindBy(xpath="//span[.='Your Account']")
	WebElement yourAccount;
	
	@FindBy(xpath="//span[.='Edit login, name, and mobile number']")
	WebElement login_Security;
	
	@FindBy(xpath="(//a[.='Edit'])[1]")
	WebElement editbtn;
	
	@FindBy(id="ap_customer_name")
	WebElement newName;
	
	@FindBy(id="cnep_1C_submit_button")
	WebElement saveChangesBtn;
	
	//separate methods for all elements
	
	public void hoveroveryouraccount() {
		Actions a1=new Actions(driver);
		a1.moveToElement(accountList).perform();
		//yourAccount.click();
		}
	public void yourAccount() {
		yourAccount.click();
	}
	public void login_Security() {
		login_Security.click();
	}
	public void editbtn() {
		editbtn.click();
	}
	public void newName() {
		newName.sendKeys(" Gogna");
	}
	public void saveChangesBtn() {
		saveChangesBtn.click();
	}
	
	//initializing the elements inside the constructors
	public Check_User_Can_Edit_Profile_Page_04 (ChromeDriver _driver) {
		driver = _driver;
		PageFactory.initElements(driver, this);
	}


}
