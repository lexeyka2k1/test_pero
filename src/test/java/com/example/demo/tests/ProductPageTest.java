package com.example.demo.tests;

import com.example.demo._base.BaseUITest;
import com.example.demo.pages.AuthorisationPage;
import com.example.demo.enums.Link;
import com.example.demo.pages.product.ProductPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductPageTest extends BaseUITest {

    @BeforeEach
    void init() {
        openPage(Link.PRODUCT.url);
    }

    @Test
    @DisplayName("Проверка отображения всех ключевых элементов на странице продукта")
    void productTest() {
        removePopUpWindow();
        new ProductPage()
                .checkTitleContainText("фываф")
                .checkPriceContainText("бесплатно")
                .checkDisclaimerContainText("Перед покупкой уточняйте характеристики и комплектацию у продавца")
                .checkDescriptionContainText("testing product")
                .checkShareContainText("Поделиться");
    }

    @Test //Тут должен быть тест с параметром, но зависимость для него не подключена в проект по умолчанию.
    @DisplayName("Проверка перехода на авторизацию при нажатии на кнопку 'пожаловаться'")
    void productRedirectTest() {
        String authText = "Вход ВКонтакте";
        removePopUpWindow();

        new ProductPage()
                .clickButtonSubSeller();
        new AuthorisationPage()
                .checkAuthText(authText);

        openPage(Link.PRODUCT.url);
        removePopUpWindow();
        new ProductPage()
                .clickButtonReport();
        new AuthorisationPage() // Не работает, потому что при переходе, не отрабатывает redirect на страницу авторизации ВК
                .checkAuthText(authText);
    }
}
