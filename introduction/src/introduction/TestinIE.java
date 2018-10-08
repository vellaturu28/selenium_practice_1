package introduction;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestinIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//selenium  test case
		
		
		
		
System.setProperty("webdriver.ie.driver","C:\\Users\\Madhrui\\Downloads\\MicrosoftWebDriver.exe");
		
		WebDriver driver=new InternetExplorerDriver();
					
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		
		
	}

}
