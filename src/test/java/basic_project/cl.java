package basic_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement id = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		id.sendKeys("lotus");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
