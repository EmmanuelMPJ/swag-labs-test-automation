package com.swag.co.steps.shopping;

import com.swag.co.pages.shopping.ShoppingCartPage;
import net.serenitybdd.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {

    @Step("Click on checkout")
    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    @Step("Enter name")
    public void typeFirstName(String firstname){
        txt_firstname.sendKeys(firstname);
    }

    @Step("Enter lastname")
    public void typeLastName(String lastname){
        txt_lastname.sendKeys(lastname);
    }

    @Step("Enter postal code")
    public void typePostal(String postal){
        txt_postal.sendKeys(postal);
    }

    @Step("Click on continue")
    public void clickContinueButton(){
        continueButton.click();
    }

    @Step("Click on finish")
    public void clicKFinishButton(){
        finishButton.click();
    }

}
