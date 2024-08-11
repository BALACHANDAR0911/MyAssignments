package week2Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Balachandar");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.name("reg_email__")).sendKeys("balachandar09s11@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("balachandar09s11@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("sbala0911");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select dropdown =new Select(Day);
		dropdown.selectByVisibleText("9");
		
		WebElement Month = driver.findElement(By.id("month"));
		Select dropdown1 = new Select(Month);
		dropdown1.selectByIndex(10);
		
		WebElement Year = driver.findElement(By.id("year"));
		Select dropdown2 = new Select(Year);
		dropdown2.selectByValue("2002");
		
	
		WebElement Radio = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
        Radio.click();
}

		
	}