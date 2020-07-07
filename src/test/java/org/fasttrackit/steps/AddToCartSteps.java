package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.ProductDetailPage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class AddToCartSteps {
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;
    private ProductDetailPage productDetailPage;


    @Step
    public void goToSearchField() {
        homePage.open();
        homePage.clickOnSearchField();
    }

    @Step
    public void typeProductName(String product) {
        homePage.searchProduct(product);
    }

    @Step
    public void clickSearch() {
        homePage.clickOnSearchButton1();
    }

    @Step
    public void clickOnTheProduct() {
        searchResultsPage.navigateToProduct();
    }

    @Step
    public void verifyProductClicked(String expected) {
        String message = productDetailPage.getProductIndividualDetail("SKU: Woo-tshirt-logo");
        Assert.assertEquals(expected, message);
    }

    @Step
    public void addProductToCart() {
        productDetailPage.setAddToCartButton();
    }

    @Step
    public void verifyAddedToCartMessage(String message){
        productDetailPage.setAddedToCartMessage("“T-Shirt with Logo” has been added to your cart.");
    }

}




