package org.example.modules;

import org.example.amazon_page_objects.BasePage;
import org.example.amazon_page_objects.SearchResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortByModule extends BasePage {
    @FindBy(xpath = "//a[@id=\"s-result-sort-select_1\"]")
    private WebElement lowestToHighest;
    public SortByModule(WebDriver driver) {
        super(driver);
    }

    public SearchResultsPage proceLowerToHighest() {
        lowestToHighest.click();
        return new SearchResultsPage(driver);
    }
}
