package com.espety.questions;

import com.espety.pagesobject.GenericsPage;
import com.espety.pagesobject.HomePage;
import org.openqa.selenium.WebDriver;

public class ValidatePage {

    private GenericsPage genericsPage;
    private HomePage homePage;

    public ValidatePage(WebDriver driver) {
        genericsPage = new GenericsPage(driver);
        homePage = new HomePage(driver);
    }

    public String currentDialog() {
        System.out.println(genericsPage.alertDialog.getText());
        return genericsPage.alertDialog.getText();
    }

    public boolean here() {
        return homePage.lblTitle.isDisplayed();
    }

}
