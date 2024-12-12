package com.swag.co.definitions.login;

import com.swag.co.steps.login.LoginStep;
import com.swag.co.steps.validations.ValidationStep;
import com.swag.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("the user navigates to the website")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("enter valid credentials")
    public void userLoginWithValidCredentials(){
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();
    }

    @Then("the application should display the main product module")
    public void webSiteShowsProductModulo(){
        Assert.assertTrue(validate.titleIsDisplayed());
    }

    @When("enter invalid credentials")
    public void userLoginWithInvalidCredentials(){
        login.typeUsername("standard_user");
        login.typePassword("1234");
        login.clickLogin();
    }

    @Then("the application should display an error message")
    public void webSiteShowsErrorMessage(){
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
