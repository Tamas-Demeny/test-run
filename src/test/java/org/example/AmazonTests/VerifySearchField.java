package org.example.AmazonTests;

import org.example.BaseTest;
import org.example.amazon_page_objects.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class VerifySearchField extends BaseTest {
    @Test
    public void verifyNoResultsForIncorrectInformation() {
        String incorrectInformation = "kerekalma";
        HomePage homePage = new HomePage(driver);
        String noResultMessage = homePage.openAmazonHomePage()
                .searchMethod(incorrectInformation)
                .getNoResultMessage();
        Assert.assertEquals(noResultMessage, "No results for kerekalma.",
                "There were products found!");
    }

    @Test
    public void searchResultsForLaptop() {
        HomePage homePage = new HomePage(driver);
        String searchAmount = homePage.openAmazonHomePage()
                .searchMethod("laptop")
                .getResultAmount();
        Assert.assertEquals(searchAmount, "1-16 of over 7,000 results for \"laptop\"");
    }

    @Test
    public void searchForLaptopInResults() {
        HomePage homePage = new HomePage(driver);
        List<WebElement> searchResult = homePage.openAmazonHomePage()
                .searchMethod("laptop")
                .searchResultsPresence();
        Assert.assertTrue(searchResult.stream()
                                        .anyMatch(x -> x.getText()
                                        .toLowerCase()
                                        .contains("laptop")));
    }
}
