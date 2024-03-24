package Object1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
	WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By MailId = By.xpath("//input[@placeholder='Email Address']");
	By PasswordForgot = By.xpath("//div[@class='forgot-password']");
	By OTPButton = By.xpath("//div[@class='um-sendotp-btn']");
	By Profile = By.xpath("//img[@alt='profile']");
	By otp1 = By.xpath("//div[@class='um-otp-emailbox1']//input[@type='text']");
	By otp2 = By.xpath("//div[@class='um-otp-emailbox2']//input[@type='text']");
	By otp3 = By.xpath("//div[@class='um-otp-emailbox3']//input[@type='text']");
	By otp4 = By.xpath("//div[@class='um-otp-emailbox4']//input[@type='text']");
	By otpsubmit = By.xpath("//div[@class=' um-sendotp-disable']");
	
	
	
	public void forgotpasswordchange(String string2) {
		driver.findElement(Profile).click();
		driver.findElement(MailId).sendKeys(string2);
		driver.findElement(PasswordForgot).click();
		driver.findElement(MailId).sendKeys(string2);
		driver.findElement(OTPButton).click();
	}
	

}
