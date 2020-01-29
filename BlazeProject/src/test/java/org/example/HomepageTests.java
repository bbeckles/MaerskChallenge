package org.example;
import org.example.BlazeSite.BlazeSite;
import org.example.BlazeSite.Pages.BlazeHome;
import org.example.SeleniumConfig.SeleniumConfig;
import org.junit.Before;
import org.junit.Test;
public class HomepageTests {

    private static BlazeSite blazeSite;
    private static SeleniumConfig seleniumConfig;
    @Before
    public void setup(){
         seleniumConfig = new SeleniumConfig("chrome", "/Users/tcadmin/Desktop/chromedriver/chromedriver");
        blazeSite = new BlazeSite(seleniumConfig.getDriver());
    }

    @Test
    public void homepagetoFlightForm(){
        blazeSite.blazeHome.goToBlazeHome().clickDepLink().clickDesLink().clickSubmit().clickChooseFlight();
    }


    @Test
    public void critPath(){
        blazeSite.blazeHome.goToBlazeHome();
        blazeSite.blazeHome.clickDepLink();
        blazeSite.blazeHome.clickDesLink();
        seleniumConfig.setImplicitWaitTime(10);
        blazeSite.blazeHome.clickSubmit();
        seleniumConfig.setImplicitWaitTime(10);
        blazeSite.blazeHome.clickChooseFlight();

        blazeSite.blazeDetails.fillInName("John").fillInAddress("my address")
                .fillCity("city").fillState("state").fillZipcode("ziip")
                .fillCardNumber("12345678").fillCardMonth("12")
                .fillCardYear("2000").fillCardName("John Doe")
                .tickRememberMe().submitForm();

    }


}
