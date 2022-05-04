package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.utility.Utility;
import org.testng.annotations.Test;

public class TopMenuTest extends Utility {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserNavigatesToComputersPage() {
        homePage.selectMenu("Computers");
        homePage.verifyComputersText();
    }

    @Test
    public void verifyUserNavigatesToElectronicsPage() {
        homePage.selectMenu("Electronics");
        homePage.verifyElectronicsText();
    }

    @Test
    public void verifyUserNavigatesToApparelPage() {
        homePage.selectMenu("Apparel");
        homePage.verifyApparelText();
    }

    @Test
    public void verifyUserNavigatesToDigitalDownloadsPage() {
        homePage.selectMenu("Digital Downloads");
        homePage.verifyDigitalDownloadsText();
    }

    @Test
    public void verifyUserNavigatesToBooksPage() {
        homePage.selectMenu("Books");
        homePage.verifyBooksText();
    }

    @Test
    public void verifyUserNavigatesToJewelryPage() {
        homePage.selectMenu("Jewelry");
        homePage.verifyJewelryText();
    }

    @Test
    public void verifyUserNavigatesToGiftCardsPage() {
        homePage.selectMenu("Gift Cards");
        homePage.verifyGiftCardsText();
    }

}
