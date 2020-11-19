package com.espety.tasks;

import com.espety.actions.StudentProfileActions;
import com.espety.utils.Convert;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStudentProfile {

    private StudentProfileActions studentProfile;

    public RegisterStudentProfile(WebDriver driver) {
        studentProfile = new StudentProfileActions(driver);
    }

    public void withInfo(DataTable datatable) throws InterruptedException {
        List<String> data = datatable.asList();
        //studentProfile.selectAgeRange("3");
        studentProfile.selectAgeRange(Convert.ageRange(data.get(0)));
        studentProfile.selectAcademicLevel(data.get(1));
        studentProfile.enterCity(data.get(2));
        studentProfile.clickOnSave();
    }
}
