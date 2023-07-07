package basic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {

	public static WebDriver driver;

	final static Logger logger = LogManager.getLogger(FirstClass.class);

	@BeforeTest
	public void setupBrowser() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		logger.info("Browser is setup successfully");
	}

	@Test
	public void launchURL() {
		try {
			driver.get("https://demoqa.com/");
		} catch (TimeoutException e) {
			logger.info("URL is not loading seems timeout issue",e);
		}
		logger.info("URL is entered successfully");
	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
		logger.info("Browser session is closed");
	}

}
