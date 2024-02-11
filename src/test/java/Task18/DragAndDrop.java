package Task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// inside frame path loaded
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		// To switch frame
		driver.switchTo().frame(frame);
		// selecting the source id.
		WebElement drag = driver.findElement(By.id("draggable"));
		// selecting the destination id.
		WebElement drop=	driver.findElement(By.id("droppable"));
		// Adding the action class operation on mouse cursor.
		Actions mouse = new Actions(driver);
		// Using drag and drop element and printing it
		mouse.dragAndDrop(drag, drop).perform();
		System.out.println(drop.getText());

		String css = driver.findElement(By.id("droppable")).getAttribute("color");
		System.out.println("Target element CSS is : " + css);
		driver.close();
	}

}
