package org.example.amazon_page_objects;

import org.example.modules.ConfirmationMessage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public ConfirmationMessage addToCart(){
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(ADD_TO_CART))
                .click();
        return new ConfirmationMessage(driver);
    }

    public String shippingDestination(){
        WebElement shipToPoland = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(SHIPPING_DESTINATION));
        return shipToPoland.getText();
    }
}
