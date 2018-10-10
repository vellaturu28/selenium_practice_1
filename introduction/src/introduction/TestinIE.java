package introduction;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestinIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // test case 

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Madhrui\\Downloads\\MicrosoftWebDriver.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
		
		// System.out.println(driver.getPageSource());
		 driver.get("https://www.w3schools.com");
		 driver.navigate().back();
		 driver.navigate().forward();
		 System.out.println(driver.getTitle());
		 driver.quit();
		 
	}

}
