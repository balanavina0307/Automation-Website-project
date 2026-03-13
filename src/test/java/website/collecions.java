package website;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class collecions extends web {

	
		@FindBy(xpath = "//span[text()='Log In']")
		private WebElement login3;
		 public WebElement clklog() {
			 return login3;
			 
		 }
		 @FindBy(id = "googleSM_ROOT_COMP891")
			private WebElement sle;
			public WebElement gppgle() {
				return sle;				
			}
		@FindBy(xpath = "//span[text()='Sign up with email']")
		private WebElement email;
		public WebElement clkemail() {
			return email;
		}
		@FindBy(id = "input_input_emailInput_SM_ROOT_COMP902")
		private WebElement mail;
		public WebElement entmail() {
			return mail;
		}
		@FindBy(id = "input_input_passwordInput_SM_ROOT_COMP902")
		private WebElement pass;
		public WebElement passk() {
			return pass;			
		}		
		@FindBy(xpath = "//span[text()='Sign Up']")
		private WebElement sign;
		public WebElement sing() {
			return sign;
		}
		
		//newsletter
		
		@FindBy(id = "input_comp-loxtjpi6")
		private WebElement emaill;
		public WebElement mail(String maill) {
			return emaill;
		}
		
		@FindBy(xpath = "//input[@name='your-name ']")
		private WebElement name;
		public WebElement namee(String namee ) {
			return name;
		}
		
	}

