package com.OrangeHRM.pages.pagecomponents;

import com.OrangeHRM.ENUMforLeftMenuComponents;
import com.codeborne.selenide.Selectors;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LeftMenuComponent {

    public void selectAMenuFromLeftMenuBar(ENUMforLeftMenuComponents menuType){
        $(byText(menuType.getMenuName())).shouldBe(visible).click();
    }
}
