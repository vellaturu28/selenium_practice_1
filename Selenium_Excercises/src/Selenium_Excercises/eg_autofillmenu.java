package Selenium_Excercises;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class eg_autofillmenu {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mvellaturu\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[contains(@id,'sfrom')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'sfrom')]")).sendKeys("Pun");
		Thread.sleep(3000);

		// WebDriverWait objwait = new WebDriverWait(driver, 10);

		// objwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
		// By.xpath("//ul[@id='ui-id-1']//descendant::li[contains(@aria-label,'Search
		// Result')]")));

		int count = driver
				.findElements(By.xpath("//ul[@id='ui-id-1']//descendant::li[contains(@aria-label,'Search Result')]"))
				.size();

		System.out.println(count);

		for (int i = 0; i < count; i++) {
			String s = driver
					.findElements(
							By.xpath("//ul[@id='ui-id-1']//descendant::li[contains(@aria-label,'Search Result')]"))
					.get(i).getAttribute("value");
//aria-label
			if (s.contains("Pune")) {
				driver.findElements(
						By.xpath("//ul[@id='ui-id-1']//descendant::li[contains(@aria-label,'Search Result')]")).get(i)
						.click();
			}

		}

		driver.findElement(By.xpath("//input[@id='hp-widget__sTo']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}