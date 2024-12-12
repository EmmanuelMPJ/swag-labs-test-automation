package com.swag.co.definitions.shopping;

import com.swag.co.steps.products.ProductStep;
import com.swag.co.steps.shopping.ShoppingCartStep;
import com.swag.co.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class shoppingDef {

    @Steps(shared = true)
    ProductStep selectProduct;

    @Steps(shared = true)
    ValidationStep validate;

    @Steps(shared = true)
    ShoppingCartStep shoppingCart;

    @And("add products to the shopping cart")
    public void userAddProducts(){
        selectProduct.addProducts(3);
    }

    @And("click on the cart icon")
    public void userClickShoppingCartIcon(){
        selectProduct.clickCartIcon();
    }

    @Then("the application should list the selected products in the shopping cart")
    public void systemListProducts(){
        Assert.assertTrue(validate.productListIsDisplayed());
    }

    @Then("the application should display the cart without products")
    public void systemShowEmptyShoppingCart(){
        Assert.assertTrue(validate.shoppingCartIsEmpty());
    }

    @When("complete the order registration")
    public void userCompleteOrder(){
        shoppingCart.clickCheckoutButton();
        shoppingCart.typeFirstName("Jhon");
        shoppingCart.typeLastName("Doe");
        shoppingCart.typePostal("Colombia 53000");
        shoppingCart.clickContinueButton();
        shoppingCart.clicKFinishButton();
    }

    @Then("the application should process the purchase")
    public void systemProcessShoppingCart(){
        Assert.assertTrue(validate.thankYouMessageIsDisplayed());
    }
}
