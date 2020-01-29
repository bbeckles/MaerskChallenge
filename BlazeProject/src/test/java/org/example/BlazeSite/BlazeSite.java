package org.example.BlazeSite;

import org.example.BlazeSite.Pages.BlazeDetails;
import org.example.BlazeSite.Pages.BlazeHome;
import org.openqa.selenium.WebDriver;

public class BlazeSite {

    public WebDriver driver;
    public BlazeDetails blazeDetails;
    public BlazeHome blazeHome;


    public BlazeSite(WebDriver driver) {
        this.driver = driver;
        this.blazeDetails = new BlazeDetails(driver);
        this.blazeHome = new BlazeHome(driver);

    }

    public BlazeHome getBlazeHome() {
        return blazeHome;
    }


    public BlazeDetails getBlazeDetails() {
        return blazeDetails;
    }

}
