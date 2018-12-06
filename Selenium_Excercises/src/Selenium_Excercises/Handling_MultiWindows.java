package Selenium_Excercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_MultiWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());

		driver.findElement(By.id("opentab")).click();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		String parentid = it.next();
		String childid = it.next();


		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
		 //driver.switchTo().window(parentid);
		//System.out.println(driver.getTitle());

	}

}
