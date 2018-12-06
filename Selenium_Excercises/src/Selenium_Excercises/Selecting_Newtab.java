package Selenium_Excercises;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Newtab {

	public static <string> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		String Newtab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.xpath("//a[@id='nav-your-amazon']")).sendKeys(Newtab);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-a'][contains(text(),'12 Days of Deals')]")).sendKeys(Newtab);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@tabindex='49']")).sendKeys(Newtab);
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		String parentid = it.next();
		String childid1=it.next();
		String childid2=it.next();
		String childid3=it.next();
	
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.switchTo().window(childid1);
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);

		driver.switchTo().window(childid2);
		System.out.println(driver.getTitle());

		driver.switchTo().window(childid3);
		System.out.println(driver.getTitle());


		driver.quit();

			}

}
