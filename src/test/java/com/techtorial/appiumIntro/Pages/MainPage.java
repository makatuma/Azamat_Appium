package com.techtorial.appiumIntro.Pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(AndroidDriver driver){

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Accessibility\"]")
    public AndroidElement accessibility;


    @AndroidFindBy(xpath = "\t\n" +
            "//android.widget.TextView[@content-desc=\"Animation\"]")
    public AndroidElement animation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"App\"]")
    public AndroidElement app;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Content\"]")
    public AndroidElement content;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Graphics\"]")
    public AndroidElement graphics;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Media\"]")
    public AndroidElement Media;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"NFC\"]")
    public AndroidElement NFC;


    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"OS\"]")
    public AndroidElement OS;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Preference\"]")
    public AndroidElement preference;


    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Text\"]")
    public AndroidElement text;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
    public AndroidElement views;


}
