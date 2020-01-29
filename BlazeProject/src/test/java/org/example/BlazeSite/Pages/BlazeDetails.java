package org.example.BlazeSite.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlazeDetails {


    private WebDriver driver;
    private By inputName = By.xpath("/html/body/div[2]/form/div[1]/div/input");
    private By inputAddress = By.xpath("/html/body/div[2]/form/div[2]/div/input");
    private By inputCity = By.xpath("/html/body/div[2]/form/div[3]/div/input");
    private By inputState = By.xpath("/html/body/div[2]/form/div[4]/div/input");
    private By inputZipCode = By.xpath("/html/body/div[2]/form/div[5]/div/input");

    private By inputCardNum= By.xpath("/html/body/div[2]/form/div[7]/div/input");
    private By inputCardMonth = By.xpath("/html/body/div[2]/form/div[8]/div/input");
    private By inputCardYear = By.xpath("/html/body/div[2]/form/div[9]/div/input");
    private By inputNameOnCard = By.xpath("/html/body/div[2]/form/div[10]/div/input");
    private By selectRememberMe =By.xpath("/html/body/div[2]/form/div[11]/div/label/input");
    private By submitButton = By.xpath("/html/body/div[2]/form/div[11]/div/input");

    public BlazeDetails(WebDriver driver){
        this.driver = driver;
    }



    public BlazeDetails fillInName(String name){
        driver.findElement(inputName).sendKeys(name);
        return this;
    }

    public BlazeDetails fillInAddress(String address){
        driver.findElement(inputAddress).sendKeys(address);
        return this;
    }

    public BlazeDetails fillCity(String city){
        driver.findElement(inputCity).sendKeys(city);
        return this;
    }

    public BlazeDetails fillState(String state){
        driver.findElement(inputState).sendKeys(state);
        return this;
    }

    public BlazeDetails fillZipcode(String zip){
        driver.findElement(inputZipCode).sendKeys(zip);
        return this;
    }



    public BlazeDetails fillCardNumber(String number){
        driver.findElement(inputCardNum).sendKeys(number);
        return this;
    }
    public BlazeDetails fillCardMonth(String number){
        driver.findElement(inputCardMonth).sendKeys(number);
        return this;
    }
    public BlazeDetails fillCardYear(String number){
        driver.findElement(inputCardYear).sendKeys(number);
        return this;
    }

    public BlazeDetails fillCardName(String name){
        driver.findElement(inputNameOnCard).sendKeys(name);
        return this;
    }

    public BlazeDetails tickRememberMe(){
        driver.findElement(selectRememberMe).click();
        return this;
    }

    public BlazeDetails submitForm(){
        driver.findElement(submitButton).click();
        return this;
    }





}