package com.espety.steps;

import com.espety.api.UserRequest;
import com.espety.asserts.HeShould;
import com.espety.config.HookDriver;
import com.espety.tasks.Login;
import com.espety.tasks.NavigateTo;
import com.espety.tasks.RegisterStudentProfile;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StudentsSteps {

    WebDriver driver = HookDriver.getDriver();
    NavigateTo navigateTo = new NavigateTo(driver);
    Login login = new Login(driver);
    UserRequest userRequest = new UserRequest();
    HeShould heShould = new HeShould(driver);


    @Given("^El estudiante ingresa a la plataforma con un usuario previamente registrado$")
    public void accesToStudentsModuleWithPreviouslyRegisteredUser(DataTable data) throws InterruptedException {
        navigateTo.espetyAcademy();
        userRequest.create(data.asList());
        login.withInfo(data);
    }

    @When("^El realiza el registro de información personal$")
    public void registerPersonalInformation(DataTable data) throws InterruptedException {
        RegisterStudentProfile registerStudentProfile = new RegisterStudentProfile(driver);
        registerStudentProfile.withInfo(data);
    }

    @Then("^El deberia poder visualizar los cursos disponibles$")
    public void seeTheCourses() throws InterruptedException {
        heShould.seeMessageOf("SavedSuccessfully");
    }


}
