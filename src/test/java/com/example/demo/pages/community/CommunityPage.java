package com.example.demo.pages.community;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.example.demo._base.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class CommunityPage extends BasePage {

    private SelenideElement buttonDetail = $x("//div[@class='group_info_row more']");
    private SelenideElement buttonBasket = $x("//a[@data-id='165227']");
    private SelenideElement buttonGoods = $x("//li[@data-testid='group_tab_market']");
    private SelenideElement buttonService = $x("//li[@data-testid='group_tab_services']");
    private SelenideElement buttonCardGoods = $x("//div[@data-testid='product_card_picture']");
    private SelenideElement buttonCardService = $x("//div[@data-tab='services']//div[@data-testid='product_card_picture']");
    private SelenideElement buttonShowAllGoods = $x("//div[@data-tab='market']//a[@data-role='show-all']");
    private SelenideElement buttonShowAllService = $x("//a[@data-testid='market_services_tab_show_all_button']");
    private SelenideElement buttonAllPosts = $x("//h2[@id='wall_tabs']//span[contains(text(),'Все посты')]");
    private SelenideElement buttonPostsCommunity = $x("//h2[@id='wall_tabs']//span[contains(text(),'Посты сообщества')]");
    private SelenideElement buttonSearch = $x("//h2[@id='wall_tabs']//a[contains(@class, 'ui_tab_search')]");
    //-----
    private SelenideElement textTitleCommunity = $x("//h1[@class='page_name']");
    private SelenideElement textSearch = $x("//input[contains(@placeholder, 'Введите фразу или слово')]");
    private SelenideElement textTitleDetails = $x("//div[@class='module_header']//span[@class='header_label fl_l']");

    @Step("Нажать на элемент -> 'Подробная информация'")
    public CommunityPage clickDetailButton() {
        buttonDetail.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажать на элемент -> 'Корзина'")
    public CommunityPage clickBasketButton() {
        buttonBasket.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажать на элемент -> 'Товары'")
    public CommunityPage clickGoodsButton() {
        toElem(buttonGoods);
        buttonGoods.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажать на элемент -> 'Карточка товара'")
    public CommunityPage clickCardGoodsButton() {
        toElem(buttonCardGoods);
        buttonCardGoods.should(Condition.visible).click();
        return this;
    }

    @Step("Нажать на элемент -> 'Карточка услуг'")
    public CommunityPage clickCardServiceButton() {
        toElem(buttonCardService);
        buttonCardService.should(Condition.visible).click();
        return this;
    }

    @Step("Нажать на элемент -> 'Сервисы'")
    public CommunityPage clickServiceButton() {
        toElem(buttonService);
        buttonService.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажать на элемент -> 'Показать все товары'")
    public CommunityPage clickShowAllGoodsButton() {
        toElem(buttonShowAllGoods);
        buttonShowAllGoods.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажать на элемент -> 'Показать все услуги'")
    public CommunityPage clickShowAllServiceButton() {
        toElem(buttonShowAllService);
        buttonShowAllService.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Сделать двойной клик на элемент -> 'Все записи'")
    public CommunityPage doubleClickAllPostsButton() {
        toElem(buttonAllPosts);
        buttonAllPosts.shouldBe(Condition.visible).doubleClick();
        return this;
    }

    @Step("Сделать двойной клик на элемент -> 'Записи Сообщества'")
    public CommunityPage doubleClickPostsCommunityButton() {
        toElem(buttonAllPosts);
        buttonPostsCommunity.shouldBe(Condition.visible).doubleClick();
        return this;
    }

    @Step("Нажать на элемент -> 'Найти'")
    public CommunityPage clickSearchButton() {
        toElem(buttonSearch);
        buttonSearch.click();
        return this;
    }

    @Step("Переключить на активную вкладку")
    public CommunityPage redirectAfterClick() {
        switchTab();
        return this;
    }

    @Step("Проверить, что 'Заголовок сообщества' содержит текст - '{0}'")
    public CommunityPage checkTitleCommunityContainText(final String text) {
        checkText(textTitleCommunity, text);
        return this;
    }

    @Step("Проверить, что заполнитель содержит текст - '{0}'")
    public CommunityPage checkSearchContainText(final String text) {
        toElem(textSearch);
        textSearch
                .shouldBe(Condition.visible)
                .shouldHave(Condition.attribute("placeholder", text));
        return this;
    }

    @Step("Проверить, что 'Заголовок подробной информации' содержит текст - '{0}'")
    public CommunityPage checkTitleDetailsText(final String text) {
        checkText(textTitleDetails, text);
        return this;
    }
}





