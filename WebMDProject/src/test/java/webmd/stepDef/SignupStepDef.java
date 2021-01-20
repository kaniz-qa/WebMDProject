package webmd.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webmd.actions.SignupActions;

public class SignupStepDef {

	SignupActions signAct = new SignupActions();
	
	@Given("user navigate the url")
	public void user_navigate_the_url() {
	    
		signAct.homePage();
	}

	@When("click on singin link")
	public void click_on_singin_link() throws InterruptedException {
		signAct.signinLink();
	   
	}

	@When("click on signup link")
	public void click_on_signup_link() throws InterruptedException {
		signAct.signupLink();
	   
	}

	@When("input email , password , dob")
	public void input_email_password_dob() throws InterruptedException {
	    
		signAct.emailPassDob();
	}

	@When("click on signup button")
	public void click_on_signup_button() throws InterruptedException {
	    
		signAct.signupButton();
	}
	
	
	@Then("I can see my profile text")
	public void i_can_see_my_profile_text() {
		signAct.myProfileText();
	}
	
	

	
}
