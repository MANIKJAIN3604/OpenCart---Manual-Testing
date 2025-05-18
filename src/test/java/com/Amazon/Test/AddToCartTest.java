package com.Amazon.Test;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Amazon.base.BaseClassAmazon;
import com.Amazon.page.AddToCartPage;
import com.Amazon.page.SearchProduct;
import com.Amazon.page.SignUpPage;



public class AddToCartTest extends BaseClassAmazon {
	@Test
	public void AddedToCart() throws InterruptedException
	{
		SignUpPage signobj=new SignUpPage(driver);
	    signobj.signupApp();
	    Thread.sleep(2000);
		SearchProduct serachobject=new SearchProduct(driver);
		serachobject.searchBag();
		Thread.sleep(2000);
		AddToCartPage cart=new AddToCartPage(driver);
		cart.AddtoCart(driver);
		//WebElement cartNo=driver.findElement(By.linkText("8"));
		WebElement Detailedpage=driver.findElement(By.linkText("Maa Laxmi Handloom Begam Puri Khadi Cotton Saree With Running Blouse Piece, SKU_037"));
		assertEquals(true, Detailedpage.isDisplayed());
		
	}

}

    // Search Product Test
    @Test
    public void testSearchProduct() throws InterruptedException {
        SearchProduct searchObj = new SearchProduct(driver);
        searchObj.searchProduct("Laptop");
        assertEquals(searchObj.isProductDisplayed("Laptop"), true, "Product not displayed in search results");
    }

    // Product Details Test
    @Test
    public void testProductDetails() throws InterruptedException {
        SearchProduct searchObj = new SearchProduct(driver);
        searchObj.searchProduct("Laptop");
        ProductPage productPage = searchObj.selectProduct("Laptop");

        assertEquals(productPage.getProductPrice(), "$1000", "Product price does not match");
        assertEquals(productPage.getProductDescription(), "Description of Laptop", "Product description is incorrect");
    }

    // Remove Product from Cart Test
    @Test
    public void testRemoveProductFromCart() throws InterruptedException {
        AddToCartPage cartPage = new AddToCartPage(driver);
        cartPage.removeProductFromCart("Laptop");
        assertEquals(cartPage.isProductInCart("Laptop"), false, "Product was not removed from cart");
    }

    // Checkout Flow Test
    @Test
    public void testCheckoutFlow() throws InterruptedException {
        AddToCartPage cartPage = new AddToCartPage(driver);
        CheckoutPage checkoutPage = cartPage.proceedToCheckout();

        assertTrue(checkoutPage.isCheckoutPageDisplayed(), "Checkout page is not displayed");
    }
