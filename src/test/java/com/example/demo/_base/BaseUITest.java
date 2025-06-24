package com.example.demo._base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseUITest {

    @BeforeAll
    public static void setUpAll() {
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x800";
        Configuration.headless = false;
        Configuration.pageLoadStrategy = "eager";
    }

    @BeforeEach
    public void setUp() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }

    protected void openPage(final String url) {
        Selenide.open(url);
    }

    protected void removePopUpWindow() {
        Selenide.sleep(3000);
        Selenide.actions()
                .sendKeys(Keys.ESCAPE)
                .perform();
    }
}
