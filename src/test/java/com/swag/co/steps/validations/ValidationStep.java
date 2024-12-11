package com.swag.co.steps.validations;

import com.swag.co.pages.validation.ValidationPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationStep extends ValidationPage {

    @Step("Validar que se muestre el modulo productos")
    public Boolean titleIsDisplayed(){
        return label_product.isDisplayed();
    }

    @Step("Validar que se muestre el mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        return error_message.isDisplayed();
    }

    @Step("Validar los productos listados en el carrito")
    public  Boolean productListIsDisplayed(){
        for (WebElementFacade product : products_list){
            if (product.isDisplayed()){
                return true;
            }
        }
        return false;
    }

    @Step("Validar que el carrito este vacio")
    public Boolean shoppingCartIsEmpty(){
        for (WebElementFacade product:products_list){
            if (!product.isDisplayed()){
                return false;
            }
        }
        return true;
    }

    @Step("Validar finalización de la orden")
    public Boolean thankYouMessageIsDisplayed(){
        return thankYouMessage.isDisplayed();
    }
}
