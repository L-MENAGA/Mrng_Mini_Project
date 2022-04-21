package Selenium_Mrng_Pg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	
	public static void main(String[] ags) {
		System.setProperty("webdriver.chrom.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_PG\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("*           To Get ALL DATA                 *");
		List<WebElement> all_Data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement webElement : all_Data) {
			String text = webElement.getText();
			System.out.println(text);
			}
		
		
		System.out.println("*                   To Get Row Data     *");
		List<WebElement> Row_DATA = driver.findElements(By.xpath("//table/tbody/tr[4]/td"));
		for (WebElement row : Row_DATA) {
			String text = row.getText();
			System.out.println(text);
		}
		
		System.out.println("*                    To Get COlumn Data         *");
		List<WebElement> column_DATA = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement column : column_DATA) {
			String text = column.getText();
			System.out.println(text);
			
		}
		
		System.out.println("*             To Get Particular Data              *");
		WebElement Particular = driver.findElement(By.xpath("//table/tbody/tr[6]/td[1]"));
		System.out.println(Particular.getText());
		
	
}
}