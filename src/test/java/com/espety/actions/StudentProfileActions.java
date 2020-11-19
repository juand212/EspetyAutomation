package com.espety.actions;

import com.espety.pagesobject.StudentProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class StudentProfileActions {

    private StudentProfilePage studentProfile;
    private WebDriver driver;

    public StudentProfileActions(WebDriver driver) {
        this.driver = driver;
        studentProfile = new StudentProfilePage(driver);
    }

    public void selectAgeRange(String item) {
        new Select(studentProfile.lstAgeRange).selectByValue(item);
    }

//    public void selectAgeRange(String item) {
//        new Select(studentProfile.lstAgeRange).selectByVisibleText(item);
//    }

    public void selectAcademicLevel(String item) {
        new Select(studentProfile.lstAcademicLevel).selectByVisibleText(item);
    }

    public void enterCity(String city) throws InterruptedException {
        studentProfile.txtCity.sendKeys(city);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@role='option']")).click();
    }

    public void clickOnSave() throws InterruptedException {
        studentProfile.btnSave.click();
        Thread.sleep(1000);
    }
}
