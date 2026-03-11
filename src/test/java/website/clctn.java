package website;

import java.time.Duration;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class clctn extends web {
	@Ignore
	@Test(priority = 1 , invocationCount = 1)
	public void balanavin() {
		browser("chrome");
		url("https://www.kuoe-en.com/");
		maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		maximize();
		contini();
		 accepp();
	
		 collect();
		 smith1();
		 quiet();
		 clctin c = new clctin();
		 c.clctin();
		 c.clctin2();
		 c.clctin3();
		 c.clctin4();
	}
	
}
