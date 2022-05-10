package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends Utility {

@FindBy(xpath = "")
    WebElement dashboaerdtext;

public void dashboardtextlocator(){
    clickOnElement(dashboaerdtext);
}

}
