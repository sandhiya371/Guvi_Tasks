package Task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guvi.in/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Using Id attribute:
		driver.findElement(By.id("name")).sendKeys("Sandhiya N");
		driver.findElement(By.id("email")).sendKeys("sandhiya123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Guvi@1234");
		driver.findElement(By.id("mobileNumber")).sendKeys("9009009000");
		
		WebElement clk = driver.findElement(By.id("signup-btn"));
		clk.click();
		
		driver.close();
		

//		Class name: 	driver.findElement(By.className("mobileNumber")).sendKeys("9009009000");
//		Class name:		driver.findElement(By.className("signup-btn")).click();

//		Link Text: 		driver.findElement(By.linkText("Sign Up")).click();
		
		
//		CSS Selector:	driver.findElement(By.cssSelector("input#name")).sendKeys("Sandhiya N");
//		CSS Selector:	driver.findElement(By.cssSelector("input#email")).sendKeys("sandhiya123@gmail.com");

//		Xpath:
//		Collection based Xpath : driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]")).sendKeys("Sandhiya.N");
//		Absolute Xpath : 		 driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[1]/input")).sendKeys("Sandhiya.N");
		
		
		
				
		
		
		
		
		
		
		
		
		
	}

}
