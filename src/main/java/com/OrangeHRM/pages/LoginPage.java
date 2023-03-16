package com.OrangeHRM.pages;

import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class LoginPage {

    private static final SelenideElement USERNAME = $(byName("username"));
    private static final SelenideElement PASSWORD = $(byAttribute("Placeholder","Password"));
    private static final SelenideElement LOGIN = $("button[type='submit']");

    public HomePage LoginToApplication(){
        USERNAME.shouldBe(visible).setValue("Admin");
        PASSWORD.shouldBe(visible).setValue("admin123");
        LOGIN.shouldBe(enabled).click();
        return new HomePage();
    }



}
