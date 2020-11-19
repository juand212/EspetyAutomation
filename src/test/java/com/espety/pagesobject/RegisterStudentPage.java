package com.espety.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterStudentPage extends BasePage{

    public RegisterStudentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[contains(text(),'Nombres')]/parent::div/div/input")
    public WebElement txtNames;

    @FindBy(xpath = "//label[contains(text(),'Apellidos')]/parent::div/div/input")
    public WebElement txtLastNames;

    @FindBy(xpath = "//label[contains(text(),'Correo')]/parent::div/div/input")
    public WebElement txtEmail;

    @FindBy(xpath = "//label[contains(text(),'Contraseña')]/parent::div/div/input")
    public WebElement txtPassword;

    @FindBy(xpath = "//button[contains(text(),'Guardar')]")
    public WebElement btnSave;

    @FindBy(xpath = "//button[contains(text(),'Cancelar')]")
    public WebElement btnCancel;
}
