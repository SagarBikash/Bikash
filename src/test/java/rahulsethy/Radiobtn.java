package rahulsethy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radiobtn {
@Test
public void M2() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	List <WebElement> rdo=driver.findElements(By.className("radioButton"));
	for(WebElement radio1:rdo) {
		radio1.click();
		Thread.sleep(3000);

	}
	
	driver.close();
}
}
