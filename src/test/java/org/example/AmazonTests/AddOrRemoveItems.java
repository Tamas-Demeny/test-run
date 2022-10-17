package org.example.AmazonTests;

import org.example.BaseTest;
import org.example.amazon_page_objects.*;
import org.example.modules.ConfirmationMessage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddOrRemoveItems extends BaseTest {
    @Test
    public void addToCartFunctionality() {
        HomePage homePage = new HomePage(driver);
        ConfirmationMessage addedToCartPage = homePage.openAmazonHomePage()
                .searchMethod("keyboards")
                .clickRedragon()
                .addToCart();

        String addedToCartMessage = addedToCartPage.addedToCartMessage();
        Assert.assertEquals(addedToCartMessage, "Added to Cart",
                "The message \"Added to Cart\" did not appear!");

        String amountOfProductInCart = addedToCartPage.amountOfProductInCart();
        Assert.assertEquals(amountOfProductInCart, "1",
                "The amount of products in cart should be 1!");
    }

    @Test
    public void removeFromCart() {
        HomePage homePage = new HomePage(driver);
        CartPage cartEmptyPage = homePage.openAmazonHomePage()
                .searchMethod("keyboards")
                .clickRedragon()
                .addToCart()
                .openCart()
                .deleteFromCartButton();

        Assert.assertEquals(cartEmptyPage.cartEmptyMessage(), "Your Amazon Cart is empty.",
                "The message \"Your Amazon Cart is empty.\" did not appear!");

        Assert.assertEquals(cartEmptyPage.cartSum(), "$0.00",
                "The payable amount did not go down to $0!");
    }
}
