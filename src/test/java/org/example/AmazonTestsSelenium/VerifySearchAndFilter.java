package org.example.AmazonTestsSelenium;

import org.example.BaseTest;
import org.example.amazon_page_objects.HomePage;
import org.example.amazon_page_objects.SearchResultsPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VerifySearchAndFilter extends BaseTest {
    @Test
    public void searchFilterByBrand() {
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = homePage.openAmazonHomePage()
                .clickOnFirstCategory()
                .filterByBrand();
        String ourFilter = searchResultsPage.getFirstBrand();
        List<WebElement> productsList = searchResultsPage.listOfProducts();
        Assert.assertTrue(productsList.stream()
                                        .allMatch(x -> x.getText()
                                                            .toLowerCase()
                                                            .contains(ourFilter.toLowerCase())));
    }

    @Test
    public void searchFilterByPrice() {
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = homePage.openAmazonHomePage()
                .clickOnFirstCategory()
                .filterByPrice();
        Double lowest = searchResultsPage.priceRangeLow();
        Double highest = searchResultsPage.priceRangeHigh();
        Assert.assertTrue(searchResultsPage.listOfMainPrices()
                                                .stream()
                                                .allMatch(s -> Double.parseDouble(s.getText()) > lowest
                                                        && Double.parseDouble(s.getText()) < highest));
    }

    @Test
    public void sortByPrice() {
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = homePage.openAmazonHomePage()
                .clickOnFirstCategory()
                .openSortByOptions()
                .proceLowerToHighest();
        Assert.assertTrue(searchResultsPage.listOfMainPrices()
                                                .stream()
                                                .sorted()
                                                .toList()
                                                .equals(searchResultsPage.listOfMainPrices()));
    }
}
