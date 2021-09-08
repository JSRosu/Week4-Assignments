package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerySort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Locating and switching to frame
		WebElement frame1 = driver.findElement(By.xpath("//div[@id='content']/iframe"));
		driver.switchTo().frame(frame1);
		
		//1 to 7, 2 to 6, 3 to 5
		WebElement item1 = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[1]"));
		WebElement item2 = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[5]"));
		WebElement item3 = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[2]"));
		WebElement item4 = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[6]"));
		
		//getting Position of Item7
		Point loc7 = item2.getLocation();
		int x = loc7.getX();
		int y = loc7.getY();
	
	
		//getting position of item6
		Point loc6 = item4.getLocation();
		int x2 = loc6.getX();
		int y2 = loc6.getY();
		
		//moving item 1 to item 7 and item 2 to item 6
		Actions move = new Actions(driver);
		move.dragAndDropBy(item1, x, y).perform();
		move.dragAndDropBy(item3, x2, y2).perform();
		
	
	}
	
	
	
	
	
	
	
	
	

}
