package com.swag.co.steps.shopping;

import com.swag.co.pages.shopping.ShoppingCartPage;
import net.serenitybdd.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {

    @Step("Dar click en checkout")
    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    @Step("Ingresar nombre")
    public void typeFirstName(String firstname){
        txt_firstname.sendKeys(firstname);
    }

    @Step("Ingresar Apellido")
    public void typeLastName(String lastname){
        txt_lastname.sendKeys(lastname);
    }

    @Step("Ingresar codigo postal")
    public void typePostal(String postal){
        txt_postal.sendKeys(postal);
    }

    @Step("Dar click en continuar")
    public void clickContinueButton(){
        continueButton.click();
    }

    @Step("Dar click en finalizar")
    public void clicKFinishButton(){
        finishButton.click();
    }

}
