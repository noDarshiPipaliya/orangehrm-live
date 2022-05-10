package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @FindBy(xpath = "")
    WebElement Admin;

    @FindBy(xpath = "")
    WebElement PIM;

    @FindBy(xpath = "")
    WebElement Leave;

    @FindBy(xpath = "")
    WebElement Dashboard;

    @FindBy(xpath = "")
    WebElement welcometext;

    public void clickonadmin() {
        clickOnElement(Admin);
    }

    public void clickpim() {
        clickOnElement(PIM);
    }

    public void clickleave() {
        clickOnElement(Leave);
    }

    public void clickdashboard() {
        clickOnElement(Dashboard);
    }

    public void getwelcometext() {
        clickOnElement(welcometext);


    }
}
