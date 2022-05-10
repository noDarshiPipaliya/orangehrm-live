package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement username;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password;

    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginbutton;

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement loginpaneltext;

    public void clickusername() {
        clickOnElement(username);
        sendTextToElement(username, "Admin");
    }

    public void clickpassword() {
        clickOnElement(
                password);
        sendTextToElement(password, "admin123");
    }

    public void clickloginbutton() {
        clickOnElement(loginbutton);
    }

    public void clickloginpaneltext() {
        clickOnElement(loginpaneltext);
    }


}
