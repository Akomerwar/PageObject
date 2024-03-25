package Object1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAccountPage {
	
    WebDriver driver;
	
	public DeleteAccountPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	By Profile1 = By.xpath("//img[@alt='profile']");
	By EditData = By.xpath("//img[@alt='Editsquare']");
	By NameEdit = By.xpath("//input[@placeholder='Enter name']");
	By Bio = By.xpath("//textarea[@placeholder='Short bio']");
	By SaveChanges= By.xpath("//div[@class='um-profile-savebtn']");
	By DeleteAccount = By.xpath("//div[@class='um-deletebtn']");
	By DeleteConfirmation = By.xpath("//button[normalize-space()='Delete']");
	
	
	
	public void ReisgtrationPage(String string1,String string2) {
		driver.findElement(Profile1).click();
		driver.findElement(EditData).click();
		driver.findElement(NameEdit).sendKeys(string1);
		driver.findElement(Bio).sendKeys(string2);
		driver.findElement(SaveChanges).click();
		
	}
	
	public void DeleteAccount() {
		driver.findElement(Profile1).click();
		driver.findElement(EditData).click();
		driver.findElement(DeleteAccount).click();
		driver.findElement(DeleteConfirmation).click();
	}
	

}
