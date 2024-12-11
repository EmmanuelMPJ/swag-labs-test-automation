package com.swag.co.steps.products;

import com.swag.co.pages.products.ProductPage;
import io.cucumber.java.bs.A;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductStep extends ProductPage {
    protected List<WebElementFacade> random_products;

    @Step("Agregar productos aleatorios al carrito de compras")
    public void addProducts(int amount){
        List<WebElementFacade> copyProducts = new ArrayList<>(add_product_buttons);
        Collections.shuffle(copyProducts);
        random_products = copyProducts.subList(0, amount);
        for (WebElementFacade product : random_products){
            Actions act = new Actions(getDriver());
            act.click(product).perform();
        }
    }

    @Step("Click en el icono del carrito de compras")
    public void clickCartIcon(){
        cartIcon.click();
    }
}
