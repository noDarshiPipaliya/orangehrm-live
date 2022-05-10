package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUsersPage extends Utility {

    @FindBy(xpath = "")
    WebElement systemusertext;

    @FindBy(xpath = "")
    WebElement usernamefield;

    @FindBy(xpath = "")
    WebElement userrolldropdown;

    @FindBy(xpath = "")
    WebElement employeenamefield;


}
