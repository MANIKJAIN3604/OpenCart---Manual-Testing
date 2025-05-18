package com.Amazon.page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
	@FindBy (linkText ="Maa Laxmi Handloom Begam Puri Khadi Cotton Saree With Running Blouse Piece, SKU_037")
	WebElement saree;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocartButton;
	
	@FindBy(xpath="//*[@id=\"nav-cart-count-container\"]/span[2]")
	WebElement cartbutton;
	
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddtoCart(WebDriver driver) throws InterruptedException
	{
		
		
		saree.click();
		Set<String>pcid=driver.getWindowHandles();
	//set is not follows indexing thats why needs to iterate set<string>
			//iterator is interface in nature
	Iterator<String> control=pcid.iterator();
	//Next method is used to print the single id like the windowhandle
	//thats why return type is only string,,next is uswed to seperate the parent and child id thats why control will move to parent to child
	String parentid= control.next();//give parentid in 1st nestmethod
	String childid=control.next();//give childid in 2nd nextmethod
	driver.switchTo().window(childid);
	addtocartButton.click();
	Thread.sleep(2000);
	cartbutton.click();
	}
}
