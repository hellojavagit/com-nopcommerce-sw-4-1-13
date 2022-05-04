package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By processor = By.xpath("//select[@id='product_attribute_1']");
    By ramGb = By.xpath("//select[@id='product_attribute_2']");
    By HddRadio = By.xpath("//input[@id='product_attribute_3_7']");
    By osRadio = By.xpath("//input[@id='product_attribute_4_9']");
    By checkTwoCheckBoxes = By.xpath("//input[@id='product_attribute_5_12']");
    By verifyPrice = By.xpath("//span[contains(text(),'$1,475.00')]");
    By addToCartButton2 = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyProductAddedMsg = By.xpath("//a[contains(text(),'shopping cart')]");
    By closeCrossBtn = By.className("close");
    By goToCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    public void selectCore(String text){
        selectByVisibleTextFromDropDown(processor,text);
    }
    public void selectRam(String text){
        selectByVisibleTextFromDropDown(ramGb,text);
    }
    public void selectHddRadio(){
        clickOnElement(HddRadio);
    }
    public void selectOsRadio(){
        clickOnElement(osRadio);
    }
    public void checkTwoBoxes(){
        clickOnElement(checkTwoCheckBoxes);
    }
    public String verifyPrice(){
        return getTextFromElement(verifyPrice);
    }
    public void clickOnAddToCartBtn(){
        clickOnElement(addToCartButton2);
    }
    public String verifyProductAddedToCart(){
        return getTextFromElement(verifyProductAddedMsg);
    }
    public void clickOnCross(){
        clickOnElement(closeCrossBtn);
    }
    public void clickOnGoToCart() throws InterruptedException {
        mouseHoverToElementAndClick(goToCart);
    }
}




