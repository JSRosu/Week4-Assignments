package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mouseHover = driver.findElement(By.className("btnMouse"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(mouseHover).perform();
		
		WebElement link1 = driver.findElement(By.xpath("//a[text()='Selenium']"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(link1).perform();
		String text = link1.getText();
		System.out.println(text);
		
		WebElement link2 = driver.findElement(By.xpath("//a[text()='RPA']"));
		Actions builder2 = new Actions(driver);
		builder2.moveToElement(link2).perform();
		String text1 = link2.getText();
		System.out.println(text1);
		
		
		WebElement link3 = driver.findElement(By.xpath("//a[text()='WebServices']"));
		Actions builder3 = new Actions(driver);
		builder3.moveToElement(link3).perform();
		String text2 = link3.getText();
		System.out.println(text2);
		
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		 
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text3 = alert.getText();
		System.out.println(" alert text:" + text3); 
		alert.accept();  
		
		
		WebElement release = driver.findElement(By.className("wp-heading"));
		Actions builder4 = new Actions(driver);
		builder4.moveToElement(release).release().perform();
}
		
	}


