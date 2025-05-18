package com.Amazon.Test;

import org.testng.annotations.Test;

import com.Amazon.base.BaseClassAmazon;
import com.Amazon.page.SearchProduct;
import com.Amazon.page.SignUpPage;

public class SearchProductTest extends BaseClassAmazon
{
@Test(priority = 1)
	public void searchSaree() throws InterruptedException
	{
	       SignUpPage signobj=new SignUpPage(driver);
	       signobj.signupApp();
	       Thread.sleep(2000);
		SearchProduct serachobject=new SearchProduct(driver);
		serachobject.searchBag();
	}
}
