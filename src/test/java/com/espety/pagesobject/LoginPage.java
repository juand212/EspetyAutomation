package com.espety.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@ng-reflect-name='Email' and @placeholder='Correo electrónico']")
    public WebElement txtEmail;

    @FindBy(xpath = "//input[@ng-reflect-name='Password' and @placeholder='Contraseña']")
    public WebElement txtPassword;

    @FindBy(xpath = "(//a[contains(text(),'Inicia Sesión')])[2]")
    public WebElement btnLogin;
}
