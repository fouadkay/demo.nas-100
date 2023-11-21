package com.Demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChaseSearchPage extends BasePage {



    @FindBy(xpath = "//input[@class='search-results--search__bar--search-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[.='Search']")
    public WebElement searchButtonOnSearchPage;


    @FindBy(xpath = "//a[.='MyCar']")
    public WebElement myCarLink;

    @FindBy(xpath = "//a[.='jay']")
    public WebElement MyDog;





}
