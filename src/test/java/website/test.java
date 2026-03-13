package website;

import java.awt.AWTException;
import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class test extends web {
	collecions c = new collecions();
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
			
		c.login();
		
		}
	
		//Add To Cart
		@Ignore
		@Test(priority = 2 , invocationCount = 1)
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
		//addto cart 2
		
		@Test(	)
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
			Thread.sleep(9000);
			viewcartt();
//			 rob();
			
			
//			viewct();
//			viewcart();
//			checkout();
		}
		//collection to cart
		@Ignore
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
			 crt1();
			 model();
			 cartt();
//			 addtocart();
			 cart2();
//			 quiet();
			
			 		 
		}
		//end to all 
		
		@Ignore
		@Test()
		public void allit() throws InterruptedException, AWTException {
			browser("chrome");			
			url("https://www.kuoe-en.com/");	
			
			maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			contini();
			 accepp();
			 home();
			 collect();
			 allitems();
			 about();
			 search();
//			 Stores();
			 
			 rob();
		}
		@Ignore
		@Test()
		public void newsletter() throws InterruptedException {
			browser("chrome");			
			url("https://www.kuoe-en.com/");	
			
			maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			contini();
			 accepp();
			 home();
			 collect();
			 home();
			 news();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 nsmail();
			 nsname();
			 subscribe();
		}
		@Ignore
		@Test()
		public void pomn() throws InterruptedException, AWTException {
			browser("chrome");
			maximize();			 
			 url("https://www.kuoe-en.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			contini();
			 accepp();
			 rob();
			 
			 
		}
			
}
