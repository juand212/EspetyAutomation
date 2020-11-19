package com.espety.actions;

import com.espety.pagesobject.MenuBarPage;
import org.openqa.selenium.WebDriver;

public class MenuBarActions {

    private MenuBarPage menuBar;

    public MenuBarActions(WebDriver driver) {
        menuBar = new MenuBarPage(driver);
    }

    public void clickOnHome() {
        menuBar.lnkHome.click();
    }

    public void clickOnLogin() {
        menuBar.lnkLogin.click();
    }

    public void clickOnRegister() throws InterruptedException {
        menuBar.lnkRegister.click();
        Thread.sleep(1000);
    }
}
