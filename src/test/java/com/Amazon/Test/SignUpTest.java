package com.Amazon.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amazon.base.BaseClassAmazon;
import com.Amazon.page.SignUpPage;

public class SignUpTest extends BaseClassAmazon {
	@Test(priority = 0)
	public void ClickSignUp()
	{
		SignUpPage signobj=new SignUpPage(driver);
		signobj.signupApp();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/gp/yourstore/home?path=%2Fgp%2Fyourstore%2Fhome&useRedirectOnSuccess=1&signIn=1&action=sign-out&ref_=nav_AccountFlyout_signout");
	}

}
