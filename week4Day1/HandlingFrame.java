package week4Day1;

	import java.time.Duration;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HandlingFrame {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			driver.switchTo().frame("iframeResult");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Thread.sleep(200);
			WebElement el = driver.findElement(By.xpath("//button[text()='Try it']"));
			el.click();
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("Balachandar");
			alert.accept();
			WebElement el1 = driver.findElement(By.xpath("//p[@id='demo']"));
			String text = "Hello bala! How are you?";
			if (el1.getText().equals(text)) {
				System.out.println("Text  verified successfully");
			} else {
				System.out.println("Text  failed");
			}
			driver.close();
		}

	}

