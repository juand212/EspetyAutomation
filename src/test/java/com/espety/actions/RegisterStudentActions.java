package com.espety.actions;

import com.espety.pagesobject.RegisterStudentPage;
import org.openqa.selenium.WebDriver;

public class RegisterStudentActions {

    private RegisterStudentPage registerStudent;

    public RegisterStudentActions(WebDriver driver) {
        registerStudent = new RegisterStudentPage(driver);
    }

    public void enterName(String name) {
        registerStudent.txtNames.sendKeys(name);
    }

    public void enterLastName(String lastName) {
        registerStudent.txtLastNames.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        registerStudent.txtEmail.sendKeys(email);
    }

    public void enterPassword(String pass) {
        registerStudent.txtPassword.sendKeys(pass);
    }

    public void clickOnSave() {
        registerStudent.btnSave.click();
    }

    public void clickOnCancel() {
        registerStudent.btnCancel.click();
    }

}
