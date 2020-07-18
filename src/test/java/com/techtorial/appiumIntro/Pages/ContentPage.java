package com.techtorial.appiumIntro.Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentPage {

    public ContentPage(AndroidDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @FindBy(xpath = "\t\n" +
            "//android.widget.TextView[@content-desc=\"Assets\"]")
    public AndroidElement assets;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Clipboard\"]")
    public AndroidElement clipBoard;


    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Packages\"]")
    public AndroidElement Packages;



    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Provider\"]")
    public AndroidElement provider;


    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Resources\"]")
    public AndroidElement resources;


    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Storage\"]")
    public AndroidElement storage;


}