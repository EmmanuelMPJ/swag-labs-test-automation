package com.swag.co.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class WebSite {
    @Steps(shared = true)
    PageObject swag;

    @Step("Navigate to the website")
    public void navigateTo(String url){
        swag.setDefaultBaseUrl(url);
        swag.open();
    }
}
