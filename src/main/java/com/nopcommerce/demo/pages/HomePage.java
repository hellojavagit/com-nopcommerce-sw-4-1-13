package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By computersPage = By.xpath("//h1[contains(text(),'Computers')]");
    By electronicsPage = By.xpath("//h1[contains(text(),'Electronics')]");
    By apparelPage = By.xpath("//h1[contains(text(),'Apparel')]");
    By digitalDownloadsPage = By.xpath("//h1[contains(text(),'Digital downloads')]");
    By booksPage = By.xpath("//h1[contains(text(),'Books')]");
    By jewelryPage = By.xpath("//h1[contains(text(),'Jewelry')]");
    By giftCardsPage = By.xpath("//h1[contains(text(),'Gift Cards')]");
    By verifyWelcomeMsg = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logOut = By.xpath("//a[contains(text(),'Log out')]");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public void clickOnLogOut() {
        clickOnElement(logOut);
    }

    public void verifyCurrentUrl() {
        String baseUrl = "https://demo.nopcommerce.com/";
    }


    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='header-menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }

    public String verifyComputersText() {
        return getTextFromElement(computersPage);
    }

    public String verifyElectronicsText() {
        return getTextFromElement(electronicsPage);
    }

    public String verifyApparelText() {
        return getTextFromElement(apparelPage);
    }

    public String verifyDigitalDownloadsText() {
        return getTextFromElement(digitalDownloadsPage);
    }

    public String verifyBooksText() {
        return getTextFromElement(booksPage);
    }

    public String verifyJewelryText() {
        return getTextFromElement(jewelryPage);
    }

    public String verifyGiftCardsText() {
        return getTextFromElement(giftCardsPage);
    }

    public String verifyWelcomeToOurStoreMsg() {
        return getTextFromElement(verifyWelcomeMsg);
    }

    public String verifyWelcomMsg() {
        return getTextFromElement(welcomeText);
    }


}


