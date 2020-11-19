package com.espety.config;

import com.espety.config.driversfactory.DriverManager;
import com.espety.config.driversfactory.DriverManagerFactory;
import com.espety.config.driversfactory.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HookDriver {

    private static WebDriver driver;

    private DriverManager driverManager;

    @Before
    public void setUp() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driverManager.quitDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
