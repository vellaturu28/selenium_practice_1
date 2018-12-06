package Selenium_Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IamnotaROBOT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://spinbot.com/Login");
		driver.manage().window().maximize();
		Thread.sleep(2000L);

		System.out.println(driver.findElements(By.tagName("iframe")).size());

		int number = findframenumber(driver, By.xpath("//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();

		Thread.sleep(2000L);
		int number1 = findframenumber(driver, (By.xpath("//*[@id='recaptcha-verify-button']")));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
		Thread.sleep(3000L);
		driver.quit();
	}

	public static int findframenumber(WebDriver driver, By by) {
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();

		for (i = 0; i < framecount; i++) {
			driver.switchTo().frame(i);
			int count = driver.findElements(by).size();
			if (count > 0) {
				break;
			} else {
				System.out.println("continue looping");
			}
			driver.switchTo().defaultContent();
		}
		driver.switchTo().defaultContent();

		return i;

	}
}
