package com.OrangeHRM.pages;

import com.OrangeHRM.pages.pagecomponents.LeftMenuComponent;

public class HomePage {

    private final LeftMenuComponent LeftMenuComponent;

    public HomePage(){
        this.LeftMenuComponent=new LeftMenuComponent();
    }
    public LeftMenuComponent getLeftMenuComponent() {
        return LeftMenuComponent;
    }


}
