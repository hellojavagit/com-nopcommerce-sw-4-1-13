package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ComputerpageTest extends TestBase {
    DeskTopPages desktoppage = new DeskTopPages();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    RegistrationPage registerpage = new RegistrationPage();
    CheckOutPage checkoutPage = new CheckOutPage();
    ConfirmationPage confirmationpage = new ConfirmationPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        desktoppage.navigateToDesktop();
        desktoppage.sortProductsAToZ();
        desktoppage.verifyProductsAToZOrder();
        desktoppage.addToCart();
        buildYourOwnComputerPage.selectCore("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectRam("8GB [+$60.00]");
        buildYourOwnComputerPage.selectHddRadio();
        buildYourOwnComputerPage.selectOsRadio();
        buildYourOwnComputerPage.checkTwoBoxes();
        buildYourOwnComputerPage.verifyPrice();
        buildYourOwnComputerPage.clickOnAddToCartBtn();
        buildYourOwnComputerPage.verifyProductAddedToCart();
        buildYourOwnComputerPage.clickOnCross();
        buildYourOwnComputerPage.clickOnGoToCart();
        shoppingPage.verifyShoppingCartMSG();
        shoppingPage.changeQuantity(Keys.BACK_SPACE + "2");
        shoppingPage.clickOnUpdateCartBtn();
        shoppingPage.verifyTotalPrice();
        shoppingPage.clickOnTermsOfService();
        shoppingPage.clickOnCheckoutBtn();
        homePage.verifyWelcomMsg();
        checkoutPage.clickOnCheckoutAsGuestBtn();
        checkoutPage.inputFirstName("HI");
        checkoutPage.inputLastName("Hello");
        checkoutPage.inputEmail("prime123@gmail.com");
        checkoutPage.selectCountry("United Kingdom");
        checkoutPage.inputCity("London");
        checkoutPage.inputAddress("TheAvenue");
        checkoutPage.inputPostCode("123456");
        checkoutPage.inputPhoneNumber("123456789");
        checkoutPage.clickOnContinueBtn();
        checkoutPage.selectShippingOption();
        checkoutPage.clickOnShippingContinueBtn();
        checkoutPage.selectPaymentmethod();
        checkoutPage.clickOnContinueBtn2();
        checkoutPage.selectCreditCardType("Master card");
        checkoutPage.inputCardHolderName("HI");
        checkoutPage.inputCardNumber("5425233430109903");
        checkoutPage.selectExpiryMonth("MAY");
        checkoutPage.selectExpiryYear("2023");
        checkoutPage.inputCardCode("123");
        checkoutPage.clickOnContinueBtn3();
        checkoutPage.verifyPaymentMethod();
        checkoutPage.verifyShippingMethod();
        checkoutPage.verifyTotal();
        checkoutPage.clickOnConfirmBtn();
        confirmationpage.verifyThankYouMsgIsDisplayed();
        homePage.verifyWelcomeToOurStoreMsg();

    }
}
