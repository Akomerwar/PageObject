package Object1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikiBedtimeLoginPage {
	WebDriver driver;
	public WikiBedtimeLoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By Profile = By.xpath("//img[@alt='profile']");
	By MailId = By.xpath("//input[@placeholder='Email Address']");
	By PassWord = By.xpath("//input[@placeholder='Password']");
	By LoginButton = By.xpath("//div[@class='um-login-btn']");
	By LogoutButton = By.xpath("//button[@class='logoutbtn']");

	public void openloginpage(String string1, String string2) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(Profile).click();
		
		driver.findElement(MailId).sendKeys(string1);
		Thread.sleep(5);
		driver.findElement(PassWord).sendKeys(string2);
		Thread.sleep(5);
		driver.findElement(LoginButton).click();
		
		
		
		
	}
	
	

}
