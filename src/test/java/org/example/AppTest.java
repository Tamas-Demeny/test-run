package org.example;

import org.example.AmazonTests.AddOrRemoveItems;
import org.example.AmazonTests.DeliverTo;
import org.example.AmazonTests.VerifySearchField;
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
    }

}
