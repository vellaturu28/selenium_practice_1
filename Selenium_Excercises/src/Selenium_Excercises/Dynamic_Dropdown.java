package Selenium_Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");

		// from and to arrival destination dynamic dropdown

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='JAI']")).click();
		driver.findElement(By.xpath("(//a[@value='UDR'])[2]")).click();

		// passengers dropdown

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

	}

}
