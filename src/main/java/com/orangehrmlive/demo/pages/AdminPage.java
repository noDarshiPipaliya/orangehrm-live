package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {

    @FindBy(xpath = "")
    WebElement userManagement;

    @FindBy(xpath = "")
    WebElement organizations;

    @FindBy(xpath = "")
    WebElement job;

    public void clickusermanagement(){
        clickOnElement(userManagement);
    }
    public void clickorganizations(){
        clickOnElement(organizations);
    }
    public void clickjob(){
        clickOnElement(job);
    }

}
