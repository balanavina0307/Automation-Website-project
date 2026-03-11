package website;

import java.time.Duration;

import org.testng.annotations.Test;

public class accessss extends accesstwo {
	@Test()
	public void balaj() throws InterruptedException {
		browser("chrome");
		url("https://www.titan.co.in/");
		maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		maximize();
	
		
		 acceppt();
		
		 login();
		 google();
	
		 mobil();
		 Thread.sleep(3000);
		 type();
//		 quiet();

}
}
