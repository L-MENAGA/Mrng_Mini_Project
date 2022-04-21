package Selenium_Mrng_Pg;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Class {
	public static void main(String[] ags) {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement Jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(Jobs).build().perform();
		driver.findElement(By.xpath("//a[text()='IT jobs']")).click();
		driver.findElement(By.xpath("//div[text()='Companies']")).click();
		String ParentWindow = driver.getWindowHandle();
		System.out.println("ParentWindow"   +ParentWindow);
		
		
		/*Set<String>  all_Id = driver.getWindowHandles();
		for (String ID : all_Id) {
			String title = driver.switchTo().window(ID).getTitle();
			System.out.println(title);
			
		}
		// switching to child or needed window by using for each, If else
		String Actual_Title ="It Jobs, 25585 It Job Vacancies In April 2022 - Naukri.com";
		for (String ID1 : all_Id) {
			if(driver.switchTo().window(ID1).getTitle().equals(Actual_Title)) {
				continue;
			}
			/*else {
				driver.close();
			}
			
		}*/
		
		//Switching window Using Iterator
		Set<String>  all_Id = driver.getWindowHandles();
	
		Iterator<String> i1 = all_Id.iterator();
		while(i1.hasNext()) {
			String ChildWindow = i1.next();
			if(!ParentWindow.equals(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				System.out.println(driver.switchTo().window(ChildWindow).getTitle());
				driver.close();
			}
			
		}
	// switching to parent window
		driver.switchTo().window(ParentWindow);
	}

}
