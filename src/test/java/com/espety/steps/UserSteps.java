package com.espety.steps;

import com.espety.asserts.HeShould;
import com.espety.config.HookDriver;
import com.espety.tasks.Login;
import com.espety.tasks.NavigateTo;
import com.espety.tasks.RegisterUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class UserSteps {

    WebDriver driver = HookDriver.getDriver();
    HeShould heShould = new HeShould(driver);


    @Given("^El Usuario requiere ingresar a Espety Academy$")
    public void navigateToEspetyAcademy() {
        NavigateTo navigateTo = new NavigateTo(driver);
        navigateTo.espetyAcademy();
    }

    @When("^El realiza el registro del estudiante$")
    public void registerStudent(DataTable data) throws InterruptedException {
        RegisterUser registerUser = new RegisterUser(driver);
        registerUser.withInfo(data).save();
    }

    @Then("^El deberia poder utilizar el usuario para iniciar sesión$")
    public void userSaveSuccessful() throws InterruptedException {
        heShould.seeMessageOf("Información guardada correctamente");
    }

    @When("^El ingresa con el usuario (.*) y la contraseña (.*)$")
    public void login(String user, String pass) throws InterruptedException {
        Login login = new Login(driver);
        login.withInfo(user, pass);
    }

    @Then("^El deberia poder ingresar al sistema viendo la pagina de inicio$")
    public void validateLogin() {
        heShould.seeTheHomePage();
    }

    @Then("^El no deberia poder ingresar al sistema$")
    public void validateNotLogin() throws InterruptedException {
        heShould.seeMessageOf("Usuario no se encuentra registrado, validar los datos ingresados");
    }
}
