package Selenium_Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");	
		driver.manage().window().maximize();
		Thread.sleep(2000L);
		Select s = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		s.selectByVisibleText("Books");
		//s.selectByIndex(0);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("harry potter books");
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.close();
		
				
	}

}
