package com.OrangeHRM.pages;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

import com.OrangeHRM.PoJo.EmployeeDetails;
import com.codeborne.selenide.SelenideElement;

public class PIMPage {

    private static final SelenideElement ADD_EMPLOYEE = $(byText("Add Employee"));

    private static final SelenideElement FIRST_NAME = $("[name='firstName']");
    private static final SelenideElement MIDDLE_NAME = $("[name='middleName']");
    private static final SelenideElement LAST_NAME = $("[name='lastName']");
    private static final SelenideElement UPLOAD_PIC = $x("//input[@type='file']");
    private static final SelenideElement SAVE_BUTTON = $("[type='submit']");
    private static final SelenideElement SUCCESS_MESSAGE = $(byText("Success"));

    public PIMPage addNewEmployee(EmployeeDetails employee){
        ADD_EMPLOYEE.shouldBe(visible).click();
        FIRST_NAME.shouldBe(visible).setValue(employee.getFirstName());
        MIDDLE_NAME.shouldBe(visible).setValue(employee.getMiddleName());
        LAST_NAME.shouldBe(visible).setValue(employee.getLastName());
        //UPLOAD_PIC.shouldBe(enabled).uploadFromClasspath("UserProfilePic.jpg");
        SAVE_BUTTON.shouldBe(enabled).click();
        return this;
    }

    public void checkWhetherEmployeeCreatedSuccessfully(){
        SUCCESS_MESSAGE.shouldHave(text("Success"));
        System.out.println("hello printed");

    }
}
