package com.espety.tasks;

import com.espety.actions.LoginActions;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Login {

    private LoginActions login;

    public Login(WebDriver driver) {
        login = new LoginActions(driver);
    }

    public void withInfo(String email, String pass) throws InterruptedException {
        login.enterEmail(email);
        login.enterPassword(pass);
        login.clickOnLogin();
    }

    public void withInfo(DataTable dataTable) throws InterruptedException {
        List<String> data =dataTable.asList();
        login.enterEmail(data.get(2));
        login.enterPassword(data.get(3));
        login.clickOnLogin();
    }

}
