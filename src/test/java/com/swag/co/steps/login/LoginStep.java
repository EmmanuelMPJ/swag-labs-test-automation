package com.swag.co.steps.login;

import com.swag.co.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Ingresar nombre de usuario")
    public void typeUsername(String username){
        if (txt_username == null) {
            System.out.println("El elemento txt_username es null. Verifica el mapeo o inicialización.");
        }
        txt_username.waitUntilVisible().sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.waitUntilVisible().sendKeys(password);
    }

    @Step("Hacer click en el boton de login")
    public void clickLogin(){
        login_button.waitUntilVisible().click();
    }

}
