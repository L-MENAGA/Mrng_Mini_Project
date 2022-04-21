package Selenium_Mrng_Pg;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class link {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe" );
		ChromeOptions ch = new ChromeOptions();
		ch.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Create a Page")).click();
		driver.findElement(By.partialLinkText("Create a")).click();
		}
}