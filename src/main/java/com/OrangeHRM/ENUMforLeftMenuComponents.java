package com.OrangeHRM;

public enum ENUMforLeftMenuComponents {

    ADMIN("Admin"),
    PIM("PIM"),
    LEAVE("Leave");



    private final String menuName;

    public String getMenuName() {
        return menuName;
    }

    ENUMforLeftMenuComponents(String menuName) {
        this.menuName=menuName;
    }
}
