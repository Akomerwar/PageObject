package TestScenarios;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object1.WikiBedtimeLoginPage;
import Object1.ForgotPasswordPage;
import Object1.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testscase1 {
	WebDriver driver;
	
	@BeforeMethod
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		GoogleSearchPage searchInput = new GoogleSearchPage(driver);
		searchInput.GoogleDataEnter("www.wikibedtimestories.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			
	}
	
	
	
	@Test
	public void Test1() throws InterruptedException {
		WikiBedtimeLoginPage googlein = new WikiBedtimeLoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		googlein.openloginpage("anirudhakomerwar@gmail.com","1234567890");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	@Test
	public void Test2() throws InterruptedException {
		ForgotPasswordPage FPP = new ForgotPasswordPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FPP.forgotpasswordchange("anirudhakomerwar@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	
	
	@AfterMethod
	public void aftertest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
		
	}

	
}
