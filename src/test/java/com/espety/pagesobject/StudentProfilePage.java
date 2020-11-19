package com.espety.pagesobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentProfilePage extends BasePage {

    public StudentProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//select[@formcontrolname='agerange']")
    public WebElement lstAgeRange;

    @FindBy(xpath = "//select[@formcontrolname='academiclevelid']")
    public WebElement lstAcademicLevel;

    @FindBy(xpath = "//p-autocomplete/span/input")
    public WebElement txtCity;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement imgPhoto;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement btnSave;

}
