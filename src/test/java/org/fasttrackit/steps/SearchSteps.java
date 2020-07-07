package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;


public class SearchSteps {
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;


    @Step
    public void goToSearchField() {
        homePage.open();
        homePage.clickOnSearchField();
    }
    @Step
    public void typeProductName(String product){
        homePage.searchProduct(product);
    }
    @Step
    public void clickSearch(){
        homePage.clickOnSearchButton1();
    }
    @Step
    public void verifySearchResults(String expected){
        String message = searchResultsPage.getMultipleResultsPage();
        Assert.assertEquals(expected, message);
    }

}