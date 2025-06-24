package com.example.demo.pages.community;

import com.codeborne.selenide.SelenideElement;
import com.example.demo._base.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class AllPostsPage extends BasePage {
    private SelenideElement textTitleAllPosts = $x("//div[@data-testid='header']");

    @Step("Проверить, что 'Заголовок' содержит текст - '{0}'")
    public AllPostsPage checkTitleAllPostsText(final String text) {
        checkText(textTitleAllPosts, text);
        return this;
    }
}
