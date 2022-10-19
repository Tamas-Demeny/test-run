package org.example.modules;

import org.example.amazon_page_objects.BasePage;
import org.example.amazon_page_objects.CartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmationMessage extends BasePage {
    public ConfirmationMessage(WebDriver driver) {
        super(driver);
    }
    public String addedToCartMessage(){
        WebElement addedToCartMessage = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(ADDED_TO_CART_MESSAGE));
        return addedToCartMessage.getText();
    }
}
