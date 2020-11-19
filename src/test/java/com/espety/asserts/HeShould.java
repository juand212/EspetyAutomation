package com.espety.asserts;

import com.espety.questions.ValidatePage;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HeShould {

    private ValidatePage validatePage;

    public HeShould(WebDriver driver) {
        validatePage = new ValidatePage(driver);
    }

    public void seeMessageOf(String message) throws InterruptedException {
        assertThat(
                validatePage.currentDialog())
                .withFailMessage("El mensaje obtenido no es el esperado")
                .isEqualTo(message);
        Thread.sleep(2000);
    }

    public void seeTheHomePage() {
        assertThat(validatePage.here()).isTrue();
    }
}
