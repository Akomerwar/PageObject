package TestScenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Object1.WikiBedtimeLoginPage;
import Object1.WikiBedtimeRegistrationPage;
import Object1.DeleteAccountPage;
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
		searchInput.GoogleDataEnter("https://www.wikibedtimestories.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			
	}
	
	
	
	@Test
	public void Test1() throws InterruptedException, IOException, IOException {
		WikiBedtimeLoginPage googlein = new WikiBedtimeLoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("..1");
//		XSSFWorkbook work = new XSSFWorkbook(new FileInputStream("C:\\Users\\ANIRUDHA\\OneDrive\\Desktop\\New folder\\TryExcel\\src\\main\\java\\ReadExcelTry\\TryExcel\\Book1.xlsx"));
//		XSSFSheet Sheet1 = work.getSheet("Sheet1");2
//		FileInputStream file = new FileInputStream( "C:\\SELWO\\Project1\\src\\main\\resource\\data.xlsx");
		FileInputStream file = new FileInputStream("src\\main\\resource\\data.xlsx");
		System.out.println("..2");
		XSSFWorkbook work = new XSSFWorkbook(file); 
		System.out.println("..3");
		XSSFSheet Sheet = work.getSheet("Sheet1");
        XSSFRow row = Sheet.getRow(0);			
        String string1 = row.getCell(0).getStringCellValue();
		String string2 = row.getCell(1).getStringCellValue();
		googlein.openloginpage(string1,string2);
		work.close();
		file.close();
			
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	@Test
	public void Test2() throws InterruptedException {
		ForgotPasswordPage FPP = new ForgotPasswordPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FPP.forgotpasswordchange("anirudhakomerwar@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	@Test
	public void Test3() {
		WikiBedtimeRegistrationPage RPP = new WikiBedtimeRegistrationPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		RPP.ReisgtrationPage("Anirudha", "xxxxxxxx", "12345678", "12345678");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	@Test
	public void Test4() throws InterruptedException, FileNotFoundException, IOException {
		WikiBedtimeLoginPage googlein1 = new WikiBedtimeLoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String file = "C:\\SELWO\\Project1\\src\\main\\resource\\data.xlsx";
		XSSFWorkbook work = new XSSFWorkbook(new FileInputStream(file));
		XSSFSheet Sheet = work.getSheet("sheet1");
		XSSFRow row = Sheet.getRow(0);
		String string1 = row.getCell(0).getStringCellValue();
		String string2 = row.getCell(1).getStringCellValue();
		googlein1.openloginpage(string1,string2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		DeleteAccountPage DAP = new DeleteAccountPage(driver);
		DAP.ReisgtrationPage("Hello", "I am Engineer");
		DAP.DeleteAccount();
		
		
	}
	

	@AfterMethod
	public void aftertest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
		
	}

	
}
