package org.example.modules;

import org.example.amazon_page_objects.BasePage;
import org.example.amazon_page_objects.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeliverToConfirmationModule extends BasePage {
    public DeliverToConfirmationModule(WebDriver driver) {
        super(driver);
    }
    public HomePage confirm(){
        WebElement continueButton = new WebDriverWait(driver, Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOfElementLocated(CONTINUE_BUTTON));
        continueButton.click();
        return new HomePage(driver);
    }
}
