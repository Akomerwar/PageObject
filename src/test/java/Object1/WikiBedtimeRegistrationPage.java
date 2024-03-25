package Object1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikiBedtimeRegistrationPage{
	WebDriver driver;
	
	public WikiBedtimeRegistrationPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By Profile = By.xpath("//img[@alt='profile']");
	By Sigupbutton = By.xpath("//div[@class='um-signup-btn']");
	By NameID = By.xpath("//input[@placeholder='Name']");
	By EmailID = By.xpath("//input[@placeholder='Email Address']");
	By Password = By.xpath("//input[@placeholder='Password']");
	By confirmpassword = By.xpath("//input[@placeholder='Confirm Password']");
	By Registerbutton = By.xpath("//div[@class='um-login-btn']");
	
	
	
	public void ReisgtrationPage(String string1,String string2,String string3, String string4) {
		driver.findElement(Profile).click();
		driver.findElement(Sigupbutton).click();
		driver.findElement(NameID).sendKeys(string1);
		driver.findElement(EmailID).sendKeys(string2);
		driver.findElement(Password).sendKeys(string3);
		driver.findElement(confirmpassword).sendKeys(string4);
		driver.findElement(Registerbutton).click();
	}
	
	
	

}
