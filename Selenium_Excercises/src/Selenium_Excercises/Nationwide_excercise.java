package Selenium_Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nationwide_excercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nationwide.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='Car_Front_View-outline']")).click();
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@id='homeowner']"))).click().sendKeys("94583")
				.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
		driver.close();

	}

}
