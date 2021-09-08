package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSelectable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement firstItem = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement lastItem = driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		Actions builder = new Actions(driver);
		
		builder.clickAndHold(firstItem).moveToElement(lastItem).release().perform();
		
		

	}

}
