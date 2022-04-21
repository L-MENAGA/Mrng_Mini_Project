package Selenium_Mrng_Pg;

import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot  {
	public static void main(String[] ags)throws AWTException {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement Bestsellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		Actions a = (Actions)driver;
	    a.contextClick(Bestsellers).build().perform();
	    
	    	Robot r = new Robot();
	    	
	    	
	    r.keyPress(KeyEvent.VK_DOWN);
	    /*r.keyRelease(KeyEvent.VK_DOWN);
	    
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	    a.contextClick(Mobiles).build().perform();
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	   
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    WebElement CustomerService = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));
	    a.contextClick(CustomerService).build().perform();
	    
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	   
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
		
	    Set<String> ID = driver.getWindowHandles();
	    for (String string : ID) {
	    	String title = driver.switchTo().window(string).getTitle();
	    	System.out.println("ID is" +title);*/
			
		}
	
	
	}
	
}
