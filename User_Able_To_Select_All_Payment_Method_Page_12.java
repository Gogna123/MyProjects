package Amazon_Source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Able_To_Select_All_Payment_Method_Page_12 {
	
WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
     WebElement search_field;   
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement firstProduct;
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCart;
	
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedToBuy;
	
	@FindBy(xpath="(//input[@name='submissionURL'])[2]")
	WebElement selectAddress;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement useThisAddress;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement creditCardRadioBtn;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement netBankingRadioBtn;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement otherUPIApps;
	
	//@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	//WebElement EMIUnavaiable;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement COD;
	
	//create methods for each element
	
	public void search_field() {
		search_field.sendKeys("lakme sunscreen");
		search_field.sendKeys(Keys.ENTER);
	}
	
	public void firstProduct(ChromeDriver driver) {
		firstProduct.click();
		Set<String> child1=driver.getWindowHandles();
		Iterator<String> c2=child1.iterator();
		String parent=c2.next();
		String child2=c2.next();
		driver.switchTo().window(child2);
	}
	
	public void addToCart() {
		addToCart.click();
	}
	
	public void proceedToBuy() {
		proceedToBuy.click();
	}
	
	public void selectAddress() {
		selectAddress.click();
	}
	
	public void useThisAddress() {
		useThisAddress.click();
		
	}
	public void creditCardRadioBtn(ChromeDriver driver) {
		creditCardRadioBtn.click();
		driver.navigate().refresh();
	}
	public void netBankingRadioBtn(ChromeDriver driver) {
		netBankingRadioBtn.click();
		driver.navigate().refresh();
	}
	public void otherUPIApps(ChromeDriver driver) {
		otherUPIApps.click();
		driver.navigate().refresh();
	}
	//public void EMIUnavaiable(ChromeDriver driver) {
		//EMIUnavaiable.click();
		//driver.navigate().refresh();
	//}
	public void COD(ChromeDriver driver) {
		COD.click();
		driver.navigate().refresh();
	}
	
	
	public User_Able_To_Select_All_Payment_Method_Page_12(ChromeDriver driver) {
		 PageFactory.initElements(driver, this);
	}


}
