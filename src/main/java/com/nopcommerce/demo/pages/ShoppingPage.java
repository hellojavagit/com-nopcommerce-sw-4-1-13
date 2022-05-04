package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingPage extends Utility {
    By verifyShoppingCartMSg = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By changeQuantity = By.xpath("(//input[contains(@id, 'itemquantity')])");
    By updateButton = By.xpath("//button[text()='Update shopping cart']");
    By verifyTotal = By.className("product-subtotal");
    By termsOfService = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.xpath("//button[@id='checkout']");
    By verifyQuantity =By.xpath("//span[contains(text(),'(2)')]");
    By verifyTotalPhone =By.xpath("//span[contains(text(),'$698.00') and @class='product-subtotal']");

    public String verifyShoppingCartMSG() {
        return getTextFromElement(verifyShoppingCartMSg);
    }
    public void changeQuantity(String key){
        sendTextToElement(changeQuantity,key );
    }
    public void clickOnUpdateCartBtn(){
        clickOnElement(updateButton);
    }


    public String verifyTotalPrice() {
        return getTextFromElement (verifyTotal);
    }
    public void clickOnTermsOfService(){
        clickOnElement(termsOfService);
    }
    public void clickOnCheckoutBtn(){
        clickOnElement(checkoutButton);
    }
    public String verifyQuantity(){
        return getTextFromElement (verifyQuantity);
    }
    public String verifyTotalPhone(){
        return getTextFromElement (verifyTotalPhone);
    }
}




