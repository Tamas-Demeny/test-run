package org.example.amazon_page_objects;

import org.example.modules.SortByModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'puis-include-cont')]//span[contains(@class,'a-price-whole')]")
    private List<WebElement> listOFProductPrices;
    @FindBy(xpath = "//img[starts-with(@alt,\"Redragon S101\")]")
    private WebElement REDRAGON_KEYBOARD;
    @FindBy(xpath = "//span[contains(text(),\"Sort by:\")]")
    private WebElement sorByDropdownButton;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage clickRedragon() {
        REDRAGON_KEYBOARD.click();
        return new ProductPage(driver);
    }

    public String getNoResultMessage() {
        return new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(noResult)).getText();
    }

    public String getResultAmount() {
        return new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(resultsAmount)).getText();
    }

    public List<WebElement> searchResultsPresence() {
        return driver.findElements(productsList);
    }

    public String getFirstBrand() {
        return new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(brandFilterSelected))
                .getText();
    }

    public SearchResultsPage filterByBrand() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(brandFilter))
                .click();
        return new SearchResultsPage(driver);
    }

    public List<WebElement> listOfProducts() {
        return driver.findElements(productsList);
    }

    public SearchResultsPage filterByPrice() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(priceFilter)).click();
        return new SearchResultsPage(driver);
    }

    public Double priceRangeLow() {
        WebElement lowPrice = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(priceRangeLow));
        return Double.parseDouble(lowPrice.getAttribute("value"));
    }

    public Double priceRangeHigh() {
        WebElement highPrice = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(priceRangeHigh));
        return Double.parseDouble(highPrice.getAttribute("value"));
    }

    public List<WebElement> listOfMainPrices() {
        return listOFProductPrices;
    }

    public SortByModule openSortByOptions() {
        sorByDropdownButton.click();
        return new SortByModule(driver);
    }
}
