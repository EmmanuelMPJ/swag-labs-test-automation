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

    @Step("Add random products to the shopping cart")
    public void addProducts(int amount){
        List<WebElementFacade> copyProducts = new ArrayList<>(add_product_buttons);
        Collections.shuffle(copyProducts);
        random_products = copyProducts.subList(0, amount);
        for (WebElementFacade product : random_products){
            Actions act = new Actions(getDriver());
            act.click(product).perform();
        }
    }

    @Step("Click on the shopping cart icon")
    public void clickCartIcon(){
        cartIcon.click();
    }
}
