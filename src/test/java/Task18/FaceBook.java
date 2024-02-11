package Task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.navigate().refresh();

		// to redirect
		String url = driver.getCurrentUrl();
		driver.get(url);

		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sandhiya");
		driver.findElement(By.name("lastname")).sendKeys("Guvisample");
		driver.findElement(By.name("reg_email__")).sendKeys("sandhiya@guvi.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sandhiya@guvi.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@12345");

		// driver.findElement(By.name("birthday_day"));

		// Day select
		// 1st we need to locate the selector
		WebElement day = driver.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByValue("11");

		// Selecting month.
		WebElement month = driver.findElement(By.id("month"));
		Select mnt = new Select(month);
		mnt.selectByValue("10");

		// Selecting year.
		WebElement year = driver.findElement(By.id("year"));
		Select yr = new Select(year);
		yr.selectByValue("1994");

		// Selecting value as Female.
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();

		// clicking on sign-up button.
		WebElement sub = driver.findElement(By.name("websubmit"));
		sub.click();

		WebElement Create = driver.findElement(By.linkText("No, Create New Account"));
		Create.click();

		driver.navigate().refresh();
		System.out.println("Current url is: " + url);
		driver.close();

	}

}

//Output:
//	Current url is: https://www.facebook.com/
