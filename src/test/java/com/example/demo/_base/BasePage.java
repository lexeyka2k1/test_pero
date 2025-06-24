package com.example.demo._base;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.ex.UIAssertionError;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BasePage {
    protected void checkText(final SelenideElement selenideElement, String text) {
        toElem(selenideElement);
        selenideElement
                .shouldBe(Condition.visible)
                .shouldBe(Condition.text(text));
    }

    protected void toElem(final SelenideElement element) {
        try {
            element.shouldBe(Condition.visible);
        } catch (UIAssertionError ignored) {}
        element.scrollIntoView("{ block: \"center\", inline: \"nearest\" }");
    }

    protected void switchTab() {
        List<String> tabs = new ArrayList<>(WebDriverRunner.getWebDriver().getWindowHandles());
        WebDriverRunner.getWebDriver().switchTo().window(tabs.get(tabs.size() - 1));
    }
}
