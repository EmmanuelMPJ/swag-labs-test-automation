package com.swag.co.pages.validation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//div[@class='product_label']")
    protected WebElementFacade label_product;

    @FindBy(xpath = "//h3[text()='Username and password do not match any user in this service']")
    protected WebElementFacade error_message;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    protected List<WebElementFacade> products_list;

    @FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")
    protected WebElementFacade thankYouMessage;
}
