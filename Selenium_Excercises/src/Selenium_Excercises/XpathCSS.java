package Selenium_Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http:\\www.facebook.com");
		System.out.println(driver.getTitle());

		// driver.findElement(By.xpath("//*[@id='email']")).sendKeys("xpath@gmail.com");
		// driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
		// driver.findElement(By.xpath("//*[@id='u_0_2']")).click();

		// driver.findElement(By.id("u_0_2")).click();
		// driver.close();

		driver.findElement(By.cssSelector("#email")).sendKeys("csspath@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("password");
		driver.findElement(By.cssSelector("#u_0_2")).click();

	}
}