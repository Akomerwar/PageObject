package Object1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiBedtimeRegistrationPage{
	WebDriver driver;
	
	public WikiBedtimeRegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//img[@alt='profile']") WebElement Profile1;
	@FindBy(xpath = "//div[@class='um-signup-btn']") WebElement Sigupbutton;
	@FindBy(xpath = "//input[@placeholder='Name']") WebElement NameID;
	@FindBy(xpath = "//input[@placeholder='Email Address']") WebElement EmailID;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement Password;
	@FindBy(xpath = "//input[@placeholder='Confirm Password']") WebElement confirmpassword;
	@FindBy(xpath = "//div[@class='um-login-btn']") WebElement Registerbutton;
	
	
	
	
	
	public void ReisgtrationPage(String string1,String string2,String string3, String string4) {
		Profile1.click();
		Sigupbutton.click();
		NameID.sendKeys(string1);
		EmailID.sendKeys(string2);
		Password.sendKeys(string3);
		confirmpassword.sendKeys(string4);
		Registerbutton.click();
	}
	
	
	

}
