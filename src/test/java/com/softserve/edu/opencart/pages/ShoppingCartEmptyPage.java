package com.softserve.edu.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartEmptyPage extends TopPart{
    private WebElement shoppingCart;
    private WebElement yourShoppingCartIsEmpty;
    private WebElement buttonContinue;

    public ShoppingCartEmptyPage(WebDriver driver) {
        super(driver);
        initElements();
    }
    private void initElements() {
        // init elements
        shoppingCart = driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart')]"));
        yourShoppingCartIsEmpty = driver.findElement(By.xpath("(//p[contains(text(),'Your shopping cart is empty!')])[2]"));
        buttonContinue = driver.findElement(By.xpath("//*[@id='content']/div/div/a"));
     }
    // shoppingCart
    public WebElement getShoppingCart() {
        return shoppingCart;
    }
    public boolean isShoppingCartDisplayed() {
        return shoppingCart.isDisplayed();
    }
    public boolean isShoppingCartEmptyDisplayed() {
        return yourShoppingCartIsEmpty.isDisplayed();
    }

    public String getShoppingCartText() {
        return getShoppingCart().getAttribute(TAG_ATTRIBUTE_VALUE);
    }

    public void clearGetShoppingCart() {
        getShoppingCart().clear();
    }

    public void clickGetShoppingCart() {
        getShoppingCart().click();
    }

    public void setShoppingCart(String text) {
        getShoppingCart().sendKeys(text);
    }

    // yourShoppingCartIsEmpty
    public WebElement getYourShoppingCartIsEmpty() {
        return yourShoppingCartIsEmpty;
    }

    public String getYourShoppingCartIsEmptyText() {
        return getYourShoppingCartIsEmpty().getAttribute(TAG_ATTRIBUTE_VALUE);
    }

    public void clearGetYourShoppingCartIsEmpty() {
        getYourShoppingCartIsEmpty().clear();
    }

    public void clickGetYourShoppingCartIsEmpty() {
        getYourShoppingCartIsEmpty().click();
    }

    public void setYourShoppingCartIsEmpty(String text) {
        getYourShoppingCartIsEmpty().sendKeys(text);
    }

    // buttonContinue
    public WebElement getButtonContinue() {
        return buttonContinue;
    }

    public String getButtonContinueText() {
        return getButtonContinue().getAttribute(TAG_ATTRIBUTE_VALUE);
    }

    public void clickButtonContinue() {
        getButtonContinue().click();
    }

    public HomePage gotoContinue() {
        clickButtonContinue();
        return new HomePage(driver);
    }
}
