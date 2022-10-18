package org.example.modules.page_locators;

import org.openqa.selenium.By;

public interface PageLocators {
    By ZIP_CODE_FIELD = By.xpath("//input[@id=\"GLUXZipUpdateInput\"]");
    By APPLY_BUTTON = By.xpath("//span[@data-action=\"GLUXPostalUpdateAction\"]");
    By CONTINUE_BUTTON = By.xpath("//div[@class=\"a-popover-footer\"]//input");
    By NEW_LOCATION = By.xpath("//span[contains(text(),\"Hartford 06103\u200C\")]");
    By LIST_DROP_DOWN = By.xpath("//span[@role=\"radiogroup\"]");
    By POLAND_OPTION = By.xpath("//*[@id=\"GLUXCountryList_178\"]");
    By DONE = By.xpath("//button[@name=\"glowDoneButton\"]");
    By UPDATED_DELIVER_TO = By.xpath("//span[@id=\"glow-ingress-line2\"][contains(text(),\"Poland\")]");
    By SHIPPING_DESTINATION = By.xpath("//span[contains(text(),\"No \")]");
    By ADD_TO_CART = By.xpath("//input[@id=\"add-to-cart-button\"]");
    By ADDED_TO_CART_MESSAGE = By.xpath("//span[contains(text(),\"Added to Cart\")]");
    By AMOUNT_OF_PRODUCT_IN_CART = By.xpath("//span[@id=\"nav-cart-count\"]");
    By DELETE_FROM_CART_BUTTON = By.xpath("//input[@value=\"Delete\"]");
    By CART_EMPTY_MESSAGE = By.xpath("//h1[contains(text(),\"Your Amazon Cart is empty.\")]");
    By noResult = By.xpath("//span[contains(text(),\"No\")]/parent::div");
    By resultsAmount = By.xpath("//span[contains(text(),\"1-1\")]/parent::div");
    By brandFilter = By.xpath("//div[@id=\"brandsRefinements\"]//span[@class=\"a-size-base a-color-base\"][1]");
    By brandFilterSelected = By.xpath("//div[@id=\"brandsRefinements\"]//span[@class=\"a-size-base a-color-base a-text-bold\"]");
    By productsList = By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]");
    By priceFilter = By.xpath("//div[@id=\"priceRefinements\"]//li[2]//span[@class=\"a-size-base a-color-base\"]");
    By priceRangeLow = By.xpath("//input[@id=\"low-price\"]");
    By priceRangeHigh = By.xpath("//input[@id=\"high-price\"]");
}
