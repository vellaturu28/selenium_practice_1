package Selenium_Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe ");
		// WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Madhrui\\Downloads\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();

		// from and to arrival destination dynamic dropdown

		// driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		// driver.findElement(By.xpath("//a[@value='JAI']")).click();
		// driver.findElement(By.xpath("(//a[@value='UDR'])[2]")).click();

		// passengers dropdown
		System.out.println(driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size());
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);		

		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		driver.findElement(By.cssSelector("#hrefIncChd")).click();
		driver.findElement(By.cssSelector("#hrefIncInf")).click();
		Thread.sleep(3000);		

		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

		
		
		driver.quit();

	}

}
