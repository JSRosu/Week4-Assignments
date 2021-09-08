package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryResize {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locating the frame and switching
		WebElement frame1 = driver.findElement(By.xpath("//div[@id='content']/iframe"));
		driver.switchTo().frame(frame1);
		
		//locating and resizing
		WebElement resizeBox = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Actions builder = new Actions(driver);
		builder.clickAndHold(resizeBox).moveByOffset(10, 80).perform(); // or dragandDropBy
	}

}
