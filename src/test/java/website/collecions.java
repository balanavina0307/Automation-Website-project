package website;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class collecions {

	
		@FindBy(xpath = "//span[text()='Log In']")
		private WebElement login;
		 public WebElement clklog() {
			 return login;
			 
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
	}

