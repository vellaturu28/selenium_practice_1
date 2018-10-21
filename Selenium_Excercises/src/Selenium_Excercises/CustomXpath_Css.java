package Selenium_Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath_Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		/*
		 * by using amazon website xpaths driver.get("https://www.amazon.com");
		 * System.out.println(driver.getTitle());
		 * driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).
		 * sendKeys("books best sellers");
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 * driver.close();
		 */

		// by using facebook website xpaths

		/*
		 * driver.get("https://www.facebook.com");
		 * System.out.println(driver.getTitle());
		 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email_id@gmail.com");
		 * driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 */

		/* by using facebook website css selectors */
		// driver.get("https://www.facebook.com");
		// driver.findElement(By.cssSelector("#email")).sendKeys("email_id@gmail.com");
		// driver.findElement(By.cssSelector("#pass")).sendKeys("passwords");
		// driver.findElement(By.cssSelector("#u_0_2")).click();
		// driver.close();

		// by usig facebook website css selectors custom css
		driver.get("https://login.xfinity.com/login");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("*[name='user']")).sendKeys("email_id@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("passwords");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.close();

	}

}
