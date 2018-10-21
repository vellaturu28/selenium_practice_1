package Selenium_Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocat_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Home decor");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.linkText("Bedroom")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
		driver.findElement(By.className("nav-input")).click();
		//driver.findElement(By.linkText("Amazon Home")).click();
		driver.findElement(By.xpath("//*[@id='nav-subnav']/a[1]/span")).click();		
		driver.findElement(By.linkText("Shop by Room")).click();		
		driver.close();

	}
}
