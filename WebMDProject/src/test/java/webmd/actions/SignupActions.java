package webmd.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import webmd.elements.SignupElements;
import webmd.utilities.SetupDrivers;

public class SignupActions {

	
	SignupElements signEle;
	
	
	public SignupActions() {
		
		this.signEle = new SignupElements();
		PageFactory.initElements(SetupDrivers.chromeDriver, signEle);
		
	}
	
	
	public void homePage() {
		SetupDrivers.chromeDriver.get("https://webmd.com");
		SetupDrivers.chromeDriver.manage().window().maximize();
				
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void signinLink() throws InterruptedException {
		signEle.cookiesIcon.click();
		Thread.sleep(2000);
		signEle.signinLink.click();
		Thread.sleep(2000);
		
	}
	
	public void signupLink() throws InterruptedException {
		signEle.signupLink.click();
		Thread.sleep(2000);
	}
	
	public void emailPassDob() throws InterruptedException {
		signEle.email.sendKeys("kanizbd100@gmail.com");
		Thread.sleep(2000);
		signEle.pass.sendKeys("kaniz12345678kaniz");
		Thread.sleep(2000);
		
		signEle.pass.sendKeys(Keys.TAB);
		signEle.dateOfBirth.sendKeys("12202003");
		
	}
	
	public void signupButton() throws InterruptedException {
		signEle.signupButton.click();
		Thread.sleep(2000);
	}
	
	public void myProfileText() {
		signEle.signinText.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
}
