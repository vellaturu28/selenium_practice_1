package Selenium_Excercises;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_FormMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhrui\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();

		// checking the return date with radio buttons clicking
		System.out.println(" by default oneway radio button is selected");
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).isDisplayed());

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		System.out.println(" when roundtrip radio button is selected");
		Thread.sleep(3000L);
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).isDisplayed());

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).click();
		driver.findElement(By.xpath("//a[@id='MultiCityModelAlert']")).click();
		System.out.println(" when multicity radio button is selected");
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).isDisplayed());
		Thread.sleep(3000L);

		// check box selecting validation
		System.out.println("-check box validation-");
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"))
				.isSelected());
		Thread.sleep(1000L);
		// getting the count of the radio button group
		System.out.println(driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size());

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		Thread.sleep(2000L);

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000L);

		driver.findElement(By.xpath("//a[@value='JAI']")).click();
		driver.findElement(By.xpath("(//a[@value='UDR'])[2]")).click();

		driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-current-day')]")).click();
		Thread.sleep(3000L);

		//System.out.println(driver.findElements(By.id("ctl00_mainContent_btn_FindFlights")).size());		
		//System.out.println(driver.findElement(By.xpath("//input[@value='Search']")).getSize());
		
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		
		//driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'20')]")).click();
	          
				 driver.close();

	}

}
