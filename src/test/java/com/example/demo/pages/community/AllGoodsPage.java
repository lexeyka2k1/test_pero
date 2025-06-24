package com.example.demo.pages.community;

import com.codeborne.selenide.SelenideElement;
import com.example.demo._base.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class AllGoodsPage extends BasePage {
    private SelenideElement textTitleAllGoods = $x("//div[@id='market_list_wrap']//div[@data-testid='header']");

    @Step("Проверить, что 'Заголовок' содержит текст - '{0}'")
    public AllGoodsPage checkTitleAllGoodsText(final String text) {
        checkText(textTitleAllGoods, text);
        return this;
    }
}
