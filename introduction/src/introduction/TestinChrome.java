package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestinChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
// driver objects based on browsers
		
		
		// x driver = new x();
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhrui\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
					
		driver.get("https://www.udemy.com/");
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
