package fi.labexam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Omsai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public void navigate() throws InterruptedException {
		driver.navigate().to("https://www.flipkart.com/");

	}

	public void opengmail() throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']"))
				.sendKeys("maheshlanghe1998@gmail.com");

		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']"))
				.sendKeys("mahesh1998");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.close();

	}

	public static void main(String[] args) throws InterruptedException {
		App ob = new App();
		ob.launchBrowser();
		ob.navigate();
		ob.opengmail();

	}
}