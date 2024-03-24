package Object1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By GooglesearchInput = By.xpath("//textarea[@id='APjFqb']");
	By OptionSelector = By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']");
	By option = By.xpath("//h3[contains(text(),'Wiki Bedtime Stories: Bedtime Short Stories for Ki')]");
	
	public void GoogleDataEnter(String string1) {
		driver.findElement(GooglesearchInput).sendKeys(string1);
		driver.findElement(OptionSelector).click();
		driver.findElement(option).click();
			
	}

}
