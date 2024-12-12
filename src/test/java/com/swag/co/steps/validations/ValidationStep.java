package com.swag.co.steps.validations;

import com.swag.co.pages.validation.ValidationPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationStep extends ValidationPage {

    @Step("Validate that the product module is displayed")
    public Boolean titleIsDisplayed(){
        return label_product.isDisplayed();
    }

    @Step("Validate that the error message is displayed")
    public Boolean errorMessageIsDisplayed(){
        return error_message.isDisplayed();
    }

    @Step("Validate the products listed in the shopping cart")
    public  Boolean productListIsDisplayed(){
        for (WebElementFacade product : products_list){
            if (product.isDisplayed()){
                return true;
            }
        }
        return false;
    }

    @Step("Validate that the cart is empty")
    public Boolean shoppingCartIsEmpty(){
        for (WebElementFacade product:products_list){
            if (!product.isDisplayed()){
                return false;
            }
        }
        return true;
    }

    @Step("Validate the order completion")
    public Boolean thankYouMessageIsDisplayed(){
        return thankYouMessage.isDisplayed();
    }
}
