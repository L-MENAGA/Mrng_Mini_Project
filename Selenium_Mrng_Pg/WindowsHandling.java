package Selenium_Mrng_Pg;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String Parent = driver.getWindowHandle();
		System.out.println("Parent window Id " +Parent);
		driver.findElement(By.xpath("//div[text()='Jobs']")).click();
		Set<String> all_Windows = driver.getWindowHandles();
		int size = all_Windows.size();
		System.out.println("Total Window"  +size);
		ArrayList<String> a = new ArrayList<>(all_Windows);
		driver.switchTo().window(a.get(1));
		driver.close();
		driver.switchTo().window(a.get(0));
		System.out.println("Parent Window Title"  +driver.getTitle());
		
		
		
		
		
		
		
		
		/*for (String child : all_Windows) {
			if(!Parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.linkText("All Jobs")).click();
				Thread.sleep(3000);
				driver.close();
			}
			
		}
		driver.switchTo().window(Parent);
		System.out.println("Parent Window Title"  +driver.getTitle());*/
	}
	

}
