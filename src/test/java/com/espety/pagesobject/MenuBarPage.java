package com.espety.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuBarPage extends BasePage{

    public MenuBarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//a[contains(text(),'Inicio')])[1]")
    public WebElement lnkHome;

    @FindBy(xpath = "(//a[contains(text(),'Inicia Sesión')])[1]")
    public WebElement lnkLogin;

    @FindBy(xpath = "(//a[contains(text(),'Registrarse')])[1]")
    public WebElement lnkRegister;

}
