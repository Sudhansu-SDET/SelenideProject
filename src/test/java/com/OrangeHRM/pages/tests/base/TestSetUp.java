package com.OrangeHRM.pages.tests.base;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class TestSetUp {
//@BeforeEach
//    void setUp(){
//        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    }

    @BeforeAll
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

////        // or for fine-tuning:
////        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
////                .screenshots(false)
////                .savePageSource(true)
//        );
    }
}
