package com.example.demo.pages.community;

import com.codeborne.selenide.SelenideElement;
import com.example.demo._base.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class PostsCommunityPage extends BasePage {
    private SelenideElement textTitlePostsCommunity = $x("//div[@data-testid='header']");

    @Step("Проверить, что 'Заголовок' содержит текст - '{0}'")
    public PostsCommunityPage checkTitleAllPostsText(final String text) {
        checkText(textTitlePostsCommunity, text);
        return this;
    }
}
