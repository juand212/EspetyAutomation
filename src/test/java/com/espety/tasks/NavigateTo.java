package com.espety.tasks;

import org.openqa.selenium.WebDriver;

public class NavigateTo {

    private final WebDriver driver;

    private final String url = "https://master.d1w4mw42fshzv0.amplifyapp.com/";

    public NavigateTo(WebDriver driver) {
        this.driver = driver;
    }

    public void espetyAcademy() {
        this.driver.get(url);
    }

}

