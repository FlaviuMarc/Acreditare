package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class HomePage extends PageObject {

    @FindBy(css = "div[class=\"search-form\"] input[class=\"search-field\"]")
    private WebElementFacade searchField;

    @FindBy( css = ".search-form .searchsubmit" )
    private WebElementFacade searchButton1;





    public void clickOnSearchField() {
        clickOn(searchField);
    }

    public void searchProduct(String product){
    typeInto(searchField, product);
    }

    public void clickOnSearchButton1() {
    clickOn(searchButton1);
    }









}
