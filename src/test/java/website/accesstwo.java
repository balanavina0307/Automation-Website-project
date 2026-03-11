package website;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class accesstwo {
	static Actions a;
	static Robot r;
	static WebDriver driver;
	public static void browser(String brio) {
		if(brio.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	
		}
		else if(brio.equalsIgnoreCase("edge")) {
				WebDriverManager.chromedriver().setup();
				driver = new EdgeDriver();
	
	}
		
	}
		public static void url(String url) {
			driver.get(url);
		}	
		public static void waitt(int i) throws InterruptedException {
			Thread.sleep(i);
		}
		public static void maximize() {
			driver.manage().window().maximize();
		}
		  public static void contini() {
			  driver.findElement(By.xpath("//input[@type='button']")).click();
		  }
		  
		  public static void acceppt() {
			  driver.findElement(By.xpath("//button[@class='tw-cookies-accepts cross-sticky tw-btn-primary tw-btn-standard']")).click();
		  }
		  public static void quiet() {
			  driver.close();
		  }
		  
		  
		  //log
		  public static void login() {
			  driver.findElement(By.xpath("(//span[text()='Account'])[1]")).click();
			  
		  }
		  //click
		  public static void google() {
			  driver.findElement(By.xpath("//span[text()='LOGIN/SIGNUP']")).click();
			  
		  }
		  public static void mobil() {
			  WebElement mi = driver.findElement(By.id("mobile"));
			  mi.sendKeys("7806954825");
		  }
		  
		
		  //ph
		  public static void type() {
			  driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
			  
		  }
}
