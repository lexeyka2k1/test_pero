package com.example.demo.tests;

import com.example.demo._base.BaseUITest;
import com.example.demo.enums.Link;
import com.example.demo.pages.*;
import com.example.demo.pages.community.*;
import com.example.demo.pages.community.CommunityPage;
import com.example.demo.pages.product.ProductPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CommunityPageTest extends BaseUITest {
    @BeforeEach
    void init() {
        openPage(Link.COMMUNITY.url);
    }

    @Test
    @DisplayName("Проверка отображения всех ключевых элементов на странице сообщества")
    void communityTest() {
        removePopUpWindow();
        new CommunityPage()
                .checkTitleCommunityContainText("Test public for test");
    }

    @Test
    @DisplayName("Проверка перехода на страницу подробной информации при нажатии на кнопку 'Подробная информация'")
    void communityRedirectDetailsTest() {
        removePopUpWindow();
        new CommunityPage()
                .clickDetailButton()
                .checkTitleDetailsText("История сообщества");
    }

    @Test
    @DisplayName("Проверка перехода на страницу товара при нажатии на его карточку")
    void communityRedirectGoodsTest() {
        removePopUpWindow();
        new CommunityPage()
                .clickGoodsButton()
                .clickCardGoodsButton()
                .redirectAfterClick();
        new GoodsCardPage()
                .checkTitleGoodsText("Тест");
    }

    @Test
    @DisplayName("Проверка перехода на страницу услуги при нажатии на его карточку")
    void communityRedirectServiceTest() {
        removePopUpWindow();
        new CommunityPage()
                .clickServiceButton()
                .clickCardServiceButton()
                .redirectAfterClick();
        new ProductPage()
                .checkTitleContainText("фываф");
    }

    @Test
    @DisplayName("Проверка перехода на страницу всех товаров при нажатии 'Показать все'")
    void communityRedirectAllGoodsTest() {
        removePopUpWindow();
        new CommunityPage()
                .clickGoodsButton()
                .clickShowAllGoodsButton();
        new AllGoodsPage()
                .checkTitleAllGoodsText("Все товары");
    }

    @Test
    @DisplayName("Проверка перехода на страницу всех услуг при нажатии 'Показать все'")
    void communityRedirectAllServiceTest() {
        removePopUpWindow();
        new CommunityPage()
                .clickServiceButton()
                .clickShowAllServiceButton();
        new AllGoodsPage()
                .checkTitleAllGoodsText("Все услуги");
    }

    @Test
    @DisplayName("Проверка перехода на страницу 'Все посты' при двойном клике на 'Все посты'")
    void communityRedirectAllPostsTest() {
        removePopUpWindow();
        new CommunityPage()
                .doubleClickAllPostsButton();
        new AllPostsPage()
                .checkTitleAllPostsText("Все посты");
    }

    @Test
    @DisplayName("Проверка перехода на страницу 'Посты сообщества' при двойном клике на 'Посты сообщества'")
    void communityRedirectPostsCommunityTest() {
        removePopUpWindow();
        new CommunityPage()
                .doubleClickPostsCommunityButton();
        new PostsCommunityPage()
                .checkTitleAllPostsText("Посты сообщества");
    }

    @Test
    @DisplayName("Проверка появление поисковой строки при нажатии на кнопку 'Найти'")
    void communitySearchTest() {
        removePopUpWindow();
        new CommunityPage()
                .clickSearchButton()
                .checkSearchContainText("Введите фразу или слово");
    }

    @Test
    @DisplayName("Проверка перехода на авторизацию при нажатии на кнопку 'Корзина'")
    void communityRedirectAuthTest() {
        removePopUpWindow();
        new CommunityPage()
                .clickBasketButton();
        new AuthorisationPage() // Не работает, потому что при переходе, не отрабатывает redirect на страницу авторизации ВК
                .checkAuthText("Вход ВКонтакте");
    }
}

