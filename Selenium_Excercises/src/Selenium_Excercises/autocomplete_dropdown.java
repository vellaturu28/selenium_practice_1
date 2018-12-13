package Selenium_Excercises;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mvellaturu\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

		System.out.print(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getAttribute("value"));
		Thread.sleep(3000);

		/*
		 * System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']"
		 * )).getText());
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver; String script =
		 * "return document.getElementById(\"fromPlaceName\").value;";
		 * 
		 * String text = (String) (js).executeScript(script); System.out.println(text);
		 * 
		 * int i = 0;
		 * 
		 * while (!text.equalsIgnoreCase("BENGALURU AIRPRT")) { i++;
		 * driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.
		 * DOWN);
		 * 
		 * text = (String) js.executeScript(script); System.out.println(text); if (i >
		 * 10) { break; } Thread.sleep(2000); }
		 * 
		 * if (i > 10) { System.out.println("Element not found"); } else {
		 * System.out.println("Element  found"); }
		 */
		driver.findElement(By.xpath("//input[@id='toPlaceName']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
