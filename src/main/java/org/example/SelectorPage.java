package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SelectorPage {
    protected WebDriver driver;
    public SelectorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



}
