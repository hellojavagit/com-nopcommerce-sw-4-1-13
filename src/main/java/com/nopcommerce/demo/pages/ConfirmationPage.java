package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ConfirmationPage extends Utility {
    By verifyThankYouMsg=By.xpath("//h1[contains(text(),'Thank you')]");
    By continueButton =By.xpath("//button[contains(text(),'Continue')]");
    By verifyOrderProcessed =By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String verifyThankYouMsgIsDisplayed(){
        return getTextFromElement (verifyThankYouMsg);
    }
    public void clickOnContinueBtn (){
        clickOnElement(continueButton);
    }

    public String verifyOrderProcessedMsg(){
        return getTextFromElement  (verifyOrderProcessed);

    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
}


