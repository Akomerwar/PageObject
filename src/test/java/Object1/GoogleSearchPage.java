package Object1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By GooglesearchInput = By.xpath("//textarea[@id='APjFqb']");
	
	
	public void GoogleDataEnter(String string1) {
		driver.findElement(GooglesearchInput).sendKeys(string1);
		
			
	}

}
