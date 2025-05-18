package com.Amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement continue1;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement button;
	
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signupApp()
	{
		email.sendKeys("pranjalizaware82@gmail.com");
		continue1.click();
		password.sendKeys("Sachin@28");
		button.click();
	}

}
