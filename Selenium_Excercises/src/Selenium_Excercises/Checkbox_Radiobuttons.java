package Selenium_Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
				
		// checkbox selecting
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());	
		Thread.sleep(2000L);
		
		System.out.println(driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_friendsandfamily']")).getText());

		//radio button selecting
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='MultiCityModelAlert']")).click();	
		
		driver.close();

	}
	

}
