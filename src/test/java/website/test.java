package website;

import java.awt.AWTException;
import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class test extends web {
	//login
	@Ignore		
	
		@Test (priority = 1 )
		public  void bala() throws InterruptedException {
			browser("chrome");
			url("https://www.kuoe-en.com/");
			maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			Thread.sleep(3000);
			contini();
			 accepp();
			 Thread.sleep(3000);
			 login();
			 throwemail();
			 
			 
			 entermail();
			 
			 passwrd();
			Thread.sleep(9000);
			Thread.sleep(3000);
			Thread.sleep(3000);
			singup();
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(3000);
			Thread.sleep(3000);
			Thread.sleep(3000);
			coifirm();
			
			Thread.sleep(9000);
			home();
			
			bestsell();
			
			dial();
			navy();			
		
			addcart();
			collect();
			allitems();
			search();
//			quiet();
		}
	
		//Add To Cart
	@Ignore
		@Test(priority = 2 )
		public void balaj() throws InterruptedException, AWTException {
			browser("chrome");
			url("https://www.kuoe-en.com/");
			maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			Thread.sleep(3000);
			contini();
			 accepp();
			
			
			home();
			
			bestsell();
			
			dial();
			navy();		
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			brace();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Act();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			addcart();
			viewcart();
			checkout();
			quiet();
		}
		//
		@Ignore
		@Test()
		public void monika() throws InterruptedException, AWTException {
			browser("chrome");
			 

			 url("https://www.kuoe-en.com/");

		       
			
			maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(3000);
			contini();
			 accepp();		
			 
			 
			home();			
			bestsell();					
			dial();
			navy();				
			Thread.sleep(3000);
			brace();
			Thread.sleep(3000);
			Thread.sleep(3000);
			Act();
			Thread.sleep(3000);
			Thread.sleep(3000);
			
			addcart();

		}
		
		@Test()
		public void tested() throws InterruptedException {
			browser("chrome");
			maximize();			 
			 url("https://www.kuoe-en.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			contini();
			 accepp();
			 collect();
			 automodels();
			 crt();
			 cartt();
			 
//			 quiet();
			
			 		 
		}
		@Ignore
		@Test()
		public void allit() throws InterruptedException {
			browser("chrome");
			url("https://www.kuoe-en.com/");	
			maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			contini();
			 accepp();			 
			 allitems();
			 Thread.sleep(3000);
			 
			 jsexcute();
//			 sorttttt();
			 sortt2();
			 
		}
}
