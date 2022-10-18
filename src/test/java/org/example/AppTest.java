package org.example;

import org.example.AmazonTestsSelenium.AddOrRemoveItems;
import org.example.AmazonTestsSelenium.DeliverTo;
import org.example.AmazonTestsSelenium.VerifySearchAndFilter;
import org.example.AmazonTestsSelenium.VerifySearchField;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
    @Test
    public void amazonTests(){
        AddOrRemoveItems addOrRemoveItems = new AddOrRemoveItems();
        addOrRemoveItems.removeFromCart();
        addOrRemoveItems.addToCartFunctionality();

        DeliverTo deliverTo = new DeliverTo();
        deliverTo.deliverToPoland();
        deliverTo.deliverToZipCode();

        VerifySearchField verifySearchField = new VerifySearchField();
        verifySearchField.searchForLaptopInResults();
        verifySearchField.searchResultsForLaptop();
        verifySearchField.verifyNoResultsForIncorrectInformation();

        VerifySearchAndFilter verifySearchAndFilter = new VerifySearchAndFilter();
        verifySearchAndFilter.sortByPrice();
        verifySearchAndFilter.searchFilterByBrand();
        verifySearchAndFilter.searchFilterByPrice();
    }

}
