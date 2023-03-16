package com.OrangeHRM.PoJo;


import lombok.Data;

@Data
public class EmployeeDetails {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    private String middleName;
    private String lastName;

}
