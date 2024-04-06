package rahulsethy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	@Test
	public void m2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement drpdwn=driver.findElement(By.id("dropdown-class-example"));
		Select drp1=new Select (drpdwn);
		drp1.selectByIndex(02);
		Thread.sleep(3000);
		driver.close();
	}
}
