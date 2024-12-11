package com.swag.co.pages.products;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ProductPage extends PageObject {
    @FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
    protected List<WebElementFacade> add_product_buttons;

    @FindBy(xpath = "//*[local-name()='svg']//ancestor::a")
    protected WebElementFacade cartIcon;
}
