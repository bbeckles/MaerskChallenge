package org.example.BlazeSite.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlazeHome {

    private WebDriver driver;
    private String blazeHomeURL = "http://blazedemo.com";
    private By pickDeparture = By.name("fromPort") ;
    private By pickDestination = By.name("toPort");
    private By findFlight = By.xpath("/html/body/div[3]/form/div/input");
    private By chooseFlight = By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input");


    public BlazeHome(WebDriver driver)
    {
        this.driver = driver;
    }


    public BlazeHome goToBlazeHome(){
        driver.navigate().to(blazeHomeURL);
        return this;
    }

    public BlazeHome clickDepLink(){

        driver.findElement(pickDeparture).click();
        return this;
    }

    public BlazeHome clickDesLink(){
        driver.findElement(pickDestination).click();
        return this;
    }



    public BlazeHome clickSubmit(){

        driver.findElement(findFlight).click();
        return this;
    }

    public BlazeHome clickChooseFlight(){
        driver.findElement(chooseFlight).click();
        return this;
    }



}


