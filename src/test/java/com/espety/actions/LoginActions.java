package com.espety.actions;

import com.espety.pagesobject.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginActions {

    private LoginPage login;

    public LoginActions(WebDriver driver) {
        login = new LoginPage(driver);
    }

    public void enterEmail(String email) {
        login.txtEmail.sendKeys(email);
    }

    public void enterPassword(String pass) {
        login.txtPassword.sendKeys(pass);
    }

    public void clickOnLogin() throws InterruptedException {
        login.btnLogin.click();
        Thread.sleep(1000);
    }
}
