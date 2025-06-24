package com.example.demo.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class AuthorisationPage {

    private SelenideElement textQRAuth = $x("//h2[@data-testid='qr_title']");

    @Step("Проверить, что 'Заголовок' содержит текст - '{0}'")
    public AuthorisationPage checkAuthText(final String text) {
        textQRAuth
                .shouldBe(Condition.visible)
                .shouldBe(Condition.text(text));
        return this;
    }
}
