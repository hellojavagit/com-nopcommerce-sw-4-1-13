package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends TestBase {
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    ElectronicsNokiaPage nokiaLumia =new ElectronicsNokiaPage();
    ShoppingPage shoppingCartPage =new ShoppingPage();
    ConfirmationPage confirmationPage = new ConfirmationPage();
    RegistrationPage registerPage = new RegistrationPage();
    CheckOutPage checkoutPage = new CheckOutPage();
    ConfirmationPage confirmationpage = new ConfirmationPage();
    HomePage homePage=new HomePage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        cellPhonesPage.hoverOnElectronics();
        cellPhonesPage.clickOnCellPhones();
        cellPhonesPage.verifyCellPhonesPageIsDisplayed();
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        cellPhonesPage.hoverOnElectronics();
        cellPhonesPage.clickOnCellPhones();
        cellPhonesPage.verifyCellPhonesPageIsDisplayed();
        cellPhonesPage.clickOnListViewTab();
        cellPhonesPage.clickOnNokia();
        nokiaLumia.verifyNokiaLumiaPage();
        nokiaLumia.verifyPrice();
        nokiaLumia.changeQuantityPhone(Keys.BACK_SPACE + "2");
        nokiaLumia.clickOnAddToCart();
        nokiaLumia.verifyProductHasBeenAdded();
        nokiaLumia.clickOnCrossButton();
        nokiaLumia.hoverToShoppingCart();
        nokiaLumia.clickonGoToCartBtn();
        shoppingCartPage.verifyShoppingCartMSG();
        shoppingCartPage.verifyQuantity();
        shoppingCartPage.verifyTotalPhone();
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckoutBtn();
        homePage.verifyWelcomMsg();
        registerPage.clickOnRegister();
        registerPage.inputFirstName("hi");
        registerPage.inputLastName("Hello");
        registerPage.inputEmail("testing367@gmail.com");
        registerPage.inputPassword("abcd123");
        registerPage.enterConfirmPassword("abcd123");
        registerPage.clickOnRegisterBtn();
        registerPage.verifyRegistrationMsg();
        registerPage.clickOnContinue();
        shoppingCartPage.verifyShoppingCartMSG();
        shoppingCartPage.clickOnTermsOfService();
        shoppingCartPage.clickOnCheckoutBtn();
        checkoutPage.selectCountry("United Kingdom");
        checkoutPage.inputCity("London");
        checkoutPage.inputAddress("TheAvenue");
        checkoutPage.inputPostCode("123456");
        checkoutPage.inputPhoneNumber("1234566787");
        checkoutPage.clickOnContinueBtn();
        checkoutPage.clickOn2ndDayAir();
        checkoutPage.clickOnContinueBtn2();
        checkoutPage.selectPaymentmethod();
        checkoutPage.clickOnContinueBtn3();
        checkoutPage.selectVisaOption("Visa");
        checkoutPage.inputCardHolderName("HI");
        checkoutPage.inputCardNumber("4263982640269299");
        checkoutPage.selectExpiryMonth("February");
        checkoutPage.selectExpiryYear("2023");
        checkoutPage.inputCardCode("123");
        checkoutPage.clickOnContinueBtn4();
        checkoutPage.verifyPaymentMethod();
        checkoutPage.verifyShippingMethod2();
        checkoutPage.verifyTotal2();
        checkoutPage.clickOnConfirmBtn();
        confirmationpage.verifyThankYouMsgIsDisplayed();
        confirmationpage.verifyOrderProcessedMsg();
        confirmationpage.clickOnContinue();
        homePage.verifyWelcomeToOurStoreMsg();
        homePage.clickOnLogOut();
        homePage.verifyCurrentUrl();
    }

}
