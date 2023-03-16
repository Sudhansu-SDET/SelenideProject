package com.OrangeHRM.pages.tests;

import com.OrangeHRM.ENUMforLeftMenuComponents;
import com.OrangeHRM.PoJo.EmployeeDetails;
import com.OrangeHRM.pages.LoginPage;
import com.OrangeHRM.pages.PIMPage;
import org.junit.jupiter.api.Test;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

class AddEmployeeTest {

    private PodamFactory factory = new PodamFactoryImpl();// podam library to create pojo classes for data driving

    @Test
    void testAddEmployee() throws InterruptedException {
        EmployeeDetails employee = factory.manufacturePojo(EmployeeDetails.class);
        System.out.println(employee);
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        new LoginPage().LoginToApplication().getLeftMenuComponent().selectAMenuFromLeftMenuBar(ENUMforLeftMenuComponents.PIM);

        new PIMPage().addNewEmployee(employee).checkWhetherEmployeeCreatedSuccessfully();

        Thread.sleep(5000);
    }
}
