package org.example.AmazonTestsSelenium;

import org.example.BaseTest;
import org.example.amazon_page_objects.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.example.modules.page_locators.PageLocators.UPDATED_DELIVER_TO;

public class DeliverTo extends BaseTest {
    @Test
    public void deliverToZipCode() {
        HomePage homePage = new HomePage(driver);
        String newLocation = homePage.openAmazonHomePage()
                .clickDeliverTo()
                .deliverToUSAZip()
                .confirm()
                .deliverToLocation();

        Assert.assertEquals(newLocation, "Hartford 06103\u200C");
    }

    @Test
    public void deliverToPoland() {
        HomePage homePage = new HomePage(driver);
        homePage.openAmazonHomePage()
                .clickDeliverTo()
                .deliverToCountry("Poland");

        //wait for the page to update
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(UPDATED_DELIVER_TO));

        String shippingDestination = homePage.openAmazonHomePage()
                .searchMethod("keyboards")
                .clickRedragon()
                .shippingDestination();

        Assert.assertTrue(shippingDestination.contains("Poland"),
                "Result is false, which means that the shipping is not to Poland");
    }
}
