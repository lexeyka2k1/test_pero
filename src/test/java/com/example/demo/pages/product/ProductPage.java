package com.example.demo.pages.product;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.example.demo._base.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ProductPage extends BasePage {

    private SelenideElement buttonShare = $x("//button[@data-testid='market_item_page_share']");
    private SelenideElement buttonWrite = $x("//button[@data-testid='market_item_page_primary_button']");
    private SelenideElement buttonBookmarks = $x("//button[@data-testid='market_item_page_actions_opener_button_not_checked']");
    private SelenideElement buttonStore = $x("//button[@data-testid='market_item_page_shop_link']");
    private SelenideElement buttonSubProduct = $x("//button[@data-testid='market_item_page_subscribe_button']");
    private SelenideElement buttonSubSellerInfo = $x("//button[@data-testid='market_item_page_group_subscribe']");
    private SelenideElement buttonReport = $x("//div[@data-testid='market_item_page_report']");

    //-----
    private SelenideElement textTitle = $x("//h1[@data-testid='market_item_page_title']");
    private SelenideElement textPrice = $x("//h2[@data-testid='market_item_page_price']");
    private SelenideElement textDisclaimer = $x("//span[@data-testid='market_item_disclaimer']");
    private SelenideElement textDescription = $x("//div[@data-testid='showmoretext-in']");

    @Step("Нажать на элемент -> 'Поделиться'")
    public ProductPage clickButtonShare() {
        buttonShare.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажать на кнопку 'Написать'")
    public ProductPage clickButtonWrite() {
        buttonWrite.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажатие на кнопку 'Добавить' в закладки")
    public ProductPage clickButtonBookmark() {
        buttonBookmarks.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажатие на кнопку 'Подписаться' в профиле продукта")
    public ProductPage clickButtonSubProduct() {
        buttonSubProduct.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажатие на кнопку 'Пожаловаться' в профиле продукта")
    public ProductPage clickButtonReport() {
        toElem(buttonReport);
        buttonReport.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажатие на кнопку 'Перейти' в магазин")
    public ProductPage clickButtonStore() {
        buttonStore.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажатие на кнопку 'Подписаться' в информации о продавце")
    public ProductPage clickButtonSubSeller() {
        toElem(buttonSubSellerInfo);
        buttonSubSellerInfo.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Проверить, что 'Описание' содержит текст - '{0}'")
    public ProductPage checkDescriptionContainText(final String text) {
        checkText(textDescription, text);
        return this;
    }

    @Step("Проверить, что 'Заголовок' содержит текст - '{0}'")
    public ProductPage checkTitleContainText(final String text) {
        checkText(textTitle, text);
        return this;
    }

    @Step("Проверить, что 'Цена' содержит текст - '{0}'")
    public ProductPage checkPriceContainText(final String text) {
        checkText(textPrice, text);
        return this;
    }

    @Step("Проверить, что 'Предупреждение' содержит текст - '{0}'")
    public ProductPage checkDisclaimerContainText(final String text) {
        checkText(textDisclaimer, text);
        return this;
    }

    @Step("Проверить, что 'Поделиться' содержит текст - '{0}'")
    public ProductPage checkShareContainText(final String text) {
        checkText(buttonShare, text);
        return this;
    }
}

