package week2Day1;

	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CreateLead {

		public static void main(String[] args) {
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://leaftaps.com/opentaps/control/main");

			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Balachandar S");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SELENIUM");
			driver.findElement(By.className("smallSubmit")).click();
			
			String title=driver.getTitle();
			System.out.println(title);

			driver.close();	
		}

	}


