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

    @And("agrega productos al carrito")
    public void userAddProducts(){
        selectProduct.addProducts(3);
    }

    @And("da click en el icono del carrito")
    public void userClickShoppingCartIcon(){
        selectProduct.clickCartIcon();
    }

    @Then("la aplicacion debería listar los productos seleccionados en el carrito de compras")
    public void systemListProducts(){
        Assert.assertTrue(validate.productListIsDisplayed());
    }

    @Then("la aplicacion deberia mostrar el carrito sin productos")
    public void systemShowEmptyShoppingCart(){
        Assert.assertTrue(validate.shoppingCartIsEmpty());
    }

    @When("completa el registro de la orden")
    public void userCompleteOrder(){
        shoppingCart.clickCheckoutButton();
        shoppingCart.typeFirstName("Jhon");
        shoppingCart.typeLastName("Doe");
        shoppingCart.typePostal("Colombia 53000");
        shoppingCart.clickContinueButton();
        shoppingCart.clicKFinishButton();
    }

    @Then("la aplicacion deberia procesar la compra")
    public void systemProcessShoppingCart(){
        Assert.assertTrue(validate.thankYouMessageIsDisplayed());
    }
}
