package Selenium_Excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//label[@for='honda']")).getText());

		String optionlabel = driver.findElement(By.xpath("//label[@for='honda']")).getText();
		Select s = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		s.selectByVisibleText(optionlabel);

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(optionlabel);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText().contains(optionlabel));
		System.out.println(driver.switchTo().alert().getText());

		String alerttext = driver.switchTo().alert().getText();

		if (alerttext.contains(optionlabel)) {
			System.out.println("Text is present in alert box ");
		} else

			System.out.println("There is no text in alert box");

		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();

	}

}
