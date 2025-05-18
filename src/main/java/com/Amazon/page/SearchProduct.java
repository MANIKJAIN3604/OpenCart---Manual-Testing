package com.Amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchelement;
	
	@FindBy(id="nav-search-submit-button")
	WebElement submit;
	
	public SearchProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchBag()
	{
		searchelement.sendKeys("Sarees for Women");
		submit.click();
	}

}
