package website;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
public class web {
	static Actions a;
	static Robot r;
	static WebDriver driver;
	public static void browser(String brio) {
		if(brio.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(brio.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
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
		//continue window
		  public static void contini() {
			  driver.findElement(By.xpath("//input[@type='button']")).click();
		  }
		  //accept window
		  public static void accepp() {
			  driver.findElement(By.xpath("//button[@class='A9d5ZY ']")).click();
		  }
		  //quiet
		  public static void quiet() {
			  driver.quit();
		  }
	 
		  //login
		  public static void login() {
			  driver.findElement(By.xpath("//span[text()='Log In']")).click(); 
		  }		
		  //throwgoogle
		  public static void google() {
			  driver.findElement(By.xpath("//span[text()='Sign up with Google']")).click();
			  
		  }	
		  public  static void fb() {
				driver.findElement(By.id("switchToEmailLink_SM_ROOT_COMP891")).click();
			}
		  public  static void swm() {
		 driver.findElement(By.xpath(" (//span[@class='l7_2fn wixui-button__label'])[16]")).click();
		 
		  }
				  public static void throwemail() {
			driver.findElement(By.xpath("//span[text()='Sign up with email']")).click();
			
				 //shanmugam1672002@gmail.com //raj@2435
		  }
		//set value		  
		  public static void entermail() {
			  WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
			  email.sendKeys("yedoj32190@hlkes.com");
			  email.click();
		  }
		  public static void passwrd() {
			  WebElement passwrd = driver.findElement(By.xpath("//input[@type='password']"));
			  passwrd.sendKeys("bala123");
			  passwrd.click();
		  }
		// get value
		  public static void eml(String mail) {
			  WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
			  email.sendKeys(mail);
			  email.click();
		  }
		  public static void pwd(String pass) {
			  WebElement passwrd = driver.findElement(By.xpath("//input[@type='password']"));
			  passwrd.sendKeys(pass);
			  passwrd.click();
		  }
		  public static void singup() {
			  WebElement sig = driver.findElement(By.xpath("//span[text()='Sign Up']"));
			  sig.click();
		  }
		  public static void coifirm() {
			  WebElement confirm = driver.findElement(By.xpath("//span[text()='Confirm & Sign Up']"));
			  confirm.click();
		  }
		  //collections
		  public static void collect() {
				driver.findElement(By.id("DrpDwnMn01label")).click();
			}
			public static void automodels() {
				WebElement amd = driver.findElement(By.xpath("//span[text()='Automatic models']"));
				JavascriptExecutor jd =  (JavascriptExecutor) driver;
				jd.executeScript("arguments[0].scrollIntoView(true)", amd);
			}
			public static void crt() {
			driver.findElement(By.xpath("//span[contains(text(),'90-002')]")).click();
			WebElement quick = driver.findElement(By.xpath("//*[@class='QHl0ZB sSKK6OY']"));
			JavascriptExecutor jgd =  (JavascriptExecutor) driver;
			jgd.executeScript("arguments[0].scrollIntoView(true)", quick);
			}
			public static void cartt() {
			WebElement item = driver.findElement(By.xpath("(//*[@class='QHl0ZB sSKK6OY'])[10]"));
			JavascriptExecutor it =  (JavascriptExecutor) driver;
			it.executeScript("arguments[0].scrollIntoView(true)", item);
			
			}public static void cart2() {
				
				driver.findElement(By.xpath("//button[@data-hook='add-to-cart']")).click();
			}
			public static void smith1() {
				driver.findElement(By.xpath("//span[text()='OLD SMITH 90-001　≫']")).click();
				
			}
			public static void cash() {
				WebElement c = driver.findElement(By.xpath("//span[text()='₹‌10,200.00']"));
				c.click();
			}
			public static void home() {
				WebElement hom = driver.findElement(By.id("DrpDwnMn00label"));
				hom.click();
			}
			
			
			//All items 
			public static void allitems() {
				driver.findElement(By.id("DrpDwnMn02label")).click();				
			}
			public static void jsexcute() {
				WebElement srr = driver.findElement(By.xpath("//div[@class='shxYSQ2']"));
				srr.click();
			}
			public static void sorttttt() {
				WebElement sr = driver.findElement(By.xpath("//span[@class='s_lC8jk sNuRM1j']"));
				sr.click();
			}
			public static void sortt2() {
				WebElement el = driver.findElement(By.xpath("//span[text()='Newest']"));
				el.click();
			}
			
			//down best selling
			public static void bestsell() {
				WebElement best = driver.findElement(By.xpath("//span[text()='BEST SELLERS']"));
				JavascriptExecutor js = (JavascriptExecutor) driver ;
				js.executeScript("arguments[0].click()", best );
			}
			//click first one 
			public static void panda() {
				WebElement best = driver.findElement(By.xpath("//h3[contains(text(),'Automatic Panda')]"));
				JavascriptExecutor js = (JavascriptExecutor) driver ;
				js.executeScript("arguments[0].click()", best );
			}
			public static void SMITH() {
				 driver.findElement(By.xpath("//h3[contains(text(),'Automatic Panda')]"));
			
			}
			
			// thrid watch
			public static void dial() {
				WebElement dia = driver.findElement(By.xpath("//h3[contains(text(),' Linen Textured Dia')]"));
				JavascriptExecutor mk = (JavascriptExecutor) driver ;
				mk.executeScript("arguments[0].click()", dia);
			}
			public static void navy() {
				WebElement nav = driver.findElement(By.xpath("//h1[contains(text(),' Gradient Navy')]"));
				JavascriptExecutor nv = (JavascriptExecutor) driver;
				nv.executeScript("arguments[0].scrollIntoView(true);", nav);
			}
			public static void brace() throws AWTException, InterruptedException  {
				
			
				
				Robot r = new Robot();
				for(int i=1;i<=19;i++) {
					
					r.keyPress(KeyEvent.VK_TAB);
					r.keyRelease(KeyEvent.VK_TAB);
					Thread.sleep(300);
					
				}				
				 r.keyPress(KeyEvent.VK_ENTER);
				 r.keyRelease(KeyEvent.VK_ENTER);
					driver.findElement(By.xpath("//div[@data-hook='core-dropdown']")).click();	
			}
			
			public static void Act()  {
	
				driver.findElement(By.xpath("//div[@role='option']")).click();				
			}			
			public static void addcart() {
				driver.findElement(By.xpath("//button[@aria-live='assertive']")).click();

			}
			public static void viewcart() {
				driver.findElement(By.id("widget-view-cart-button")).click();
			
			}
			public static void checkout() {
			driver.findElement(By.xpath("//span[text()='Checkout']")).click();
			
			}
			public static void panda2() {
				
				WebElement best1 = driver.findElement(By.xpath("//h1[contains(text(),'Automatic Panda')]"));

				JavascriptExecutor jss = (JavascriptExecutor) driver ;
				jss.executeScript("arguments[0].scrollIntoView({block:'center'});", best1);
			}
			public static void Bracelet() {
				
				WebElement bracelet = driver.findElement(By.xpath("//label[text()='Bracelet']"));

				JavascriptExecutor jss = (JavascriptExecutor) driver ;
				jss.executeScript("window.scrollBy(0,1000)", bracelet);
			}
			
			
			public static void select() {
				driver.findElement(By.xpath("(//div[text()='Select'][1])")).click();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				driver.findElement(By.xpath("//span[text()='Mixed-link bracelet']")).click();
			}
			public static void about() {
			
			driver.findElement(By.id("DrpDwnMn04label")).click();
			}
			
			public static void search() {
			driver.findElement(By.id("DrpDwnMn05label")).click();	
			
			WebElement sch = driver.findElement(By.xpath("//input[@type='search']"));
			sch.click();
			sch.sendKeys("watch");
			sch.click();
			
			}
			public static void contactus() {
			
			WebElement ctu = driver.findElement(By.xpath("//span[text()='CONTACT US']"));
			JavascriptExecutor mkl = (JavascriptExecutor) driver ;
			mkl.executeScript("arguments[0].click()", ctu);
			}
			
}
			

