package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerySelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locating and switching to frame
		WebElement frame1 = driver.findElement(By.xpath("//div[@id = 'content']/iframe"));
		driver.switchTo().frame(frame1);
		
		//selecting the items 
		WebElement firstItem = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement lastItem = driver.findElement(By.xpath("//li[text()='Item 6']"));
		
		Actions select = new Actions(driver);
		select.clickAndHold(firstItem).moveToElement(lastItem).release().perform();
	
	}

}
