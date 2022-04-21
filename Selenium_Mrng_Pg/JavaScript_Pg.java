package Selenium_Mrng_Pg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Pg {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//To sendkeys
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value=s'Abc@gmail.com';");
		
		// To Click
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();", Login);
		
		Thread.sleep(3000);
		//To Refresh
		js.executeScript("history.go(0)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement page_End = driver.findElement(By.xpath("//a[text()='Fulfilment by Amazon']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", page_End);
		WebElement  Today_Deals = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
		js.executeScript("arguments[0].scrollIntoView()", Today_Deals);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-2000);");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,3000);");*/
	
	
	}

}
