package Object1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WikiBedtimeLoginPage {
	WebDriver driver;
	public WikiBedtimeLoginPage(WebDriver driver) throws FileNotFoundException, InterruptedException, IOException {
		this.driver = driver;	
			
	}
	@FindBy(xpath = "//img[@alt='profile']") WebElement Profile;
	@FindBy(xpath = "//input[@placeholder='Email Address']") WebElement MailId;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement PassWord;
	@FindBy(xpath = "//div[@class='um-login-btn']") WebElement LoginButton;
	@FindBy(xpath = "//button[@class='logoutbtn']") WebElement LogoutButton;
	
	
	
	public void  openloginpage( String string1 ,String string2) throws InterruptedException {
		
		Profile.click();
		MailId.sendKeys(string1);
		Thread.sleep(5);
		PassWord.sendKeys(string2);
		Thread.sleep(5);
		LoginButton.click();
		
	}


	
	

	
}
