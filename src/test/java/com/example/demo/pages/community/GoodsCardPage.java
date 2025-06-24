package com.example.demo.pages.community;

import com.codeborne.selenide.SelenideElement;
import com.example.demo._base.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class GoodsCardPage extends BasePage {

    private SelenideElement textTitleGoods = $x("//h1[@data-testid='market_item_page_title']");

    @Step("Проверить, что 'Заголовок' содержит текст - '{0}'")
    public GoodsCardPage checkTitleGoodsText(final String text) {
        checkText(textTitleGoods, text);
        return this;
    }
}
