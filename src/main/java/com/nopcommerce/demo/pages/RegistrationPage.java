package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegistrationPage extends Utility {
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By emailField = By.xpath("//input[@id='Email']");
    By enterPassword = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton=By.xpath("//button[@id='register-button']");
    By verifyRegisterMsg =By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueBtn =By.xpath("//a[contains(text(),'Continue')]");
    By registerBtn =By.xpath("//button[contains(text(),'Register')]");



    public void inputFirstName(String fname)

    {
        sendTextToElement(firstName,fname);
    }

    public void inputLastName(String lName)
    {
        sendTextToElement(lastName, lName);
    }

    public void inputEmail(String email)
    {
        sendTextToElement(emailField, email);
    }
    public void inputPassword(String password){
        sendTextToElement(enterPassword,password);
    }
    public void enterConfirmPassword(String confPassword)
    {
        sendTextToElement(confirmPassword,confPassword);
    }

    public void clickOnRegisterBtn(){
        clickOnElement(registerButton);
    }
    public String verifyRegistrationMsg(){
        return getTextFromElement(verifyRegisterMsg);
    }
    public void clickOnContinue(){
        clickOnElement(continueBtn);
    }
    public void clickOnRegister(){
        clickOnElement(registerBtn);
    }


}
