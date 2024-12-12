package com.swag.co.steps.login;

import com.swag.co.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Enter username")
    public void typeUsername(String username){
        txt_username.waitUntilVisible().sendKeys(username);
    }

    @Step("Enter password")
    public void typePassword(String password){
        txt_password.waitUntilVisible().sendKeys(password);
    }

    @Step("Click on the login button")
    public void clickLogin(){
        login_button.waitUntilVisible().click();
    }

}
