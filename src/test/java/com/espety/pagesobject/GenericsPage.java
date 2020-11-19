package com.espety.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GenericsPage extends BasePage{

    public GenericsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@role='alertdialog']")
    public WebElement alertDialog;
}
