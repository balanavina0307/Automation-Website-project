package website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class clctin {
	
	static WebDriver driver;
	public static void clctin() {
		WebElement c = driver.findElement(By.id("DrpDwnMn00label"));
		c.click();
	}
	public static void clctin2() {
		WebElement cl = driver.findElement(By.id("DrpDwnMn00label"));
		cl.click();
	}
	public static void clctin3() {
		WebElement cll = driver.findElement(By.xpath("//span[text()='BEST SELLERS']"));
		driver.navigate().to("cll");
	}
	public static void clctin4() {
		WebElement cl4 = driver.findElement(By.xpath("//h3[text()='ROYAL SMITH 90-010 Automatic Panda x Grainy Finish Dial']"));
		cl4.click();
	}
	
	

}
