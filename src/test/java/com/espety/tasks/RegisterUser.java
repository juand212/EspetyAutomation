package com.espety.tasks;

import com.espety.actions.MenuBarActions;
import com.espety.actions.RegisterStudentActions;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterUser {

    private MenuBarActions menuBar;
    private RegisterStudentActions registerStudent;

    public RegisterUser(WebDriver driver) {
        menuBar = new MenuBarActions(driver);
        registerStudent = new RegisterStudentActions(driver);
    }

    public RegisterUser withInfo(DataTable data) throws InterruptedException {
        List<String> user = data.asList();
        menuBar.clickOnRegister();
        registerStudent.enterName(user.get(0));
        registerStudent.enterLastName(user.get(1));
        registerStudent.enterEmail(user.get(2));
        registerStudent.enterPassword(user.get(3));
        return this;
    }

    public void save() {
        registerStudent.clickOnSave();
    }


}
