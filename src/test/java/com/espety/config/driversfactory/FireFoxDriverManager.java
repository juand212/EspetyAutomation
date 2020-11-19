package com.espety.config.driversfactory;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        System.setProperty("webdriver.gecko.driver",
                System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }
}
