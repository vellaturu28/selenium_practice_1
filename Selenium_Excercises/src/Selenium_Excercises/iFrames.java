package Selenium_Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com");
		driver.manage().window().maximize();

		Thread.sleep(4000);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.findElement(By.xpath("//button[contains(text(),'NO THANKS')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Practice')]")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		Thread.sleep(3000);

		driver.findElement(By.linkText("VIDEOS")).click();
		Thread.sleep(3000);

		driver.close();
	}

}
